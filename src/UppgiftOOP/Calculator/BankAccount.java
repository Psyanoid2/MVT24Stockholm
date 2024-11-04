package UppgiftOOP.Calculator;
import java.util.Scanner;

public class BankAccount {

    // Declare a variable to store the bank balance
    private double bankSaldo = 100000;

    // Method to display the menu and handle user input
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);

        // Infinite loop to keep showing the menu until the user logs out
        while (true) {
            // Show the current menu options
            System.out.println("Välj vad du vill göra härnäst:");
            System.out.println("1. Visa saldo.");
            System.out.println("2. Ändra saldo.");
            System.out.println("3. Sätt in/Ta ut pengar.");
            System.out.println("4. Logga ut.");

            // Take user input for menu selection
            int val = scanner.nextInt();

            // Switch statement to handle each menu option
            switch (val) {
                case 1:
                    // Case 1: Show the current balance
                    System.out.println("Ditt saldo är: " + bankSaldo);
                    break;
                case 2:
                    // Case 2: Set a new balance
                    System.out.println("Ange nytt saldo:");
                    bankSaldo = scanner.nextDouble();
                    System.out.println("Ditt saldo är: " + bankSaldo);
                    break;
                case 3:
                    // Case 3: Deposit or withdraw money (input can be positive or negative)
                    System.out.println("Sätt in/Ta ut pengar (använd +/- och belopp)");
                    double belopp = scanner.nextDouble();
                    bankSaldo += belopp;
                    System.out.println("Banksaldo uppdaterat till: " + bankSaldo);
                    break;
                case 4:
                    // Case 4: Log out and exit the program
                    System.out.println("Loggar ut.");
                    scanner.close(); // Close the scanner to avoid resource leaks
                    System.exit(0);
                    break;
                default:
                    // Default case if the user inputs an invalid option
                    System.out.println("Ogiltigt val! Välj ett nummer mellan 1 och 4.");
                    break;
            }
        }
    }
    }