import java.util.ArrayList;

public class ComandoRepete extends AbstractCommand {
    private String quantidade;
    private String nomeContador;

    private ArrayList<AbstractCommand> comandos;

    public ComandoRepete(String quantidade, String nomeContador, ArrayList<AbstractCommand> comandos) {
        this.quantidade = quantidade;
        this.comandos = comandos;
        this.nomeContador = nomeContador;
    }

    @Override
    public String generateJavaCode() {
        StringBuilder str = new StringBuilder();

        str.append("for (" + nomeContador + " = 1; " + nomeContador + " <= " + quantidade + "; ++ " + nomeContador
                + ") {\n");
        for (AbstractCommand cmd : comandos) {
            str.append("\t\t" + cmd.generateJavaCode() + "\n");
        }
        str.append("\t}");

        return str.toString();
    }

}
