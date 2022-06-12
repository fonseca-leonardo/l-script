public class ComandoLeitura extends AbstractCommand {

    private String id;
    private Variaveis var;

    public ComandoLeitura(String id, Variaveis var) {
        this.id = id;
        this.var = var;
    }

    @Override
    public String generateJavaCode() {
        // TODO Auto-generated method stub
        return id + "= _key." + (var.getTipo() == Variaveis.NUMBER ? "nextDouble();" : "nextLine();");
    }

}
