public class ComandoAtribuicao extends AbstractCommand {

    private String id;
    private String expr;

    public ComandoAtribuicao(String id, String expr) {
        this.id = id;
        this.expr = expr;
    }

    @Override
    public String generateJavaCode() {
        return id + " = " + expr + ";";
    }

}
