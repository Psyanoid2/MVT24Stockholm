package UppgiftOOP.DOG;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Dog dog1 = new Dog("Charlie");
        Dog dog2 = new Dog("Argus");
        Dog dog3 = new Dog("Dino");
        Cat cat1 = new Cat("Kaffe");
        Cat cat2 = new Cat("Missan");
        Monster monster1 = new Monster("Kakmonstret");

        dog1.setDogAge(12);
        dog2.setDogAge(14);
        dog3.setDogAge(5);
        cat1.setCatAge(14);
        cat2.setCatAge(20);
        monster1.setMonsterAge(58);

        System.out.println("Vill du höra om katter, hundar eller monstret? (1 = Katter, 2 = Hundar, 3 = Monstret)");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:

                cat1.getName();
                cat1.meow();
                cat1.behavior();
                cat1.catAge();

                cat2.getName();
                cat2.meow();
                cat2.behavior();
                cat2.catAge();

                break;
            case 2:

                dog1.getName();
                dog1.woof();
                dog1.behavior();
                dog1.dogAge();

                dog2.getName();
                dog2.woof();
                dog2.behavior();
                dog2.dogAge();

                dog3.getName();
                dog3.woof();
                dog3.behavior();
                dog3.dogAge();

                break;
            case 3:

                monster1.printName();
                monster1.roar();
                monster1.behavior();
                monster1.monsterAge();

                break;

            default:
                System.out.println("Ogiltigt val, du måste välja 1, 2 eller 3.");

        }

        scanner.close();
    }
}
