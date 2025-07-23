import java.util.Scanner;

public class CCE22041_DATA_OPERATIONS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter Working Days (out of 30): ");
        int workingDays = scanner.nextInt();

        System.out.print("Enter Leaves Taken: ");
        int leaves = scanner.nextInt();

        System.out.print("Has Employee Met Targets? (true/false): ");
        boolean metTargets = scanner.nextBoolean();

        // --------- Arithmetic Operators ---------
        double dailySalary = basicSalary / 30;              // Division
        double salaryEarned = dailySalary * workingDays;    // Multiplication
        double leaveDeduction = leaves * 200;               // Subtraction
        double netSalary = salaryEarned - leaveDeduction;
        double remainder = (int)salaryEarned % 2;           // Modulus

        // --------- Unary Operators ---------
        int rewardPoints = 0;
        rewardPoints++;  // increment
        rewardPoints--;  // decrement (back to 0)

        // --------- Relational Operators ---------
        boolean fullAttendance = (leaves == 0);          // ==
        boolean poorAttendance = (leaves > 5);           // >
        boolean decentWork = (workingDays >= 25);        // >=
        boolean lowWork = (workingDays <= 15);           // <=
        boolean bonusSalary = (netSalary >= 40000);      // >=
        boolean bonusEligible = !(leaves != 0);          // != + !

        // --------- Logical Operators ---------
        boolean excellentEmployee = (metTargets && fullAttendance); // &&
        boolean warningRequired = (poorAttendance || lowWork);      // ||
        boolean notEligibleForAward = !excellentEmployee;           // !

        // --------- Output ---------
        System.out.println("\n--- Employee Evaluation Report ---");
        System.out.println("Employee Name: " + name);
        System.out.println("Daily Salary: ₹" + dailySalary);
        System.out.println("Salary Earned: ₹" + salaryEarned);
        System.out.println("Leave Deduction: ₹" + leaveDeduction);
        System.out.println("Net Salary: ₹" + netSalary);
        System.out.println("Salary is Even? (mod 2): " + (remainder == 0));

        // Logical Output
        System.out.println("Full Attendance: " + fullAttendance);
        System.out.println("Decent Working Days: " + decentWork);
        System.out.println("Poor Attendance: " + poorAttendance);
        System.out.println("Met Targets: " + metTargets);

        System.out.println("\n>> Logical Evaluations:");
        System.out.println("Excellent Employee (Targets + No Leaves)? " + excellentEmployee);
        System.out.println("Needs HR Warning (Too Many Leaves || Low Days)? " + warningRequired);
        System.out.println("Award Eligible? " + !notEligibleForAward);

        if (bonusSalary && excellentEmployee) {
            System.out.println("✅ Bonus Status: Eligible");
        } else {
            System.out.println("❌ Bonus Status: Not Eligible");
        }

        scanner.close();
    }
}
