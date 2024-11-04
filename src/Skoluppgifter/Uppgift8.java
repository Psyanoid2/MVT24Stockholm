package Skoluppgifter;

import java.util.Scanner;

public class Uppgift8 {
    public static void main(String[] args) {

        Scanner shortSide = new Scanner(System.in);

        System.out.print("Ange längden på rektangelns kortsida (cm): ");
        double kortSida = shortSide.nextDouble();

        Scanner longSide = new Scanner(System.in);

        System.out.print("Ange längden på rektangelns långsida (cm): ");
        double langSida = longSide.nextDouble();

        System.out.println("Rektangelns omkrets är: " + ((langSida*2)+(kortSida*2)) + "cm.");
        System.out.println("Rektangelns area är: " + (langSida * kortSida) + "cm2.");
    }

}