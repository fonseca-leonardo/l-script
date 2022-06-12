grammar tok;

@header {
    import java.util.*;
	import java.util.Stack;
	import java.util.ArrayList;
}

@members {
    private int _tipoVar;
	private String _nomeVar;
	private String _valorVar;

    private String _expressaoID;
	private String _exprContent;
    
    private String _leituraID;

    private String _escritaID;

    private String _expressaoDecisao;


	private ArrayList<AbstractCommand> curThread;
    private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
    private Simbolo simbolo;
    private Programa programa = new Programa();
    InicioFim inicioFim = new InicioFim();
    TabelaSimbolo tabelaSimbolo = new TabelaSimbolo();

    private ArrayList<AbstractCommand> comandosTrue;
	private ArrayList<AbstractCommand> comandosFalse;

    private String _repeteQuantidade;
    private String _repeteContador;
    private ArrayList<AbstractCommand> comandosRepete;

    private String _expressaoEnquanto;
    private ArrayList<AbstractCommand> comandosEnquanto;

    public void verificaVariavelExiste(String id) {
        if (!tabelaSimbolo.existe(id)) {
            throw new ErrorCompilador("Simbolo " + id + " nao declarado");
        }
    }

}

start:
	'inicio' decl bloco 'fim;' {
    programa.setTabelaSimbolo(tabelaSimbolo);
    programa.setComandos(stack.pop());
    programa.generateTarget();
};

decl: (declaraVar)+;

bloco:
	{
    curThread = new ArrayList<AbstractCommand>();
    stack.push(curThread);
} (cmd)+;

declaraVar:
	tipo ID {
    _nomeVar = _input.LT(-1).getText();
    _valorVar = null;
    simbolo = new Variaveis(_nomeVar, _tipoVar, _valorVar);
    if (!tabelaSimbolo.existe(_nomeVar)) {
        tabelaSimbolo.adiciona(simbolo);
    } else {
        throw new ErrorCompilador("Simbolo " + _nomeVar + " já declarado");
    }
} (
		VIR ID {
    _nomeVar = _input.LT(-1).getText();
    _valorVar = null;
    simbolo = new Variaveis(_nomeVar, _tipoVar, _valorVar);
    if (!tabelaSimbolo.existe(_nomeVar)) {
        tabelaSimbolo.adiciona(simbolo);
    } else {
        throw new ErrorCompilador("Simbolo " + _nomeVar + " já declarado");
    }
}
	)* ';';

tipo:
	'num' {_tipoVar = Variaveis.NUMBER;}
	| 'binario' {_tipoVar = Variaveis.BOOL;}
	| 'txt' {_tipoVar = Variaveis.STRING;};

cmd:
	cmdattrib
	| cmdleitura
	| cmdescrita
	| cmdselecao
	| cmdrepete
	| cmdenquanto;

cmdattrib:
	ID {
    verificaVariavelExiste(_input.LT(-1).getText());
    _expressaoID = _input.LT(-1).getText();
} ATT {  _exprContent = ""; } expressao ';' {
    ComandoAtribuicao comando = new ComandoAtribuicao(_expressaoID, _exprContent);
    stack.peek().add(comando);
};

expressao:
	termo (OP {_exprContent += _input.LT(-1).getText();} termo)*;

termo:
	ID {
        verificaVariavelExiste(_input.LT(-1).getText());
        _exprContent += _input.LT(-1).getText();
    }
	| NUM {
        _exprContent += _input.LT(-1).getText();
    }
	| STR {
        _exprContent += _input.LT(-1).getText();
    }
	| BOOL {
        _exprContent += _input.LT(-1).getText();
    };

cmdleitura:
	'ler' AP ID {
    verificaVariavelExiste(_input.LT(-1).getText());
    _leituraID = _input.LT(-1).getText();
} FP ';' {
    Variaveis var = (Variaveis)tabelaSimbolo.get(_leituraID);
    ComandoLeitura comando = new ComandoLeitura(_leituraID, var);
    stack.peek().add(comando);
};

cmdescrita:
	'imprimir' AP (
		ID {
    verificaVariavelExiste(_input.LT(-1).getText());
    _escritaID = _input.LT(-1).getText();

    }
		| STR {
        _escritaID = _input.LT(-1).getText();
    }
	) FP ';' {
    ComandoEscrita comando = new ComandoEscrita(_escritaID);
    stack.peek().add(comando);
};

cmdselecao:
	'caso' AP ID {
            comandosFalse = new ArrayList<AbstractCommand>();
            _expressaoDecisao = _input.LT(-1).getText();
        } OPREL { _expressaoDecisao += _input.LT(-1).getText();  
		} (ID | NUM | STR | BOOL) {_expressaoDecisao += _input.LT(-1).getText(); } FP ACH {
            curThread = new ArrayList<AbstractCommand>();
            stack.push(curThread);
        } (cmd)+ FCH {
            comandosTrue = stack.pop();
        } (
		'caso contrario' ACH {
            curThread = new ArrayList<AbstractCommand>();
            stack.push(curThread);
        } (cmd)+ FCH {
            comandosFalse = stack.pop();
        }
	)? {
        ComandoDecisao comando = new ComandoDecisao(_expressaoDecisao, comandosTrue, comandosFalse);
        stack.peek().add(comando);
    };

cmdrepete:
	'repete' AP NUM { _repeteQuantidade = _input.LT(-1).getText(); } VIR ID {
        _nomeVar = _input.LT(-1).getText();
        _valorVar = null;
        simbolo = new Variaveis(_nomeVar, Variaveis.NUMBER, _valorVar);
        if (!tabelaSimbolo.existe(_nomeVar)) {
            tabelaSimbolo.adiciona(simbolo);
        } else {
            throw new ErrorCompilador("Simbolo " + _nomeVar + " já declarado");
        }
        _repeteContador = _nomeVar;
    } FP ACH {
        curThread = new ArrayList<AbstractCommand>();
        stack.push(curThread);
    } (cmd)+ FCH {
        comandosRepete = stack.pop();

        ComandoRepete comando = new ComandoRepete(_repeteQuantidade, _repeteContador, comandosRepete);
        stack.peek().add(comando);
    };

cmdenquanto:
	'enquanto' AP ID {
        _expressaoEnquanto = _input.LT(-1).getText();
    } OPREL {
        _expressaoEnquanto += _input.LT(-1).getText();

    } (ID | NUM | STR | BOOL) {
        _expressaoEnquanto += _input.LT(-1).getText();
    } FP ACH {
        curThread = new ArrayList<AbstractCommand>();
        stack.push(curThread);
    } (cmd)+ FCH {
        comandosEnquanto = stack.pop();
        ComandoEnquanto comando = new ComandoEnquanto(_expressaoEnquanto, comandosEnquanto);
        stack.peek().add(comando);
    };

AP: '(';
FP: ')';

ACH: '{';
FCH: '}';

STR: '"' ([a-z] | [A-Z] | [0-9] | ' ' | '?' | '/' | '\\')* '"';
NUM: ([0-9])+ ('.' [0-9]+)?;
BOOL: 'true' | 'false';

OP: '+' | '-' | '*' | '/';
OPREL: '>' | '<' | '>=' | '<=' | '==' | '!=';
ATT: ':=';
VIR: ',';

ID: [a-z] ([a-z] | [A-Z] | [0-9])*;

WS: [ \t\r\n]+ -> skip;