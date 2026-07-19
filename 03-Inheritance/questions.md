# Practice Questions & Assignments - Level 3

## Question 1: Vehicle and Car Hierarchy
Create a `Vehicle` parent class and `Car` child class:

**Vehicle (Parent):**
- Attributes: brand, color, speed, fuelType
- Methods: start(), stop(), accelerate(int amount), displayInfo()

**Car (Child):**
- Additional attributes: numDoors, trunkCapacity
- Override accelerate() - cars accelerate faster than generic vehicles
- Override displayInfo() to show car-specific info

---

## Question 2: Employee Hierarchy
Create an `Employee` parent class with `Manager` and `Developer` child classes:

**Employee:**
- Attributes: empId, name, salary, department
- Methods: work(), displayInfo()

**Manager (extends Employee):**
- Additional: teamsManaged
- Override work() to show "Conducting meetings and planning"

**Developer (extends Employee):**
- Additional: programmingLanguage
- Override work() to show "Writing and testing code"

---

## Assignment: Animal Sanctuary System

**Task:** Create a complete animal hierarchy system:

**Animal (Abstract Parent):**
- Attributes: name, age, weight, habitat
- Methods: eat(), sleep(), move(), displayInfo()

**Specific Animals (extend Animal):**
1. **Lion**
   - Additional: maneSize
   - Override move() - "Running fast on the savanna"
   - Override eat() - "Hunting for prey"

2. **Elephant**
   - Additional: trunkLength
   - Override move() - "Walking slowly with family herd"
   - Override eat() - "Eating leaves and grass"

3. **Penguin**
   - Additional: wingSpan
   - Override move() - "Swimming and waddling on ice"
   - Override eat() - "Catching fish underwater"

**Features:**
- Each animal makes its own sound (roar, trumpet, squawk)
- Calculate age in animal years
- Display complete animal information
- Demonstrate polymorphism with array of animals

---

## Expected Output Example

```
=== Lion Information ===
Name: Simba
Age: 5 years (35 in lion years)
Weight: 190 kg
Habitat: Savanna
Mane Size: 25 cm

Lion Sound: ROAAAR!!!
Simba is running fast on the savanna
Simba is hunting for prey
Simba is sleeping in the shade
```

---

## Checklist

- [ ] Animal parent class with all attributes and methods
- [ ] All three animal child classes properly extending Animal
- [ ] Constructor in each class initializing all attributes
- [ ] Methods properly overridden in child classes
- [ ] Polymorphism demonstrated with array of animals
- [ ] Sound methods implemented for each animal
- [ ] Age calculation in animal years working
- [ ] All output displays correctly
- [ ] Code compiles without errors