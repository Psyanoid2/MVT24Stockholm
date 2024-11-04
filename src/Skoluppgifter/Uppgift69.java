package Skoluppgifter;

public class Uppgift69 {
    public static void main(String[] args) {
        // Skapar en array med 50 element
        long[] array = new long[50];

        // Fyller arrayen med sekventiella värden
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Fyller arrayen med värden från 1 till 50
        }

        // Går igenom arrayen och lägger till 2 till varje jämnt tal
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] += 2; // Adderar 2 om talet är jämnt
            }
        }

        // Skriver ut värdena i arrayen, med extra format för jämna tal
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.println("Index " + i + ": " + (array[i] - 2) + " + 2 = " + array[i]);
            } else {
                System.out.println("Index " + i + ": " + array[i]);
            }
        }
    }
}
