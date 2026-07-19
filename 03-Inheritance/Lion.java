// Assignment: Level 3 - Animal Sanctuary System
// Lion class - extends Animal

public class Lion extends AnimalClass {
    double maneSize;  // in cm
    
    // Constructor
    public Lion(String name, int age, double weight, String habitat, double maneSize) {
        super(name, age, weight, habitat);
        this.maneSize = maneSize;
    }
    
    // Lion-specific sound
    @Override
    public void makeSound() {
        System.out.println("Lion Sound: ROAAAR!!!");
    }
    
    // Override move - specific to Lion
    @Override
    public void move() {
        System.out.println(name + " is running fast on the savanna");
    }
    
    // Override eat - specific to Lion
    @Override
    public void eat() {
        System.out.println(name + " is hunting for prey");
    }
    
    // Override sleep - specific to Lion
    @Override
    public void sleep() {
        System.out.println(name + " is sleeping in the shade");
    }
    
    // Calculate age in lion years (1 lion year = 7 human years)
    @Override
    public int getAnimalYears() {
        return age * 7;
    }
    
    // Display Lion information
    @Override
    public void displayInfo() {
        System.out.println("\n=== Lion Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years (" + getAnimalYears() + " in lion years)");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Habitat: " + habitat);
        System.out.println("Mane Size: " + maneSize + " cm");
    }
}