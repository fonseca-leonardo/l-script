public class ComandoEscrita extends AbstractCommand {
    private String id;

    public ComandoEscrita(String id) {
        this.id = id;
    }

    @Override
    public String generateJavaCode() {
        // TODO Auto-generated method stub
        return "System.out.println(" + id + ");";
    }

}
