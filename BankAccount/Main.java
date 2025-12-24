class BankAccount {

    // Private variables (Encapsulation)
    private String accountNumber;
    private double balance;

    // Constructor to create a new account
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter method to check balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient balance. Withdrawal failed.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}



public class Main {
    public static void main(String[] args) {

        // Create a new bank account
        BankAccount account = new BankAccount("BA1001", 3000.00);

        // Deposit amount
        account.deposit(2000);

        // Withdraw amount
        account.withdraw(1000);

        // Display account information
        account.displayAccountInfo();
    }
}