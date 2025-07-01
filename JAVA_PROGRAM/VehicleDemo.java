// Parent class
class Vehicle {
    void displayInfo() {
        System.out.println("This is a vehicle.");
    }
}

// Child class: Car
class Car extends Vehicle {
    @Override
    void displayInfo() {
        System.out.println("This is a car.");
    }
}

// Child class: Bike
class Bike extends Vehicle {
    @Override
    void displayInfo() {
        System.out.println("This is a bike.");
    }
}

// Main class
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.displayInfo();  // Output: This is a car.
        v2.displayInfo();  // Output: This is a bike.
    }
}

