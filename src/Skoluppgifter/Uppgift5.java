package Skoluppgifter;

import java.util.Scanner;

public class Uppgift5 {
    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);
        System.out.println("Ange Sek:");
        double krona = myObj.nextDouble();

        double dollar = krona*6.0;
        double pound = krona*10.0;


        System.out.println(krona + " Kr");
        System.out.println("Är enligt nuvarande kurs:");
        System.out.println(dollar + " Dollar");
        System.out.println(pound + " Pund");



    }
}
