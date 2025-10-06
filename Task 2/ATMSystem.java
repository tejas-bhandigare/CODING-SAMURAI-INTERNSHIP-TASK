import java.util.Scanner;

public class ATMSystem {
    // Array to store balances for 3 users
    static double[] accountBalances = {5000.0, 3000.0, 7000.0};
    static int currentUser = -1; // track logged in user

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userChoice;

        System.out.println("===== Welcome to Simple ATM Banking System =====");

        // User login simulation
        System.out.println("Enter your account number (0, 1, or 2): ");
        int accNumber = sc.nextInt();

        if (accNumber < 0 || accNumber >= accountBalances.length) {
            System.out.println("Invalid account number! Exiting...");
            return;
        }

        currentUser = accNumber;

        do {
            System.out.println("\n----- ATM Menu -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney(sc);
                    break;
                case 3:
                    withdrawMoney(sc);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (userChoice != 4);

        sc.close();
    }

    // Method to check balance
    public static void checkBalance() {
        System.out.println("Your current balance is: ₹" + accountBalances[currentUser]);
    }

    // Method to deposit money
    public static void depositMoney(Scanner sc) {
        System.out.println("Enter amount to deposit: ₹");
        double amount = sc.nextDouble();

        if (amount > 0) {
            accountBalances[currentUser] += amount;
            System.out.println("Deposit successful! New balance: ₹" + accountBalances[currentUser]);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public static void withdrawMoney(Scanner sc) {
        System.out.println("Enter amount to withdraw: ₹");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > accountBalances[currentUser]) {
            System.out.println("Insufficient balance!");
        } else {
            accountBalances[currentUser] -= amount;
            System.out.println("Withdrawal successful! Remaining balance: ₹" + accountBalances[currentUser]);
        }
    }
}
