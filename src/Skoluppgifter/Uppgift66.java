package Skoluppgifter;
import java.util.regex.Pattern;
public class Uppgift66 {

    public static void main(String[] args) {
        // Skapar en array med personnummer
        String[] personnummerArray = {
                "19900101-1234",
                "19850710-5678",
                "20001231-8765",
                "199a0502-0001",// Felaktigt personnummer
                "19900827-0135",
        };

        // Regex för att validera formatet yyyyMMdd-xxxx
        String regex = "^\\d{8}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);

        // Gå igenom arrayen och kontrollera varje personnummer
        for (String personnummer : personnummerArray) {
            if (!pattern.matcher(personnummer).matches()) {
                System.out.println("Felaktigt format på personnummer: " + personnummer);
            }
            else System.out.println("Alla personnummer korrekt inlästa.");
        }
    }
}

