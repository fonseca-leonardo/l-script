
public abstract class Simbolo {
    protected String nome;

    public abstract String generateJavaCode();

    public Simbolo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
