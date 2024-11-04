import java.util.Scanner;

public class Uppgift6 {
    public static void main(String[] args) {
        // Skapa en Scanner för att läsa in användarens input
        Scanner scanner = new Scanner(System.in);

        // Läser in värdena för a och x
        System.out.print("Ange värdet på a: ");
        double a = scanner.nextDouble();

        System.out.print("Ange värdet på x: ");
        double x = scanner.nextDouble();

        // Beräknar funktionen ax^3 + 7
        double resultat = a * Math.pow(x, 3) + 7;

        // Skriver ut resultatet
        System.out.println("Resultatet av funktionen " + a + "*x^3 + 7 när x = " + x + " är " + resultat + ".");

        // Stänger scannern
        scanner.close();
    }
}