// Roll No: CCE22041
// Application: Smart Home Appliance Control System (Abstraction Demonstration)

abstract class Appliance {   // Abstract Class
    String name;
    int power; // Power in Watts

    Appliance(String name, int power) {
        this.name = name;
        this.power = power;
    }

    // Abstract method to turn on the appliance
    abstract void turnOn();

    // Abstract method to turn off the appliance
    abstract void turnOff();

    // Concrete method
    void displayInfo() {
        System.out.println("Appliance: " + name + ", Power: " + power + "W");
    }
}

// Concrete class for Light
class Light extends Appliance {
    boolean isDimmer;

    Light(String name, int power, boolean isDimmer) {
        super(name, power);
        this.isDimmer = isDimmer;
    }

    @Override
    void turnOn() {
        System.out.println(name + " light is turned ON");
    }

    @Override
    void turnOff() {
        System.out.println(name + " light is turned OFF");
    }

    void showLightDetails() {
        displayInfo();
        System.out.println("Dimmer Supported: " + isDimmer);
    }
}

// Concrete class for AirConditioner
class AirConditioner extends Appliance {
    int temperature;

    AirConditioner(String name, int power, int temperature) {
        super(name, power);
        this.temperature = temperature;
    }

    @Override
    void turnOn() {
        System.out.println(name + " AC is turned ON at " + temperature + "°C");
    }

    @Override
    void turnOff() {
        System.out.println(name + " AC is turned OFF");
    }

    void showACDetails() {
        displayInfo();
        System.out.println("Temperature Set: " + temperature + "°C");
    }
}

// Main Class
public class CCE22041_AbstractionSmartHome {
    public static void main(String[] args) {
        System.out.println("Roll No: CCE22041");
        System.out.println("=== SMART HOME APPLIANCE CONTROL (Abstraction Demo) ===\n");

        Light livingRoomLight = new Light("Living Room", 12, true);
        System.out.println("-- Light Info --");
        livingRoomLight.showLightDetails();
        livingRoomLight.turnOn();
        livingRoomLight.turnOff();
        System.out.println();

        AirConditioner bedroomAC = new AirConditioner("Bedroom", 1500, 24);
        System.out.println("-- Air Conditioner Info --");
        bedroomAC.showACDetails();
        bedroomAC.turnOn();
        bedroomAC.turnOff();
    }
}