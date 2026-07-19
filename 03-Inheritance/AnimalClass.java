// Assignment: Level 3 - Animal Sanctuary System
// Abstract Animal parent class

public abstract class AnimalClass {
    protected String name;
    protected int age;
    protected double weight;
    protected String habitat;
    
    // Constructor
    public AnimalClass(String name, int age, double weight, String habitat) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.habitat = habitat;
    }
    
    // Abstract methods that must be implemented by child classes
    public abstract void makeSound();
    public abstract void move();
    public abstract void eat();
    public abstract void sleep();
    public abstract int getAnimalYears();
    public abstract void displayInfo();
}