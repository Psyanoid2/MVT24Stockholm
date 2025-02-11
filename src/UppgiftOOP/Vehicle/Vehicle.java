package UppgiftOOP.Vehicle;

// Huvudklassen Vehicle
class Vehicle {
    public int speed; // Publikt attribut

    public Vehicle() {
        this.speed = 0; // Standardhastighet
    }

    public void showSpeed() {
        System.out.println("Current speed: " + speed + " km/h");
    }
}



// Race-klassen med main-metoden
