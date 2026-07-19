# Practice Questions & Assignments - Level 1

## Question 1: Create a Book Class
Create a class called `Book` with the following attributes:
- title (String)
- author (String)
- pages (int)
- price (double)

Add a method `displayInfo()` to print book details.

### Solution:
```java
public class Book {
    String title;
    String author;
    int pages;
    double price;
    
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Price: $" + price);
    }
}
```

---

## Question 2: Create Multiple Objects
Create 3 Book objects with different values and display their information.

### Solution:
```java
public class BookTest {
    public static void main(String[] args) {
        // Book 1
        Book book1 = new Book();
        book1.title = "Java Programming";
        book1.author = "John Doe";
        book1.pages = 500;
        book1.price = 29.99;
        
        // Book 2
        Book book2 = new Book();
        book2.title = "Python Basics";
        book2.author = "Jane Smith";
        book2.pages = 350;
        book2.price = 24.99;
        
        // Book 3
        Book book3 = new Book();
        book3.title = "Web Development";
        book3.author = "Mike Johnson";
        book3.pages = 450;
        book3.price = 34.99;
        
        // Display all books
        System.out.println("=== Book 1 ===");
        book1.displayInfo();
        
        System.out.println("\n=== Book 2 ===");
        book2.displayInfo();
        
        System.out.println("\n=== Book 3 ===");
        book3.displayInfo();
    }
}
```

---

## Question 3: Student Class with Methods
Create a `Student` class with:
- name, rollNumber, marks1, marks2, marks3
- Method to calculate average marks
- Method to determine grade (A, B, C, D, F)
- Method to display student info

### Solution:
```java
public class Student {
    String name;
    int rollNumber;
    double marks1, marks2, marks3;
    
    double calculateAverage() {
        return (marks1 + marks2 + marks3) / 3;
    }
    
    char getGrade() {
        double average = calculateAverage();
        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else return 'F';
    }
    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + getGrade());
    }
}
```

---

## Assignment: Create Your Own Class

**Task:** Create a `MobilePhone` class with the following:

**Attributes:**
- brand (String)
- model (String)
- price (double)
- ramGB (int)
- storageGB (int)

**Methods:**
- displaySpecifications() - Print all details
- applyDiscount(double discountPercent) - Calculate discounted price
- isAffordable(double budget) - Check if price is within budget

**Expected Output:**
```
=== iPhone 13 Specifications ===
Brand: Apple
Model: iPhone 13
Price: $999.99
RAM: 4 GB
Storage: 128 GB

After 10% discount: $899.99
Is affordable within budget of $900? true
```

---

## How to Test

1. Create `Book.java` and `BookTest.java` in the `01-Classes-and-Objects` folder
2. Create `Student.java` and test it
3. Create `MobilePhone.java` with assignment requirements
4. Compile and run each file
5. Verify the output matches expected results

---

## Checklist

- [ ] Book class created and tested
- [ ] Multiple Book objects created
- [ ] Student class with all methods working
- [ ] MobilePhone class completed with all features
- [ ] All programs compile without errors
- [ ] Output displays correctly