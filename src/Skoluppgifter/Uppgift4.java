package Skoluppgifter;

import java.util.Scanner;

public class Uppgift4 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Ange tre tal:");
        int number1 = myObj.nextInt();
        int number2 = myObj.nextInt();
        int number3 = myObj.nextInt();
        int sumNumbers = (number1+number2+number3);
        int middleNumbers = (number1+number2+number3)/3;

        System.out.println("Summan av de tre talen är: " + sumNumbers);
        System.out.println(" ");
        System.out.println("Medelvärdet av de tre talen är: " + middleNumbers);
    }
}
