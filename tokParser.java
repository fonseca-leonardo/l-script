// Generated from tok.g4 by ANTLR 4.9.3

    import java.util.*;
	import java.util.Stack;
	import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tokParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, AP=13, FP=14, ACH=15, FCH=16, STR=17, NUM=18, 
		BOOL=19, OP=20, OPREL=21, ATT=22, VIR=23, ID=24, WS=25;
	public static final int
		RULE_start = 0, RULE_decl = 1, RULE_bloco = 2, RULE_declaraVar = 3, RULE_tipo = 4, 
		RULE_cmd = 5, RULE_cmdattrib = 6, RULE_expressao = 7, RULE_termo = 8, 
		RULE_cmdleitura = 9, RULE_cmdescrita = 10, RULE_cmdselecao = 11, RULE_cmdrepete = 12, 
		RULE_cmdenquanto = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "decl", "bloco", "declaraVar", "tipo", "cmd", "cmdattrib", "expressao", 
			"termo", "cmdleitura", "cmdescrita", "cmdselecao", "cmdrepete", "cmdenquanto"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'fim;'", "';'", "'num'", "'binario'", "'txt'", "'ler'", 
			"'imprimir'", "'caso'", "'caso contrario'", "'repete'", "'enquanto'", 
			"'('", "')'", "'{'", "'}'", null, null, null, null, null, "':='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "AP", "FP", "ACH", "FCH", "STR", "NUM", "BOOL", "OP", "OPREL", 
			"ATT", "VIR", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "tok.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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


	public tokParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(29);
			decl();
			setState(30);
			bloco();
			setState(31);
			match(T__1);

			    programa.setTabelaSimbolo(tabelaSimbolo);
			    programa.setComandos(stack.pop());
			    programa.generateTarget();

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public List<DeclaraVarContext> declaraVar() {
			return getRuleContexts(DeclaraVarContext.class);
		}
		public DeclaraVarContext declaraVar(int i) {
			return getRuleContext(DeclaraVarContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				declaraVar();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			    curThread = new ArrayList<AbstractCommand>();
			    stack.push(curThread);

			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				cmd();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaraVarContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(tokParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(tokParser.ID, i);
		}
		public List<TerminalNode> VIR() { return getTokens(tokParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(tokParser.VIR, i);
		}
		public DeclaraVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterDeclaraVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitDeclaraVar(this);
		}
	}

	public final DeclaraVarContext declaraVar() throws RecognitionException {
		DeclaraVarContext _localctx = new DeclaraVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaraVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			tipo();
			setState(46);
			match(ID);

			    _nomeVar = _input.LT(-1).getText();
			    _valorVar = null;
			    simbolo = new Variaveis(_nomeVar, _tipoVar, _valorVar);
			    if (!tabelaSimbolo.existe(_nomeVar)) {
			        tabelaSimbolo.adiciona(simbolo);
			    } else {
			        throw new ErrorCompilador("Simbolo " + _nomeVar + " já declarado");
			    }

			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(48);
				match(VIR);
				setState(49);
				match(ID);

				    _nomeVar = _input.LT(-1).getText();
				    _valorVar = null;
				    simbolo = new Variaveis(_nomeVar, _tipoVar, _valorVar);
				    if (!tabelaSimbolo.existe(_nomeVar)) {
				        tabelaSimbolo.adiciona(simbolo);
				    } else {
				        throw new ErrorCompilador("Simbolo " + _nomeVar + " já declarado");
				    }

				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(T__3);
				_tipoVar = Variaveis.NUMBER;
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(T__4);
				_tipoVar = Variaveis.BOOL;
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(T__5);
				_tipoVar = Variaveis.STRING;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdattribContext cmdattrib() {
			return getRuleContext(CmdattribContext.class,0);
		}
		public CmdleituraContext cmdleitura() {
			return getRuleContext(CmdleituraContext.class,0);
		}
		public CmdescritaContext cmdescrita() {
			return getRuleContext(CmdescritaContext.class,0);
		}
		public CmdselecaoContext cmdselecao() {
			return getRuleContext(CmdselecaoContext.class,0);
		}
		public CmdrepeteContext cmdrepete() {
			return getRuleContext(CmdrepeteContext.class,0);
		}
		public CmdenquantoContext cmdenquanto() {
			return getRuleContext(CmdenquantoContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				cmdattrib();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				cmdleitura();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				cmdescrita();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				cmdselecao();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				cmdrepete();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				cmdenquanto();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdattribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tokParser.ID, 0); }
		public TerminalNode ATT() { return getToken(tokParser.ATT, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdattribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdattrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterCmdattrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitCmdattrib(this);
		}
	}

	public final CmdattribContext cmdattrib() throws RecognitionException {
		CmdattribContext _localctx = new CmdattribContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(ID);

			    verificaVariavelExiste(_input.LT(-1).getText());
			    _expressaoID = _input.LT(-1).getText();

			setState(76);
			match(ATT);
			  _exprContent = ""; 
			setState(78);
			expressao();
			setState(79);
			match(T__2);

			    ComandoAtribuicao comando = new ComandoAtribuicao(_expressaoID, _exprContent);
			    stack.peek().add(comando);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(tokParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(tokParser.OP, i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			termo();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(83);
				match(OP);
				_exprContent += _input.LT(-1).getText();
				setState(85);
				termo();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tokParser.ID, 0); }
		public TerminalNode NUM() { return getToken(tokParser.NUM, 0); }
		public TerminalNode STR() { return getToken(tokParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(tokParser.BOOL, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_termo);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(ID);

				        verificaVariavelExiste(_input.LT(-1).getText());
				        _exprContent += _input.LT(-1).getText();
				    
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(NUM);

				        _exprContent += _input.LT(-1).getText();
				    
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(STR);

				        _exprContent += _input.LT(-1).getText();
				    
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(BOOL);

				        _exprContent += _input.LT(-1).getText();
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdleituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(tokParser.AP, 0); }
		public TerminalNode ID() { return getToken(tokParser.ID, 0); }
		public TerminalNode FP() { return getToken(tokParser.FP, 0); }
		public CmdleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdleitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterCmdleitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitCmdleitura(this);
		}
	}

	public final CmdleituraContext cmdleitura() throws RecognitionException {
		CmdleituraContext _localctx = new CmdleituraContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__6);
			setState(102);
			match(AP);
			setState(103);
			match(ID);

			    verificaVariavelExiste(_input.LT(-1).getText());
			    _leituraID = _input.LT(-1).getText();

			setState(105);
			match(FP);
			setState(106);
			match(T__2);

			    Variaveis var = (Variaveis)tabelaSimbolo.get(_leituraID);
			    ComandoLeitura comando = new ComandoLeitura(_leituraID, var);
			    stack.peek().add(comando);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdescritaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(tokParser.AP, 0); }
		public TerminalNode FP() { return getToken(tokParser.FP, 0); }
		public TerminalNode ID() { return getToken(tokParser.ID, 0); }
		public TerminalNode STR() { return getToken(tokParser.STR, 0); }
		public CmdescritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdescrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterCmdescrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitCmdescrita(this);
		}
	}

	public final CmdescritaContext cmdescrita() throws RecognitionException {
		CmdescritaContext _localctx = new CmdescritaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdescrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__7);
			setState(110);
			match(AP);
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(111);
				match(ID);

				    verificaVariavelExiste(_input.LT(-1).getText());
				    _escritaID = _input.LT(-1).getText();

				    
				}
				break;
			case STR:
				{
				setState(113);
				match(STR);

				        _escritaID = _input.LT(-1).getText();
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(117);
			match(FP);
			setState(118);
			match(T__2);

			    ComandoEscrita comando = new ComandoEscrita(_escritaID);
			    stack.peek().add(comando);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdselecaoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(tokParser.AP, 0); }
		public List<TerminalNode> ID() { return getTokens(tokParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(tokParser.ID, i);
		}
		public TerminalNode OPREL() { return getToken(tokParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(tokParser.FP, 0); }
		public List<TerminalNode> ACH() { return getTokens(tokParser.ACH); }
		public TerminalNode ACH(int i) {
			return getToken(tokParser.ACH, i);
		}
		public List<TerminalNode> FCH() { return getTokens(tokParser.FCH); }
		public TerminalNode FCH(int i) {
			return getToken(tokParser.FCH, i);
		}
		public TerminalNode NUM() { return getToken(tokParser.NUM, 0); }
		public TerminalNode STR() { return getToken(tokParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(tokParser.BOOL, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdselecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdselecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterCmdselecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitCmdselecao(this);
		}
	}

	public final CmdselecaoContext cmdselecao() throws RecognitionException {
		CmdselecaoContext _localctx = new CmdselecaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdselecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__8);
			setState(122);
			match(AP);
			setState(123);
			match(ID);

			            comandosFalse = new ArrayList<AbstractCommand>();
			            _expressaoDecisao = _input.LT(-1).getText();
			        
			setState(125);
			match(OPREL);
			 _expressaoDecisao += _input.LT(-1).getText();  
					
			setState(127);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STR) | (1L << NUM) | (1L << BOOL) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_expressaoDecisao += _input.LT(-1).getText(); 
			setState(129);
			match(FP);
			setState(130);
			match(ACH);

			            curThread = new ArrayList<AbstractCommand>();
			            stack.push(curThread);
			        
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				cmd();
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
			setState(137);
			match(FCH);

			            comandosTrue = stack.pop();
			        
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(139);
				match(T__9);
				setState(140);
				match(ACH);

				            curThread = new ArrayList<AbstractCommand>();
				            stack.push(curThread);
				        
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(142);
					cmd();
					}
					}
					setState(145); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
				setState(147);
				match(FCH);

				            comandosFalse = stack.pop();
				        
				}
			}


			        ComandoDecisao comando = new ComandoDecisao(_expressaoDecisao, comandosTrue, comandosFalse);
			        stack.peek().add(comando);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdrepeteContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(tokParser.AP, 0); }
		public TerminalNode NUM() { return getToken(tokParser.NUM, 0); }
		public TerminalNode VIR() { return getToken(tokParser.VIR, 0); }
		public TerminalNode ID() { return getToken(tokParser.ID, 0); }
		public TerminalNode FP() { return getToken(tokParser.FP, 0); }
		public TerminalNode ACH() { return getToken(tokParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(tokParser.FCH, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdrepeteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdrepete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterCmdrepete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitCmdrepete(this);
		}
	}

	public final CmdrepeteContext cmdrepete() throws RecognitionException {
		CmdrepeteContext _localctx = new CmdrepeteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdrepete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__10);
			setState(155);
			match(AP);
			setState(156);
			match(NUM);
			 _repeteQuantidade = _input.LT(-1).getText(); 
			setState(158);
			match(VIR);
			setState(159);
			match(ID);

			        _nomeVar = _input.LT(-1).getText();
			        _valorVar = null;
			        simbolo = new Variaveis(_nomeVar, Variaveis.NUMBER, _valorVar);
			        if (!tabelaSimbolo.existe(_nomeVar)) {
			            tabelaSimbolo.adiciona(simbolo);
			        } else {
			            throw new ErrorCompilador("Simbolo " + _nomeVar + " já declarado");
			        }
			        _repeteContador = _nomeVar;
			    
			setState(161);
			match(FP);
			setState(162);
			match(ACH);

			        curThread = new ArrayList<AbstractCommand>();
			        stack.push(curThread);
			    
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				cmd();
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
			setState(169);
			match(FCH);

			        comandosRepete = stack.pop();

			        ComandoRepete comando = new ComandoRepete(_repeteQuantidade, _repeteContador, comandosRepete);
			        stack.peek().add(comando);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdenquantoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(tokParser.AP, 0); }
		public List<TerminalNode> ID() { return getTokens(tokParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(tokParser.ID, i);
		}
		public TerminalNode OPREL() { return getToken(tokParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(tokParser.FP, 0); }
		public TerminalNode ACH() { return getToken(tokParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(tokParser.FCH, 0); }
		public TerminalNode NUM() { return getToken(tokParser.NUM, 0); }
		public TerminalNode STR() { return getToken(tokParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(tokParser.BOOL, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdenquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdenquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterCmdenquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitCmdenquanto(this);
		}
	}

	public final CmdenquantoContext cmdenquanto() throws RecognitionException {
		CmdenquantoContext _localctx = new CmdenquantoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cmdenquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__11);
			setState(173);
			match(AP);
			setState(174);
			match(ID);

			        _expressaoEnquanto = _input.LT(-1).getText();
			    
			setState(176);
			match(OPREL);

			        _expressaoEnquanto += _input.LT(-1).getText();

			    
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STR) | (1L << NUM) | (1L << BOOL) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

			        _expressaoEnquanto += _input.LT(-1).getText();
			    
			setState(180);
			match(FP);
			setState(181);
			match(ACH);

			        curThread = new ArrayList<AbstractCommand>();
			        stack.push(curThread);
			    
			setState(184); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(183);
				cmd();
				}
				}
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
			setState(188);
			match(FCH);

			        comandosEnquanto = stack.pop();
			        ComandoEnquanto comando = new ComandoEnquanto(_expressaoEnquanto, comandosEnquanto);
			        stack.peek().add(comando);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00c2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\6\3&\n\3\r\3\16\3\'\3\4\3\4\6\4,\n\4\r\4\16\4-\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5\66\n\5\f\5\16\59\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6C\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7K\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\7\tY\n\t\f\t\16\t\\\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\nf\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\fv\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\6\r\u0088\n\r\r\r\16\r\u0089\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u0092"+
		"\n\r\r\r\16\r\u0093\3\r\3\r\3\r\5\r\u0099\n\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u00a8\n\16\r\16\16\16\u00a9"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\6\17\u00bb\n\17\r\17\16\17\u00bc\3\17\3\17\3\17\3\17\2\2\20\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\2\3\4\2\23\25\32\32\2\u00c7\2\36\3\2"+
		"\2\2\4%\3\2\2\2\6)\3\2\2\2\b/\3\2\2\2\nB\3\2\2\2\fJ\3\2\2\2\16L\3\2\2"+
		"\2\20T\3\2\2\2\22e\3\2\2\2\24g\3\2\2\2\26o\3\2\2\2\30{\3\2\2\2\32\u009c"+
		"\3\2\2\2\34\u00ae\3\2\2\2\36\37\7\3\2\2\37 \5\4\3\2 !\5\6\4\2!\"\7\4\2"+
		"\2\"#\b\2\1\2#\3\3\2\2\2$&\5\b\5\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'("+
		"\3\2\2\2(\5\3\2\2\2)+\b\4\1\2*,\5\f\7\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2"+
		"-.\3\2\2\2.\7\3\2\2\2/\60\5\n\6\2\60\61\7\32\2\2\61\67\b\5\1\2\62\63\7"+
		"\31\2\2\63\64\7\32\2\2\64\66\b\5\1\2\65\62\3\2\2\2\669\3\2\2\2\67\65\3"+
		"\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\5\2\2;\t\3\2\2\2<=\7\6\2"+
		"\2=C\b\6\1\2>?\7\7\2\2?C\b\6\1\2@A\7\b\2\2AC\b\6\1\2B<\3\2\2\2B>\3\2\2"+
		"\2B@\3\2\2\2C\13\3\2\2\2DK\5\16\b\2EK\5\24\13\2FK\5\26\f\2GK\5\30\r\2"+
		"HK\5\32\16\2IK\5\34\17\2JD\3\2\2\2JE\3\2\2\2JF\3\2\2\2JG\3\2\2\2JH\3\2"+
		"\2\2JI\3\2\2\2K\r\3\2\2\2LM\7\32\2\2MN\b\b\1\2NO\7\30\2\2OP\b\b\1\2PQ"+
		"\5\20\t\2QR\7\5\2\2RS\b\b\1\2S\17\3\2\2\2TZ\5\22\n\2UV\7\26\2\2VW\b\t"+
		"\1\2WY\5\22\n\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\21\3\2\2\2\\"+
		"Z\3\2\2\2]^\7\32\2\2^f\b\n\1\2_`\7\24\2\2`f\b\n\1\2ab\7\23\2\2bf\b\n\1"+
		"\2cd\7\25\2\2df\b\n\1\2e]\3\2\2\2e_\3\2\2\2ea\3\2\2\2ec\3\2\2\2f\23\3"+
		"\2\2\2gh\7\t\2\2hi\7\17\2\2ij\7\32\2\2jk\b\13\1\2kl\7\20\2\2lm\7\5\2\2"+
		"mn\b\13\1\2n\25\3\2\2\2op\7\n\2\2pu\7\17\2\2qr\7\32\2\2rv\b\f\1\2st\7"+
		"\23\2\2tv\b\f\1\2uq\3\2\2\2us\3\2\2\2vw\3\2\2\2wx\7\20\2\2xy\7\5\2\2y"+
		"z\b\f\1\2z\27\3\2\2\2{|\7\13\2\2|}\7\17\2\2}~\7\32\2\2~\177\b\r\1\2\177"+
		"\u0080\7\27\2\2\u0080\u0081\b\r\1\2\u0081\u0082\t\2\2\2\u0082\u0083\b"+
		"\r\1\2\u0083\u0084\7\20\2\2\u0084\u0085\7\21\2\2\u0085\u0087\b\r\1\2\u0086"+
		"\u0088\5\f\7\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\22\2\2\u008c"+
		"\u0098\b\r\1\2\u008d\u008e\7\f\2\2\u008e\u008f\7\21\2\2\u008f\u0091\b"+
		"\r\1\2\u0090\u0092\5\f\7\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\22"+
		"\2\2\u0096\u0097\b\r\1\2\u0097\u0099\3\2\2\2\u0098\u008d\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\r\1\2\u009b\31\3\2\2"+
		"\2\u009c\u009d\7\r\2\2\u009d\u009e\7\17\2\2\u009e\u009f\7\24\2\2\u009f"+
		"\u00a0\b\16\1\2\u00a0\u00a1\7\31\2\2\u00a1\u00a2\7\32\2\2\u00a2\u00a3"+
		"\b\16\1\2\u00a3\u00a4\7\20\2\2\u00a4\u00a5\7\21\2\2\u00a5\u00a7\b\16\1"+
		"\2\u00a6\u00a8\5\f\7\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\22\2\2"+
		"\u00ac\u00ad\b\16\1\2\u00ad\33\3\2\2\2\u00ae\u00af\7\16\2\2\u00af\u00b0"+
		"\7\17\2\2\u00b0\u00b1\7\32\2\2\u00b1\u00b2\b\17\1\2\u00b2\u00b3\7\27\2"+
		"\2\u00b3\u00b4\b\17\1\2\u00b4\u00b5\t\2\2\2\u00b5\u00b6\b\17\1\2\u00b6"+
		"\u00b7\7\20\2\2\u00b7\u00b8\7\21\2\2\u00b8\u00ba\b\17\1\2\u00b9\u00bb"+
		"\5\f\7\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7\22\2\2\u00bf\u00c0\b"+
		"\17\1\2\u00c0\35\3\2\2\2\17\'-\67BJZeu\u0089\u0093\u0098\u00a9\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}