class Vehicle {
    protected String vehicleNumber, brand, fuelType;

    Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

    Car(String vehicleNumber, String brand, String fuelType,
        int numberOfSeats, boolean ACavailable) {

        super(vehicleNumber, brand, fuelType);
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Seats: " + numberOfSeats);
        System.out.println("AC: " + (ACavailable ? "Yes" : "No"));
    }
}

class ElectricCar extends Car {
    int batteryCapacity, chargingTime;

    ElectricCar(String vehicleNumber, String brand, String fuelType,
                int numberOfSeats, boolean ACavailable,
                int batteryCapacity, int chargingTime) {

        super(vehicleNumber, brand, fuelType, numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hrs");
    }
}

public class Practical25 {
    public static void main(String[] args) {


        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");

        Vehicle v = new Vehicle("GJ01", "Tata", "Petrol");
        Car c = new Car("GJ02", "Hyundai", "Diesel", 5, true);
        ElectricCar e = new ElectricCar("GJ03", "Tesla", "Electric", 5, true, 75, 2);

        v.displayDetails();
        System.out.println();

        c.displayDetails();
        System.out.println();

        e.displayDetails();
        System.out.println();

        // Upcasting
        Vehicle v2 = new Car("GJ04", "Honda", "Petrol", 4, false);
        v2.displayDetails();

        // Downcasting with instanceof
        if (v2 instanceof Car) {
            Car c2 = (Car) v2;
            System.out.println("Seats: " + c2.numberOfSeats);
        }
    }
}