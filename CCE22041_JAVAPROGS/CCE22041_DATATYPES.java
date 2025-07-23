import java.util.Scanner;

public class CCE22041_DATATYPES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Integer types
        byte wardNumber = 5;             // byte
        short yearOfAdmission = 2025;    // short
        int patientID;                   // int
        long contactNumber;              // long

        // Floating-point types
        float roomChargePerDay;          // float
        double totalBill;                // double

        // Character and Boolean
        char gender;                     // char
        boolean isInsured;               // boolean

        // Input section
        System.out.print("Enter Patient ID: ");
        patientID = scanner.nextInt();

        System.out.print("Enter Contact Number: ");
        contactNumber = scanner.nextLong();

        System.out.print("Enter Gender (M/F): ");
        gender = scanner.next().charAt(0);

        System.out.print("Enter Room Charge per Day: ");
        roomChargePerDay = scanner.nextFloat();

        System.out.print("Enter Number of Days Admitted: ");
        int days = scanner.nextInt();

        System.out.print("Is the patient insured? (true/false): ");
        isInsured = scanner.nextBoolean();

        // Billing logic
        totalBill = roomChargePerDay * days;
        if (isInsured) {
            totalBill *= 0.5; // 50% discount for insured patients
        }

        // Output summary
        System.out.println("\n--- Patient Record Summary ---");
        System.out.println("Patient ID         : " + patientID);
        System.out.println("Contact Number     : " + contactNumber);
        System.out.println("Gender             : " + gender);
        System.out.println("Ward Number        : " + wardNumber);
        System.out.println("Year of Admission  : " + yearOfAdmission);
        System.out.println("Room Charge/Day    : ₹" + roomChargePerDay);
        System.out.println("Days Admitted      : " + days);
        System.out.println("Insurance Status   : " + isInsured);
        System.out.println("Total Bill         : ₹" + totalBill);

        scanner.close();
    }
}
