import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;

public class Programa {
    private TabelaSimbolo varTable;
    private ArrayList<AbstractCommand> comandos;
    private String programName;

    public void generateTarget() {
        StringBuilder str = new StringBuilder();
        str.append("import java.util.*;\n");
        str.append("public class MainClass{ \n");
        str.append("  public static void main(String args[]){\n ");
        str.append("   Scanner _key = new Scanner(System.in);\n");
        for (Simbolo symbol : varTable.getAll()) {
            str.append("\t" + symbol.generateJavaCode() + "\n");
        }
        for (AbstractCommand command : comandos) {
            str.append("\t" + command.generateJavaCode() + "\n");
        }
        str.append("  }\n");
        str.append("}");

        try {
            FileWriter fr = new FileWriter(new File("compilado/MainClass.java"));
            fr.write(str.toString());
            fr.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public TabelaSimbolo getTabelaSimbolo() {
        return varTable;
    }

    public void setTabelaSimbolo(TabelaSimbolo varTable) {
        this.varTable = varTable;
    }

    public ArrayList<AbstractCommand> getComandos() {
        return comandos;
    }

    public void setComandos(ArrayList<AbstractCommand> comandos) {
        this.comandos = comandos;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }
}
