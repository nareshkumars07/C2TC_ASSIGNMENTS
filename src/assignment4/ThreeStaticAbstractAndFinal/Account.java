package assignment4.ThreeStaticAbstractAndFinal;

public abstract class Account {
	protected String accountNumber, accountHolder;
    protected double balance;

    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        Bank.incrementAccounts();
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    public void printAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 1000;
    
    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance) {
        super(accountNumber, accountHolder, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Savings: ₹" + amount + " deposited.");
        } else {
            System.out.println("Savings: Invalid deposit.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= MIN_BALANCE) {
            balance -= amount;  // Fixed: was += instead of -=
            System.out.println("Savings: ₹" + amount + " withdrawn.");  // Fixed: was "deposited"
        } else {
            System.out.println("Savings: Cannot withdraw. min balance required");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

class CheckingAccount extends Account {
    private static final double OVERDRAFT_LIMIT = -5000;  // Fixed: should be negative

    public CheckingAccount(String accountNumber, String accountHolder, double initialBalance) {  // Fixed typo
        super(accountNumber, accountHolder, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Checking: ₹" + amount + " deposited.");
        } else {
            System.out.println("Checking: Invalid deposit.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Checking: ₹" + amount + " withdrawn.");  // Fixed: was "withdraw"
        } else {
            System.out.println("Checking: Cannot withdraw. overdraft limit exceeded.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
