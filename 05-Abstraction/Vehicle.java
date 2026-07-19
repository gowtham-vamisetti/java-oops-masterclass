// Level 5: Abstraction - Vehicle Abstract Class
// This demonstrates how to create an abstract class

public abstract class Vehicle {
    // Common attributes
    protected String brand;
    protected String color;
    protected int speed;
    
    // Constructor
    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.speed = 0;
    }
    
    // Abstract methods - must be implemented by child classes
    public abstract void start();
    
    public abstract void stop();
    
    public abstract void accelerate();
    
    // Concrete method - common for all vehicles
    public void displayInfo() {
        System.out.println("\n--- Vehicle Information ---");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }
    
    // Concrete method - common for all vehicles
    public void honk() {
        System.out.println("Honking: Beep! Beep!");
    }
}
