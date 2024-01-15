package task2;

import java.util.Scanner;

class BankAccount {
    private
 
    double balance;
    
        public BankAccount(double initialBalance){
        balance = initialBalance;
    }
    
        public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    } 
    
        public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    public double checkBalance() {
        return balance;
    }
}
class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + account.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    account.withdraw(amount);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    amount = scanner.nextDouble();
                    account.deposit(amount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

 class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); 
        ATM atm = new ATM(account);
        atm.run();
    }
}
