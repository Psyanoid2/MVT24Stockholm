
package Skoluppgifter;

import java.util.Scanner;

public class Uppgift44 {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        System.out.print("Skriv in antal nummer: ");
        int antalNumbers = scannerInput.nextInt();
        int sum = 0;

        for (int i = 0; i < antalNumbers; i++) {
            System.out.print("Skriv ett tal: ");
            int number = scannerInput.nextInt();
            System.out.print(sum + " + " + number);
            sum = sum + number;
            System.out.println(" = " + sum);
        }

        System.out.println("Den totala summan är: " + sum);
    }
}