package exercises.java;

public class Car extends Vehicle {

    int speed = 80;

    @Override
    public int getSpeed() {
        return this.speed;
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();

        System.out.println("Vehicle speed: " + vehicle.getSpeed());
        System.out.println("Car speed: " + car.getSpeed());
    }
}
