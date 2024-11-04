package Skoluppgifter;// 13. Skapa ett program som läser in ett tal och skriver ut om det är jämnt. (Använd moduloperatorn)
import java.util.Scanner;

public class Uppgift13 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Ange siffra:");
        int number = myObj.nextInt();

        if (number%2==0 ) {
            System.out.println("Talet är jämnt!");
        } else {
            System.out.println("Talet är udda!");
        }
    }
}