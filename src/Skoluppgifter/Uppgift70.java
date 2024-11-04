package Skoluppgifter;
//70.En array med 50 inlästa tal finns. Ta reda på och skriv ut hur många tal som är positiva.
public class Uppgift70 {
    public static void main(String[] args) {
        // Skapar en array med 50 element
        long[] array = new long[50];

        // Fyller arrayen med sekventiella värden från -25 till +24
        for (int i = 0; i < array.length; i++) {
            array[i] = i - 25; // Fyller arrayen med värden från -25 till +24
        }

        // Skriver ut värdena i arrayen med extra format för negativt, noll och positivt
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.println("Index " + (i - 25) + ": Negativt.");
            } else if (array[i] == 0) {
                System.out.println("Index " + (i - 25) + ": Noll.");
            } else {
                System.out.println("Index " + (i - 25) + ": Positivt.");
            }
        }
    }
}
