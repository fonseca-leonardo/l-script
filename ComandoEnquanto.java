import java.util.ArrayList;

public class ComandoEnquanto extends AbstractCommand {
    private ArrayList<AbstractCommand> comandos;
    private String condicao;

    public ComandoEnquanto(String condicao, ArrayList<AbstractCommand> comandos) {
        this.condicao = condicao;
        this.comandos = comandos;
    }

    @Override
    public String generateJavaCode() {
        StringBuilder str = new StringBuilder();
        str.append("while (" + condicao + ") {\n");
        for (AbstractCommand cmd : comandos) {
            str.append("\t\t" + cmd.generateJavaCode() + "\n");
        }
        str.append("\t}");

        return str.toString();
    }

}
