package Skoluppgifter;

import java.util.regex.Pattern;

public class Uppgift67 {
    public static void main(String[] args) {
        // Skapar en array med personnummer
        String[] personnummerArray = {
                "19900101-1234", // Kvinna
                "19850710-5678", // Man
                "20001231-8765", // Man
                "19950502-0002", // Kvinna
                "199a0502-0001", // Felaktigt personnummer
                "19900827-0135", // Man
        };

        // Regex för att validera formatet yyyyMMdd-xxxx
        String regex = "^\\d{8}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);

        // Gå igenom arrayen och kontrollera varje personnummer
        for (String personnummer : personnummerArray) {
            if (!pattern.matcher(personnummer).matches()) {
                System.out.println("Felaktigt format på personnummer: " + personnummer);
            } else {
                // Hämta den sista siffran och avgör kön
                char sistaSiffran = personnummer.charAt(personnummer.length() - 1);
                int sistaSiffraNummer = Character.getNumericValue(sistaSiffran);

                if (sistaSiffraNummer % 2 == 0) {
                    System.out.println("Personnumret " + personnummer + " tillhör en kvinna.");
                } else {
                    System.out.println("Personnumret " + personnummer + " tillhör en man.");
                }
            }
        }
    }
}