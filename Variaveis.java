public class Variaveis extends Simbolo {

	public static final int NUMBER = 0;
	public static final int STRING = 1;
	public static final int BOOL = 2;

	private int tipo;
	private String valor;

	public Variaveis(String name, int tipo, String valor) {
		super(name);
		this.tipo = tipo;
		this.valor = valor;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String generateJavaCode() {
		String str;
		if (tipo == NUMBER) {
			str = "double ";
		} else if (tipo == STRING) {
			str = "String ";
		} else {
			str = "boolean ";
		}
		return str + " " + super.nome + ";";
	}
}