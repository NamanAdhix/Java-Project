class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding");
    }
}

class Truck extends Vehicle {
    void load() {
        System.out.println("Truck is carrying goods");
    }
}

public class Main {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();
        c.drive();

        Bike b = new Bike();
        b.start();
        b.ride();

        Truck t = new Truck();
        t.start();
        t.load();
    }
}
