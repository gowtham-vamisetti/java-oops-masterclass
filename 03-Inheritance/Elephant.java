// Assignment: Level 3 - Animal Sanctuary System
// Elephant class - extends Animal

public class Elephant extends AnimalClass {
    double trunkLength;  // in cm
    
    // Constructor
    public Elephant(String name, int age, double weight, String habitat, double trunkLength) {
        super(name, age, weight, habitat);
        this.trunkLength = trunkLength;
    }
    
    // Elephant-specific sound
    @Override
    public void makeSound() {
        System.out.println("Elephant Sound: TRUMPEEET!");
    }
    
    // Override move - specific to Elephant
    @Override
    public void move() {
        System.out.println(name + " is walking slowly with family herd");
    }
    
    // Override eat - specific to Elephant
    @Override
    public void eat() {
        System.out.println(name + " is eating leaves and grass");
    }
    
    // Override sleep - specific to Elephant
    @Override
    public void sleep() {
        System.out.println(name + " is sleeping standing up");
    }
    
    // Calculate age in elephant years (1 elephant year = 7 human years)
    @Override
    public int getAnimalYears() {
        return age * 7;
    }
    
    // Display Elephant information
    @Override
    public void displayInfo() {
        System.out.println("\n=== Elephant Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years (" + getAnimalYears() + " in elephant years)");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Habitat: " + habitat);
        System.out.println("Trunk Length: " + trunkLength + " cm");
    }
}