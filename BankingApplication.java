import java.util.Scanner;

public class BankingApplication {
    private static double balance = 0.0;

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String input;

        do {
            System.out.println("\nWelcome to the Banking Application!");
            System.out.println("Please choose an option: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            
            input = sn.nextLine();

            switch (input) {
                case "1":
                    deposit(sn);
                    break;
                case "2":
                    withdraw(sn);
                    break;
                case "3":
                    checkBalance();
                    break;
                case "4":
                    System.out.println("Thank you for using the Simple Banking Application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (!input.equals("4"));

    }

    private static void deposit(Scanner sn) {
        System.out.print("Enter amount to deposit: ");
        double amount = sn.nextDouble();
        sn.nextLine();
        balance += amount;
        System.out.println("Amount deposited successfully. Current balance: " + balance);
    }

    private static void withdraw(Scanner sn) {
        System.out.print("Enter amount to withdraw: ");
        double amount = sn.nextDouble();
        sn.nextLine();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    private static void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}
