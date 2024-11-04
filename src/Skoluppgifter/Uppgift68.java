package Skoluppgifter;

public class Uppgift68 {
    public static void main(String[] args) {
        // Skapar en array med 50 element
        long[] array = new long[50];

        // Startvärde för första elementet
        array[0] = 1;

        // Fyller arrayen där varje värde fördubblas från det föregående
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] * 2;
        }

        // Skriver ut värdena i arrayen
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }
    }
}

