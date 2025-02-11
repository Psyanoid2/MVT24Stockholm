package UppgiftOOP.NameList;

import java.util.Scanner;

public class NameListMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NameListLogic nameListLogic = new NameListLogic(scanner);

        nameListLogic.readNames();
        nameListLogic.printNames();

        nameListLogic.overwriteFirstName();
        nameListLogic.printUpdatedNames();

        System.out.println("Vill du byta plats på första och sista namnet? (ja/nej)");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("ja")) {
            nameListLogic.swapFirstAndLast();
            nameListLogic.printUpdatedNames();
        }

        scanner.close();
    }
}