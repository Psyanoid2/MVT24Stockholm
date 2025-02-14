package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Klass som hanterar lagring av namn och ålder
public class NamnAlderLagring {
    private HashMap<String, Integer> namnAlder;

    // Konstruktor som initialiserar HashMap
    public NamnAlderLagring() {
        namnAlder = new HashMap<>();
    }

    // Metod för att lägga till namn och ålder
    public void laggTill(String namn, int alder) {
        namnAlder.put(namn, alder);
    }

    // Metod för att hämta ålder baserat på namn
    public Integer hamtaAlder(String namn) {
        return namnAlder.get(namn);
    }
}