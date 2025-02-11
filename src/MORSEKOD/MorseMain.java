package MORSEKOD;

import java.util.Scanner;

// Klass som hanterar huvudprogrammet och användarinteraktionen
public class MorseMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Välj:");
            System.out.println("1 - Text till Morse");
            System.out.println("2 - Morse till Text");
            System.out.println("3 - Avsluta");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Ange text:");
                    String text = scanner.nextLine();
                    System.out.println("Morse-kod: " + MorseLogic.textToMorse(text));
                    break;
                case 2:
                    System.out.println("Ange Morse-kod:");
                    String morse = scanner.nextLine();
                    System.out.println("Översatt text: " + MorseLogic.morseToText(morse));
                    break;
                case 3:
                    System.out.println("Programmet avslutas.");
                    running = false;
                    break;
                default:
                    System.out.println("Ogiltigt val. Försök igen.");
                    break;
            }
        }
        scanner.close();
    }
}
