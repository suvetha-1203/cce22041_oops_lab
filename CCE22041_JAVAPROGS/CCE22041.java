import java.util.Scanner;

public class CCE22041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: User's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Input: Initial balance
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        // Input: Amount to deposit
        System.out.print("Enter amount to deposit: ");
        double deposit = scanner.nextDouble();
        balance += deposit;

        // Input: Amount to withdraw
        System.out.print("Enter amount to withdraw: ");
        double withdraw = scanner.nextDouble();

        // Check if withdrawal is possible
        if (withdraw > balance) {
            System.out.println("Insufficient balance! Withdrawal denied.");
        } else {
            balance -= withdraw;
            System.out.println("Withdrawal successful!");
        }

        // Output: Final account summary
        System.out.println("\n--- Account Summary ---");
        System.out.println("Account Holder: " + name);
        System.out.println("Final Balance: ₹" + balance);

        scanner.close();
    }
}
