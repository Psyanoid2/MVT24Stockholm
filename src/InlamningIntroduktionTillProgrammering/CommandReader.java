package InlamningIntroduktionTillProgrammering;
import java.util.Scanner;

public class CommandReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandStatistics statistik = new CommandStatistics();

        System.out.println("Skriv in text rad för rad (Skriv 'STOPP' för att avsluta):");

        //Kontrollerar stopp och fortsätter annars.
        while (true) {
            String rad = scanner.nextLine();
            if (statistik.isSTOPP(rad)) {
                System.out.println("Programmet avslutas");
                break;
            } else {
                statistik.laggTillRad(rad);
            }

        }
        scanner.close();

        //Skriver ut resultatet efter att vi skrivit STOPP. (Exkluderar STOPP)
        System.out.println("Resultat (STOPP exkluderat)");
        System.out.println("Antal tecken: " + statistik.getAntalTecken());
        System.out.println("Antal rader: " + statistik.getAntalRader());

    }

}