package UppgiftOOP.Calculator;

//Kalkylator Class
public class Calculator {
    private final double tal1;
    private final double tal2;

    //Konstruktor för att läsa in tal?
    public Calculator(double number1, double number2) {
        this.tal1 = number1;
        this.tal2 = number2;
    }

    //Metod +
    public void addition() {
        System.out.println("Addition: " + (tal1 + tal2));
    }

    //Metod -
    public void subtraktion() {
        System.out.println("Subtraktion: " + (tal1 - tal2));
    }

    //Metod *
    public void multiplikation() {
        System.out.println("Multiplikation: " + (tal1 * tal2));
    }

    // Metod för /
    public void division() {
        if (tal2 != 0) {
            System.out.println("Division: " + (tal1 / tal2));
        } else {
            System.out.println("Division med 0 är inte tillåten.");
        }
    }
}
