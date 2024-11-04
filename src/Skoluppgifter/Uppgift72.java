package Skoluppgifter;
public class Uppgift72 {
    public static void main(String[] args) {
        // Skapar en array med 51 element för att lagra värden från 49 till -1
        long[] array = new long[51];

        // Fyller arrayen med värden från 49 till -1
        for (int i = 0; i < array.length; i++) {
            array[i] = 49 - i;
        }

        // Skriver ut endast de negativa talen i arrayen
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.println("Index " + i + ": " + array[i] + " är ett negativt tal.");
            }
        }
    }
}
