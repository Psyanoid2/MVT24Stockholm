package UppgiftOOP.Vehicle;

// Subklass Car som ärver från Vehicle
class Car extends Vehicle {
    public void increaseSpeed(int increment) {
        super.speed += increment;
    }
}