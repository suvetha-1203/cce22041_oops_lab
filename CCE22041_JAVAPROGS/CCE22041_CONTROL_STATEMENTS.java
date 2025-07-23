import java.util.Scanner;

public class CCE22041_CONTROL_STATEMENTS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int correctPin = 1234;
        int balance = 10000;

        // --- if, if-else, nested if ---
        System.out.print("Enter your 4-digit PIN: ");
        int enteredPin = scanner.nextInt();

        if (enteredPin == correctPin) {
            System.out.println("Access Granted!");
        } else {
            System.out.println("Wrong PIN. Access Denied.");
            return; // Exit the program
        }

        // --- do-while loop: ATM menu repeats until user chooses to exit ---
        int choice;
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Mini Statement");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // --- switch-case + if-else ladder inside ---
            switch (choice) {
                case 1:
                    System.out.println("Your balance is ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    int deposit = scanner.nextInt();
                    if (deposit <= 0) {
                        System.out.println("Invalid amount.");
                        break;
                    }
                    balance += deposit;
                    System.out.println("Deposited ₹" + deposit);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    int withdraw = scanner.nextInt();
                    if (withdraw <= 0) {
                        System.out.println("Invalid amount.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawn ₹" + withdraw);
                    }
                    break;

                case 4:
                    // --- for loop with break and continue ---
                    System.out.println("Last 5 Transactions:");
                    for (int i = 1; i <= 5; i++) {
                        if (i == 3) continue; // skip 3rd record
                        if (i == 5) break;    // stop early
                        System.out.println("Transaction " + i + ": ₹" + (100 * i));
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the ATM!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            // --- while loop example (just for demo) ---
            int retry = 0;
            while (retry < 0) { // won't run but added to demo
                System.out.println("Retry attempt: " + retry);
                retry++;
            }

        } while (choice != 5); // end when user chooses to exit

        scanner.close();
    }
}
