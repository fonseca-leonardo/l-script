import java.util.ArrayList;

public class ComandoDecisao extends AbstractCommand {
    private String condicao;

    private ArrayList<AbstractCommand> comandosTrue;
    private ArrayList<AbstractCommand> comandosFalse;

    public ComandoDecisao(String condicao, ArrayList<AbstractCommand> comandosTrue,
            ArrayList<AbstractCommand> comandosFalse) {
        this.condicao = condicao;
        this.comandosTrue = comandosTrue;
        this.comandosFalse = comandosFalse;
    }

    @Override
    public String generateJavaCode() {
        StringBuilder str = new StringBuilder();
        str.append("if (" + condicao + ") {\n");
        for (AbstractCommand cmd : comandosTrue) {
            str.append("\t\t" + cmd.generateJavaCode() + "\n");
        }
        str.append("\t}");
        if (comandosFalse.size() > 0) {
            str.append(" else {\n");
            for (AbstractCommand cmd : comandosFalse) {
                str.append("\t\t" + cmd.generateJavaCode() + "\n");
            }
            str.append("\t}\n");

        }
        return str.toString();
    }

}
