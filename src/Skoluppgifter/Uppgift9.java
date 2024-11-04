package Skoluppgifter;

import java.util.Scanner;

public class Uppgift9 {

    public static void main(String[] args) {

        // Skapa en Scanner för att läsa in radien från användaren
        Scanner circleRadius = new Scanner(System.in);

        // Begär input för radien
        System.out.print("Ange cirkelns radie(cm): ");
        double radius = circleRadius.nextDouble();

        // Beräknar cirkelns diameter, omkrets och area
        double diameter = radius * 2;
        double omkrets = 3.14 * diameter;
        double area = 3.14 * Math.pow(radius, 2); // Använd Math.pow för att upphöja radien till 2

        // Skriver ut resultaten
        System.out.println("Cirkelns diameter är: " + diameter + " cm.");
        System.out.println("Cirkelns omkrets är: " + omkrets + " cm.");
        System.out.println("Cirkelns area är: " + area + " cm².");

        // Stänger scannern
        circleRadius.close();
    }
}
