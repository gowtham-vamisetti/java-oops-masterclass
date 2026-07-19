// Test file for BankAccount assignment

public class BankAccountTest {
    public static void main(String[] args) {
        // Create two bank accounts
        BankAccount account1 = new BankAccount("ACC001", "John Doe", 1000, "Savings");
        BankAccount account2 = new BankAccount("ACC002", "Jane Smith", 500, "Checking");
        
        // Display initial statement
        account1.displayStatement();
        account2.displayStatement();
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("OPERATIONS ON ACCOUNT 1");
        System.out.println("=".repeat(50));
        
        // Deposit
        System.out.println("\n--- Deposit Operation ---");
        account1.deposit(500);
        
        // Withdraw
        System.out.println("\n--- Withdrawal Operation ---");
        account1.withdraw(200);
        
        // Try to withdraw more than balance
        System.out.println("\n--- Invalid Withdrawal ---");
        account1.withdraw(2000);
        
        // Apply interest
        System.out.println("\n--- Apply Interest ---");
        account1.applyInterest();
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("TRANSFER OPERATION");
        System.out.println("=".repeat(50));
        
        // Transfer money
        System.out.println("\n--- Transfer from Account1 to Account2 ---");
        account1.transfer(300, account2);
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("FINAL STATEMENTS");
        System.out.println("=".repeat(50));
        
        // Display final statements
        account1.displayStatement();
        account2.displayStatement();
        
        // Apply interest to account2
        System.out.println("\n--- Apply Interest to Account2 ---");
        account2.applyInterest();
        account2.displayStatement();
    }
}