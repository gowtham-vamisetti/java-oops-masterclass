// Level 5: Abstraction - Truck Class (Child of Vehicle)
// This demonstrates implementing abstract methods for a different vehicle type

public class Truck extends Vehicle {
    private double cargoCapacity;  // in tons
    private double currentLoad;    // in tons
    
    // Constructor
    public Truck(String brand, String color, double cargoCapacity) {
        super(brand, color);
        this.cargoCapacity = cargoCapacity;
        this.currentLoad = 0;
    }
    
    // Implementation of abstract method - specific to Truck
    @Override
    public void start() {
        System.out.println(brand + " Truck is starting with a powerful engine!");
        speed = 5;
    }
    
    // Implementation of abstract method
    @Override
    public void stop() {
        System.out.println(brand + " Truck is stopping with air brakes...");
        speed = 0;
    }
    
    // Implementation of abstract method
    @Override
    public void accelerate() {
        speed += 15;
        System.out.println(brand + " Truck is accelerating! Speed: " + speed + " km/h");
    }
    
    // Truck-specific method
    public void loadCargo(double weight) {
        if (currentLoad + weight <= cargoCapacity) {
            currentLoad += weight;
            System.out.println("Cargo loaded! Current load: " + currentLoad + " tons");
        } else {
            System.out.println("Cannot load! Exceeds capacity!");
        }
    }
    
    // Truck-specific method
    public void unloadCargo(double weight) {
        if (weight <= currentLoad) {
            currentLoad -= weight;
            System.out.println("Cargo unloaded! Current load: " + currentLoad + " tons");
        } else {
            System.out.println("Cannot unload more than loaded cargo!");
        }
    }
    
    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
        System.out.println("Current Load: " + currentLoad + " tons");
    }
}
