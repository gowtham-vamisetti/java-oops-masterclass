// Assignment: Level 3 - Animal Sanctuary System
// Penguin class - extends Animal

public class Penguin extends AnimalClass {
    double wingSpan;  // in cm
    
    // Constructor
    public Penguin(String name, int age, double weight, String habitat, double wingSpan) {
        super(name, age, weight, habitat);
        this.wingSpan = wingSpan;
    }
    
    // Penguin-specific sound
    @Override
    public void makeSound() {
        System.out.println("Penguin Sound: SQUAWK SQUAWK!");
    }
    
    // Override move - specific to Penguin
    @Override
    public void move() {
        System.out.println(name + " is swimming and waddling on ice");
    }
    
    // Override eat - specific to Penguin
    @Override
    public void eat() {
        System.out.println(name + " is catching fish underwater");
    }
    
    // Override sleep - specific to Penguin
    @Override
    public void sleep() {
        System.out.println(name + " is sleeping on ice");
    }
    
    // Calculate age in penguin years (1 penguin year = 5 human years)
    @Override
    public int getAnimalYears() {
        return age * 5;
    }
    
    // Display Penguin information
    @Override
    public void displayInfo() {
        System.out.println("\n=== Penguin Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years (" + getAnimalYears() + " in penguin years)");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Habitat: " + habitat);
        System.out.println("Wing Span: " + wingSpan + " cm");
    }
}