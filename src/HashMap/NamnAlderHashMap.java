package HashMap;
import java.util.Scanner;

public class NamnAlderHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NamnAlderLagring namnAlderLagring = new NamnAlderLagring();

        // Lägga till exempeldata
        namnAlderLagring.laggTill("Alex", 25);
        namnAlderLagring.laggTill("Bertil", 30);
        namnAlderLagring.laggTill("Carl", 22);
        namnAlderLagring.laggTill("David", 28);

        // Användaren matar in ett namn
        System.out.print("Ange ett namn: ");
        String namn = scanner.nextLine();

        // Hämta och skriv ut åldern
        Integer alder = namnAlderLagring.hamtaAlder(namn);
        if (alder != null) {
            System.out.println(namn + " är " + alder + " år gammal.");
        } else {
            System.out.println("Namnet finns inte i listan.");
        }

        scanner.close();
    }
}
