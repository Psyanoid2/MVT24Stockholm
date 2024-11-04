package Skoluppgifter;
import java.util.Scanner;

public class Uppgift11 {

public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // Begär input för de två talen
            System.out.print("Ange första talet: ");
            double tal1 = input.nextDouble();

            System.out.print("Ange andra talet: ");
            double tal2 = input.nextDouble();

            // Kontrollera om första talet är större än det andra
            if (tal1 > tal2) {

                // Skriv ut det första talet om det är störst
                System.out.println("Det första talet " + tal1 + " är störst.");
            }
            else System.out.println( "Det första talet är inte större än det andra.");

            // Stänger scannern
            input.close();
        }
    }
