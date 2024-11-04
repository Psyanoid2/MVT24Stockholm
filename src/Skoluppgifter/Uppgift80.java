package Skoluppgifter;

import java.util.Scanner;

public class Uppgift80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Skapa en array med två platser för täljare och nämnare
        int[] bråk = new int[2];

        // Läs in täljare
        System.out.print("Ange täljare: ");
        bråk[0] = scanner.nextInt();

        // Läs in nämnare
        System.out.print("Ange nämnare: ");
        bråk[1] = scanner.nextInt();

        // Förkorta bråket genom att dividera med största gemensamma delaren
        förkortaBråk(bråk);

        // Skriv ut det förkortade bråket
        System.out.println("Förkortat bråk: " + bråk[0] + "/" + bråk[1]);

        scanner.close();
    }

    // Metod för att förkorta bråket
    public static void förkortaBråk(int[] bråk) {
        int täljare = bråk[0];
        int nämnare = bråk[1];

        // Hitta största gemensamma delaren (SGD)
        int sgd = störstaGemensammaDelare(täljare, nämnare);

        // Dividera både täljaren och nämnaren med SGD för att förkorta bråket
        bråk[0] = täljare / sgd;
        bråk[1] = nämnare / sgd;
    }

    // Metod för att beräkna största gemensamma delaren med hjälp av Euklides algoritm
    public static int störstaGemensammaDelare(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Tar absolutvärdet för att undvika negativa resultat
    }
}
