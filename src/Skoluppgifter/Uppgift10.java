package Skoluppgifter;
import java.util.Scanner;

//10. Sambandet mellan Fahrenheit och Celsius grader ges av formeln F=9C / 5 + 32.
//Skapa ett program där en temperatur i Fahrenheit läses in och motsvarande temperatur
//i Celsius skrivs ut.

public class Uppgift10 {
    public static void main(String[] args) {

        // Skapa en Scanner för att läsa in användarens input
        Scanner input = new Scanner(System.in);

        // Begär input för temperaturen i Fahrenheit
        System.out.print("Ange temperaturen i Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Beräknar temperaturen i Celsius
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        // Skriver ut resultatet
        System.out.println("Temperaturen i Celsius är: " + celsius + " grader.");

        // Stänger scannern
        input.close();
    }
}
