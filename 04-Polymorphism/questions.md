# Practice Questions & Assignments - Level 4

## Question 1: Calculator with Method Overloading
Create a `Calculator` class with overloaded `add()` methods:

**Overload Options:**
- `add(int a, int b)` - Two integers
- `add(double a, double b)` - Two doubles
- `add(int a, int b, int c)` - Three integers
- `add(String a, String b)` - String concatenation

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
```

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