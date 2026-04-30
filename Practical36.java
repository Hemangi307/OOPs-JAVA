// Custom Exception
class NotSufficientFundException extends Exception {
    public NotSufficientFundException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;
 // Constructor
    public BankAccount() {
        balance = 1000.00;
    }
 // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs. " + amount);
        System.out.println("Current Balance: Rs. " + balance);
    }
 // Withdraw method
    public void withdraw(double amount) throws NotSufficientFundException {
        if (amount > balance) {
            throw new NotSufficientFundException("Not Sufficient Fund");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
            System.out.println("Remaining Balance: Rs. " + balance);
        }
    }
}
    public class Practical36 {
    public static void main(String[] args) {
        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");
 BankAccount account = new BankAccount();
        try {
            // Deposit
            account.deposit(1000.00);

            System.out.println();

            // Withdrawals
            account.withdraw(400.00);
            System.out.println();

            account.withdraw(300.00);
            System.out.println();

            account.withdraw(500.00); // Should throw exception

        } catch (NotSufficientFundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("\nBanking process completed.");
    }
}
