# Practice Questions & Assignments - Level 2

## Question 1: Employee Class with Encapsulation
Create an `Employee` class with proper encapsulation:

**Attributes:**
- employeeId (private, cannot change after creation)
- name (private)
- salary (private)
- department (private)

**Methods:**
- Getters for all attributes
- Setter for name with validation (not empty)
- Setter for salary with validation (must be positive)
- Setter for department with validation

---

## Question 2: Person Class with Email Validation
Create a `Person` class with email validation:

**Requirements:**
- firstName, lastName (private)
- email (private)
- age (private)

**Validation Rules:**
- Email must contain @ symbol
- Age must be between 1 and 120
- Name fields cannot be empty

---

## Assignment: Bank Account with Advanced Operations

**Task:** Create a `BankAccount` class with the following features:

**Attributes (Private):**
- accountNumber
- accountHolder
- balance
- accountType (Savings, Checking, Business)

**Methods:**
- `deposit(amount)` - Add money, validate amount > 0
- `withdraw(amount)` - Remove money, check balance
- `transfer(amount, otherAccount)` - Transfer to another account
- `applyInterest()` - Apply interest based on account type (Savings: 5%, Checking: 2%)
- `displayStatement()` - Show account details
- `getBalance()` - Return current balance

**Expected Output:**
```
=== Account Statement ===
Account Number: ACC001
Account Holder: John Doe
Account Type: Savings
Balance: $1,000.00

✓ Deposit successful! Amount: $500.00
New Balance: $1,500.00

✓ Withdrawal successful! Amount: $200.00
New Balance: $1,300.00

Interest applied: $65.00
New Balance: $1,365.00
```

---

## Question 3: Product Class with Inventory
Create a `Product` class to manage inventory:

**Attributes:**
- productId (private, read-only)
- productName (private)
- price (private)
- quantity (private)

**Methods:**
- `addStock(amount)` - Increase inventory
- `removeStock(amount)` - Decrease inventory with validation
- `updatePrice(newPrice)` - Update price with validation
- `getTotalValue()` - Return price × quantity
- `displayProductInfo()` - Show all details

---

## Validation Checklist

- [ ] All fields are private
- [ ] All getters work correctly
- [ ] All setters validate input
- [ ] Invalid data is rejected
- [ ] Error messages are displayed
- [ ] Valid data is accepted
- [ ] Programs compile without errors
- [ ] All methods work as expected