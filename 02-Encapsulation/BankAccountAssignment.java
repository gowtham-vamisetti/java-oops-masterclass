// Assignment: Level 2 - Bank Account with Advanced Operations

public class BankAccount {
    // Private attributes
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private String accountType;  // Savings, Checking, Business
    
    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double initialBalance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
        this.accountType = accountType;
    }
    
    // Getters
    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }
    public String getAccountType() { return accountType; }
    
    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✓ Deposit successful! Amount: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("✗ Error: Deposit amount must be positive!");
        }
    }
    
    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("✗ Error: Withdrawal amount must be positive!");
        } else if (amount > balance) {
            System.out.println("✗ Error: Insufficient balance!");
            System.out.println("Current Balance: $" + balance);
        } else {
            balance -= amount;
            System.out.println("✓ Withdrawal successful! Amount: $" + amount);
            System.out.println("New Balance: $" + balance);
        }
    }
    
    // Transfer method
    public void transfer(double amount, BankAccount otherAccount) {
        if (amount <= 0) {
            System.out.println("✗ Error: Transfer amount must be positive!");
        } else if (amount > balance) {
            System.out.println("✗ Error: Insufficient balance for transfer!");
        } else {
            this.balance -= amount;
            otherAccount.balance += amount;
            System.out.println("✓ Transfer successful!");
            System.out.println("Transferred $" + amount + " from " + this.accountHolder + " to " + otherAccount.accountHolder);
            System.out.println(this.accountHolder + "'s new balance: $" + this.balance);
            System.out.println(otherAccount.accountHolder + "'s new balance: $" + otherAccount.balance);
        }
    }
    
    // Apply interest based on account type
    public void applyInterest() {
        double interestRate = 0;
        
        if (accountType.equals("Savings")) {
            interestRate = 0.05;  // 5%
        } else if (accountType.equals("Checking")) {
            interestRate = 0.02;  // 2%
        } else if (accountType.equals("Business")) {
            interestRate = 0.03;  // 3%
        }
        
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest applied: $" + interest + " (" + (interestRate * 100) + "%)");
        System.out.println("New Balance: $" + balance);
    }
    
    // Display account statement
    public void displayStatement() {
        System.out.println("\n=== Account Statement ===");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
    }
}