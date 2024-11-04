package Skoluppgifter;

import java.util.Scanner;

public class Uppgift7 {
    public static void main(String[] args) {

        Scanner bensinLiter = new Scanner(System.in);

        System.out.print("Ange antal liter bensin: ");
        double bensinMangd = bensinLiter.nextDouble();

        Scanner bensinKronor = new Scanner(System.in);

        System.out.print("Ange vad bensinen kostar: ");
        double bensinKostnad = bensinKronor.nextDouble();

        Scanner rabattKod = new Scanner(System.in);

        System.out.print("Ange eventuell rabatt i procent: ");
        double rabattProc = rabattKod.nextDouble();
        double rabattResultat = ((bensinKostnad*bensinMangd)*(rabattProc/100));

        System.out.println(bensinMangd + "l bensin kostar " + (bensinKostnad*bensinMangd) + "kr.");
        System.out.println("Minus rabatt: " + rabattResultat + "kr.");
        System.out.println("Totalpris: " + ((bensinKostnad*bensinMangd) - rabattResultat) + "kr." );
    }
}
