import java.util.Scanner;

// Base class
class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    // Method to calculate rental cost
    public double calculateRental(int days) {
        return days * 50; // Default rate per day
    }

    public void displayRental(int days) {
        System.out.println("\n--- Rental Details ---");
        System.out.println("Vehicle: " + name);
        System.out.println("Days: " + days);
        System.out.println("Total Rental Cost: ₹" + calculateRental(days));
    }
}

// Derived class - Car
class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public double calculateRental(int days) {
        return days * 100; // Car rate per day
    }
}

// Derived class - Bike
class Bike extends Vehicle {
    public Bike(String name) {
        super(name);
    }

    @Override
    public double calculateRental(int days) {
        return days * 30; // Bike rate per day
    }
}

// Main class with roll number included
public class CCE22041_VehicleRentalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Roll Number: CCE22041");
        System.out.println("Welcome to Vehicle Rental System!\n");

        // Input vehicle type
        System.out.print("Enter vehicle type (Car/Bike/Other): ");
        String type = scanner.nextLine();

        // Input vehicle name
        System.out.print("Enter vehicle name: ");
        String name = scanner.nextLine();

        // Input number of rental days
        System.out.print("Enter number of days to rent: ");
        int days = scanner.nextInt();

        Vehicle v;

        // Polymorphism in action
        if (type.equalsIgnoreCase("Car")) {
            v = new Car(name);
        } else if (type.equalsIgnoreCase("Bike")) {
            v = new Bike(name);
        } else {
            v = new Vehicle(name);
        }

        // Display rental details
        v.displayRental(days);

        scanner.close();
    }
}
