// Test file for MobilePhone assignment

public class MobilePhoneTest {
    public static void main(String[] args) {
        // Create mobile phone object
        MobilePhone phone = new MobilePhone();
        phone.brand = "Apple";
        phone.model = "iPhone 13";
        phone.price = 999.99;
        phone.ramGB = 4;
        phone.storageGB = 128;
        
        // Display specifications
        phone.displaySpecifications();
        
        // Apply 10% discount
        phone.applyDiscount(10);
        
        // Check affordability
        phone.checkAffordability(900);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Test with another phone
        MobilePhone phone2 = new MobilePhone();
        phone2.brand = "Samsung";
        phone2.model = "Galaxy S21";
        phone2.price = 799.99;
        phone2.ramGB = 8;
        phone2.storageGB = 256;
        
        phone2.displaySpecifications();
        phone2.applyDiscount(15);
        phone2.checkAffordability(750);
    }
}

/* Expected Output:
=== Apple iPhone 13 Specifications ===
Brand: Apple
Model: iPhone 13
Price: $999.99
RAM: 4 GB
Storage: 128 GB

After 10% discount: $899.99
Is affordable within budget of $900? true

==================================================

=== Samsung Galaxy S21 Specifications ===
Brand: Samsung
Model: Galaxy S21
Price: $799.99
RAM: 8 GB
Storage: 256 GB

After 15% discount: $679.99
Is affordable within budget of $750? true
*/