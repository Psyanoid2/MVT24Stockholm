package UppgiftOOP.DOG;

public class Dog {
    private String dogName;
    private String behavior = " skäller.";
    private int dogAge;

    public Dog(String name) {
        this.dogName = name;
    }

    public void woof() {
        System.out.println(dogName + " säger: Voff!");
    }

    public void getName() {
        System.out.println("Hundens namn är: " + dogName + ".");
    }

    public void behavior(){
        System.out.println(dogName + behavior);
    }

    public void setDogAge(int age) {
        this.dogAge = age;
    }
    public void dogAge(){
        System.out.println(dogName + " är " + dogAge + " år gammal.");
    }
}
