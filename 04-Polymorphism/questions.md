# Practice Questions & Assignments - Level 4

## Question 1: Calculator with Method Overloading
Create a `Calculator` class with overloaded `add()` methods:

**Overload Options:**
- `add(int a, int b)` - Two integers
- `add(double a, double b)` - Two doubles
- `add(int a, int b, int c)` - Three integers
- `add(String a, String b)` - String concatenation

**Example:**
```java
Calculator calc = new Calculator();
System.out.println(calc.add(5, 3));              // 8
System.out.println(calc.add(5.5, 3.2));         // 8.7
System.out.println(calc.add(5, 3, 2));          // 10
System.out.println(calc.add("Hello", "World")); // HelloWorld
```

---

## Question 2: Shape Area Calculation
Create abstract `Shape` class with concrete implementations:

**Shape (Abstract):**
- `getArea()` - abstract
- `getPerimeter()` - abstract

**Child Classes:**
- `Triangle` - calculate area and perimeter
- `Square` - calculate area and perimeter

---

## Assignment: Gaming Equipment Store System

**Task:** Create a complete e-commerce system for gaming equipment using polymorphism:

**Product (Abstract Parent Class):**
- Attributes: productId, name, price, stock
- Abstract methods: displayDetails(), calculateDiscount(), applyTax()
- Regular methods: getAvailability(), updateStock()

**Specific Products (extend Product):**

1. **Gaming Console**
   - Additional: brand (PlayStation, Xbox, Nintendo), memory
   - Discount: 15% for all
   - Tax: 8%

2. **Gaming Headset**
   - Additional: connectionType (Wired, Wireless), frequency
   - Discount: 20% if price > $100, 10% otherwise
   - Tax: 5%

3. **Gaming Mouse**
   - Additional: dpi, buttons
   - Discount: 25% for all
   - Tax: 5%

4. **Gaming Keyboard**
   - Additional: keyType (Mechanical, Membrane), backlighting
   - Discount: 18% for all
   - Tax: 5%

**Features:**
- Demonstrate method overriding
- Show polymorphism with product array
- Calculate total price with tax and discount
- Display all product details
- Check inventory

---

## Expected Output Example

```
=== Gaming Console ===
Product ID: PS001
Name: PlayStation 5
Brand: PlayStation
Memory: 825 GB
Original Price: $499.99
Discount (15%): -$75.00
Discounted Price: $424.99
Tax (8%): $33.99
Final Price: $458.98
Stock Available: 10

=== Gaming Headset ===
Product ID: HS001
Name: SteelSeries Arctis Pro
Connection Type: Wireless
Frequency: 2.4 GHz
Original Price: $329.99
Discount (20%): -$66.00
Discounted Price: $263.99
Tax (5%): $13.20
Final Price: $277.19
Stock Available: 25

=== Gaming Mouse ===
Product ID: MS001
Name: Razer DeathAdder V3
DPI: 30000
Buttons: 8
Original Price: $69.99
Discount (25%): -$17.50
Discounted Price: $52.49
Tax (5%): $2.62
Final Price: $55.11
Stock Available: 50

=== Gaming Keyboard ===
Product ID: KB001
Name: Corsair K95
Key Type: Mechanical
Backlighting: RGB
Original Price: $199.99
Discount (18%): -$36.00
Discounted Price: $163.99
Tax (5%): $8.20
Final Price: $172.19
Stock Available: 15
```

---

## Implementation Guide

1. Create `Product.java` (abstract parent class)
2. Create `GamingConsole.java`, `GamingHeadset.java`, `GamingMouse.java`, `GamingKeyboard.java`
3. Create `GamingStoreTest.java` to demonstrate polymorphism
4. Show all products in an array
5. Calculate final prices with proper overrides

---

## Checklist

- [ ] Abstract Product class created
- [ ] All 4 product classes extend Product
- [ ] All abstract methods overridden
- [ ] Discount calculation specific to each product
- [ ] Tax calculation implemented
- [ ] Polymorphism demonstrated with product array
- [ ] Final price calculation correct
- [ ] All output displays properly
- [ ] Code compiles without errors
- [ ] No runtime errors

---

## Key Learning Points

✅ Method overloading (same name, different parameters)
✅ Method overriding (parent-child implementation)
✅ Abstract classes and methods
✅ Polymorphism in practice
✅ Runtime method resolution
✅ Using @Override annotation
