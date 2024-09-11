package encapsulation;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of BankAccount
        BankAccount myAccount = new BankAccount("John Doe", "1234567890", 1000.0);

        // Performing operations
        myAccount.deposit(500.0); // Deposit $500
        System.out.println("Balance: $" + myAccount.getBalance()); // Check balance

        myAccount.withdraw(200.0); // Withdraw $200
        System.out.println("Balance: $" + myAccount.getBalance()); // Check balance

        myAccount.withdraw(2000.0); // Attempt to withdraw more than the balance
        System.out.println("Balance: $" + myAccount.getBalance()); // Check balance
    }
}
