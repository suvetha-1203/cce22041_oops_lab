// File: CCE22041_InheritanceApp.java

// Base Class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Single + Multilevel Inheritance
class Employee extends Person {
    String empId;

    Employee(String name, int age, String empId) {
        super(name, age);
        this.empId = empId;
    }

    void displayEmployeeDetails() {
        displayPersonDetails();
        System.out.println("Employee ID: " + empId);
    }
}

// Hierarchical Inheritance: Manager class
class Manager extends Employee {
    String department;

    Manager(String name, int age, String empId, String department) {
        super(name, age, empId);
        this.department = department;
    }

    void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Department: " + department);
    }
}

// Hierarchical Inheritance: Developer class
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int age, String empId, String programmingLanguage) {
        super(name, age, empId);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDeveloperDetails() {
        displayEmployeeDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Interface for Multiple Inheritance
interface WorkSchedule {
    void showSchedule();
}

// Multiple Inheritance using interface
class PartTimeEmployee extends Employee implements WorkSchedule {
    int workingHours;

    PartTimeEmployee(String name, int age, String empId, int workingHours) {
        super(name, age, empId);
        this.workingHours = workingHours;
    }

    @Override
    public void showSchedule() {
        System.out.println("Working Hours: " + workingHours + " per week");
    }

    void displayPartTimeEmployeeDetails() {
        displayEmployeeDetails();
        showSchedule();
    }
}

// Main Application
public class CCE22041_InheritanceApp {
    public static void main(String[] args) {
        System.out.println("=== INHERITANCE APPLICATION DEMO ===");

        // Single & Multilevel Inheritance
        Manager m = new Manager("Alice", 40, "M101", "HR");
        System.out.println("\nManager Details:");
        m.displayManagerDetails();

        // Hierarchical Inheritance
        Developer d = new Developer("Bob", 28, "D202", "Java");
        System.out.println("\nDeveloper Details:");
        d.displayDeveloperDetails();

        // Multiple Inheritance via Interface
        PartTimeEmployee pte = new PartTimeEmployee("Charlie", 22, "P303", 20);
        System.out.println("\nPart-Time Employee Details:");
        pte.displayPartTimeEmployeeDetails();
    }
}
