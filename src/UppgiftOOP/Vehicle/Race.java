package UppgiftOOP.Vehicle;

public class Race {
    public static void main(String[] args) {

        Car kiaVenga = new Car();
        System.out.println("Bilen Kia Venga kör först!");
        kiaVenga.showSpeed();
        kiaVenga.increaseSpeed(25);
        kiaVenga.showSpeed();
        kiaVenga.increaseSpeed(50);
        kiaVenga.showSpeed();

        Bicycle kronanCykel = new Bicycle();
        System.out.println("Sen kommer Kronancykeln!");
        kronanCykel.changeGear(2);
        kronanCykel.showSpeed();
        kronanCykel.changeGear(3);
        kronanCykel.showSpeed();
        kronanCykel.changeGear(4);
        kronanCykel.showSpeed();
        kronanCykel.changeGear(5);
        kronanCykel.showSpeed();
    }



}
