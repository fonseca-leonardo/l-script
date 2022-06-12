import java.util.*;

public class InicioFim {
    public void inicio(String valor) {
        String bloco = "Public class Start {\n\tpublic static void main(String[] args) {\n\t\t" + valor;
        System.out.println(bloco);
    }

    public void fim() {
        String bloco = "\n\t}\n}";
        System.out.println(bloco);

    }
}