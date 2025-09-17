package es3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Rubrica {
    private Map<String, Number> contatti = new HashMap();

    public Map.Entry<String, Number> searchNumber(Number number) {
        Iterator<Map.Entry<String, Number>> iterator = contatti.entrySet().iterator();
        Map.Entry<String, Number> found = null;
        while (iterator.hasNext()) {
            Map.Entry<String, Number> curr = iterator.next();
            if (curr.getValue().equals(number)) {
                found = curr;
            }
        }
        return found;
    }

    public void addContatto(String nome, Number numero) {
        contatti.put(nome, numero);
    }


    public Number findName(String name) {

        return contatti.get(name);
    }

    public void removeContatto(String nome) {
        contatti.remove(nome);
    }

    public Map<String, Number> getContatti() {
        return this.contatti;
    }
}
