package Skoluppgifter;

import java.util.Scanner;

public class Uppgift12 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner myObj = new Scanner(System.in);

        // Read first number
        System.out.println("Ange första talet:");
        int number1 = myObj.nextInt();

        // Read second number
        System.out.println("Ange andra talet:");
        int number2 = myObj.nextInt();

        // Check if the first number is more than double the second number
        if (number2 > number1 * 2) {
            System.out.println("För stort!");
        } else {
            System.out.println("Inte för stort.");
        }

        // Close the scanner object
        myObj.close();
    }
}
