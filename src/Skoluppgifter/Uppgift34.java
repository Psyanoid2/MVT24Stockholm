package Skoluppgifter;

// 34. Skapa ett program som har en mening och skriver ut ett tecken i taget tills en * finns.
public class Uppgift34 {

    public static void main(String[] args) {

        String string = "Bästa klassen ni är så bra!* Eller hur?";
        int i=0;
        while( string.charAt(i) !='*' ){
            System.out.print(string.charAt(i));
            i++;
        }
    }
}
