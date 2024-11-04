package Skoluppgifter;

// 3. Skapa ett program som läser in antal timmar, beräknar och skriver ut hur mycket det
//blir omvandlat till minuter resp sekunder.

import java.util.Scanner;

public class Uppgift3 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Ange timmar:");
        int Hours = myObj.nextInt();
        int Minutes = Hours*60;
        int Seconds = Minutes*60;

        System.out.print(Hours + " Timmar är " + Minutes + " Minuter!");
        System.out.println(" ");
        System.out.print(Minutes + " Minuter är " + Seconds + " Sekunder!");

        }
    }
