import java.util.HashMap;
import java.util.ArrayList;

public class TabelaSimbolo {
    private HashMap<String, Simbolo> map;

    public TabelaSimbolo() {
        map = new HashMap<String, Simbolo>();
    }

    public void adiciona(Simbolo s) {
        map.put(s.getNome(), s);
    }

    public boolean existe(String nome) {
        return map.containsKey(nome);
    }

    public Simbolo get(String nome) {
        return map.get(nome);
    }

    public ArrayList<Simbolo> getAll() {
        ArrayList<Simbolo> lista = new ArrayList<Simbolo>();
        for (Simbolo symbol : map.values()) {
            lista.add(symbol);
        }
        return lista;
    }
}
