package UppgiftOOP.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange första talet : ");
        double number1 = scanner.nextDouble();

        System.out.print("Ange andra talet : ");
        double number2 = scanner.nextDouble();

        //skapa Calculator-objekt
        Calculator calculator = new Calculator(number1, number2);

        //Anropa metoder för räknesätt
        calculator.addition();
        calculator.subtraktion();
        calculator.multiplikation();
        calculator.division();

    }
}
