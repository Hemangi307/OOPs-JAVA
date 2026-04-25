// Abstract class
abstract class Vehicle {

    // Abstract methods
    abstract String fuelType();
    abstract int noOfWheels();
}

// Subclass Car
class Car extends Vehicle {

    String fuelType() {
        return "Petrol/Diesel";
    }

    int noOfWheels() {
        return 4;
    }
}

// Subclass Bike
class Bike extends Vehicle {

    String fuelType() {
        return "Petrol";
    }

    int noOfWheels() {
        return 2;
    }
}
class Practical30 {
    public static void main(String[] args) {
        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        System.out.println("Car Details:");
        System.out.println("Fuel Type: " + v1.fuelType());
        System.out.println("Number of Wheels: " + v1.noOfWheels());

        System.out.println();

        System.out.println("Bike Details:");
        System.out.println("Fuel Type: " + v2.fuelType());
        System.out.println("Number of Wheels: " + v2.noOfWheels());
    }
}