// Test file for Animal Sanctuary assignment

public class AnimalSanctuaryTest {
    public static void main(String[] args) {
        // Create different animals
        Lion lion = new Lion("Simba", 5, 190, "Savanna", 25);
        Elephant elephant = new Elephant("Dumbo", 10, 6000, "Grassland", 200);
        Penguin penguin = new Penguin("Pingu", 2, 30, "Antarctic", 60);
        
        // Display information for each animal
        lion.displayInfo();
        lion.makeSound();
        lion.move();
        lion.eat();
        lion.sleep();
        
        System.out.println("\n" + "=".repeat(50));
        
        elephant.displayInfo();
        elephant.makeSound();
        elephant.move();
        elephant.eat();
        elephant.sleep();
        
        System.out.println("\n" + "=".repeat(50));
        
        penguin.displayInfo();
        penguin.makeSound();
        penguin.move();
        penguin.eat();
        penguin.sleep();
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("DEMONSTRATING POLYMORPHISM");
        System.out.println("=".repeat(50));
        
        // Array of different animals - demonstrating polymorphism
        AnimalClass[] animals = {lion, elephant, penguin};
        
        System.out.println("\nAll animals in the sanctuary:");
        for (AnimalClass animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            animal.move();
            System.out.println();
        }
    }
}