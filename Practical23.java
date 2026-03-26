class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    void deposit(double amount) {
        System.out.println("\nDepositing " + amount);
        balance += amount;
        System.out.println("Updated Balance = " + balance);
    }

    void withdraw(double money) {
        System.out.println("\nWithdrawing " + money);

        if (balance >= money) {
            balance -= money;
            System.out.println("Updated Balance = " + balance);
        } else {
            System.out.println("Balance insufficient");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance = " + balance);
    }
}

// Saving Account
class SavingAccount extends BankAccount {
    double interestRate = 5;

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest (Saving Account) = " + interest);
    }
}

// Fixed Deposit Account
class FixedDepositAccount extends BankAccount {
    double interestRate = 7;

    void maturityAmount(int years) {
        double maturity = balance + (balance * interestRate * years) / 100;
        System.out.println("Maturity Amount after " + years + " years = " + maturity);
    }
}

// Main Class
class Practical23 {
    public static void main(String[] args) {

        // Saving Account
        SavingAccount sa = new SavingAccount();
        sa.openAccount("SA101", "Hemangi", 10000);

        System.out.println("----- Saving Account Details -----");
        sa.displayDetails();

        sa.deposit(5000);
        sa.withdraw(8000);
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println("\n-------------------------------\n");

        // Fixed Deposit Account
        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("FD201", "Chavda", 500000);

        System.out.println("----- Fixed Deposit Account Details -----");
        fd.displayDetails();

        fd.maturityAmount(3);
    }
}    