package UppgiftOOP.Vehicle;

class Bicycle extends Vehicle {

    private int gear;

    public void changeGear(int newGear) {
        if (newGear < 1) {
            System.out.println("Växeln kan inte vara mindre än 1!");
            return;
        }
        this.gear = newGear;
        speed = (int) (10 * Math.pow(1.5, gear - 1)); // Beräknar hastigheten baserat på växeln
        System.out.println("Växeln ändrad till: " + gear);
    }
}
