package UppgiftOOP.NameList;

import java.util.ArrayList;
import java.util.Scanner;

class NameListLogic {
    private ArrayList<String> names = new ArrayList<>();
    private Scanner scanner;

    public NameListLogic(Scanner scanner) {
        this.scanner = scanner;
    }

    public void readNames() {
        System.out.println("Ange namn (skriv 'stop' för att avsluta):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("stop")) {
                break;
            }
            names.add(name);
        }
    }

    public void printNames() {
        System.out.println("Sparade namn:");
        for (String n : names) {
            System.out.println(n);
        }
    }

    public void overwriteFirstName() {
        if (!names.isEmpty()) {
            System.out.println("Ange ett nytt namn för att skriva över första platsen:");
            String newName = scanner.nextLine();
            names.set(0, newName);
        }
    }

    public void swapFirstAndLast() {
        if (names.size() > 1) {
            String first = names.getFirst();
            String last = names.getLast();
            names.set(0, last);
            names.set(names.size() - 1, first);
        }
    }

    public void printUpdatedNames() {
        System.out.println("Uppdaterad namnlista:");
        for (String n : names) {
            System.out.println(n);
        }
    }
}