// Assignment: Level 1 - Mobile Phone Class
// Create a MobilePhone class with specifications and methods

public class MobilePhone {
    String brand;
    String model;
    double price;
    int ramGB;
    int storageGB;
    
    // Display specifications
    void displaySpecifications() {
        System.out.println("\n=== " + brand + " " + model + " Specifications ===");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("RAM: " + ramGB + " GB");
        System.out.println("Storage: " + storageGB + " GB");
    }
    
    // Apply discount and return discounted price
    double applyDiscount(double discountPercent) {
        double discount = price * (discountPercent / 100);
        double discountedPrice = price - discount;
        System.out.println("\nAfter " + discountPercent + "% discount: $" + discountedPrice);
        return discountedPrice;
    }
    
    // Check if phone is affordable within budget
    boolean isAffordable(double budget) {
        return price <= budget;
    }
    
    // Display affordability
    void checkAffordability(double budget) {
        boolean affordable = isAffordable(budget);
        System.out.println("Is affordable within budget of $" + budget + "? " + affordable);
    }
}