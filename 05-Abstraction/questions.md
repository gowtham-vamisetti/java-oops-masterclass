# Practice Questions & Assignments - Level 5

## Question 1: Payment Methods with Abstraction
Create abstract `PaymentMethod` with concrete implementations:

**PaymentMethod (Abstract):**
- Abstract methods: processPayment(), validatePayment(), getTransactionId()
- Concrete method: printReceipt()

**Child Classes:**
- `CreditCard` - validate card number format
- `DebitCard` - check account balance
- `PayPal` - validate email format
- `Cryptocurrency` - validate wallet address

---

## Question 2: Database Connections
Create abstract `DatabaseConnection` class:

**DatabaseConnection (Abstract):**
- Abstract methods: connect(), disconnect(), executeQuery()
- Concrete methods: logConnection(), getConnectionStatus()

**Child Classes:**
- `MySQLConnection`
- `MongoDBConnection`
- `PostgreSQLConnection`

---

## Assignment: Restaurant Management System with Abstraction

**Task:** Create a complete restaurant management system using abstraction:

**Food (Abstract Parent Class):**
- Attributes: itemId, itemName, price, preparationTime, ingredients
- Abstract methods: prepare(), serve(), calculateNutrition()
- Concrete methods: getItemInfo(), increasePrice(), decreasePrice()

**Specific Food Types (extend Food):**

1. **Pizza**
   - Additional: crust, toppings, size
   - Prepare: "Kneading dough → Adding sauce → Adding toppings → Baking 15 mins"
   - Serve: "Serving hot pizza with sides"
   - Nutrition: Calculate based on toppings and size

2. **Burger**
   - Additional: patties, buns, sauce
   - Prepare: "Grilling patty → Toasting buns → Adding toppings → Assembling"
   - Serve: "Serving burger with fries and drink"
   - Nutrition: Calculate based on patties and sauce

3. **Salad**
   - Additional: vegetables, dressing, serveType
   - Prepare: "Washing vegetables → Chopping → Mixing → Adding dressing"
   - Serve: "Serving chilled salad"
   - Nutrition: Calculate based on vegetables

4. **Pasta**
   - Additional: noodleType, sauce, proteinType
   - Prepare: "Boiling water → Cooking noodles → Preparing sauce → Mixing"
   - Serve: "Serving hot pasta with parmesan"
   - Nutrition: Calculate based on ingredients

---

## Key Learning Points

✅ Abstract classes hide implementation complexity
✅ Child classes implement specific behaviors
✅ Abstraction enforces consistent interface
✅ Polymorphism works with abstract classes
✅ Real-world problem-solving with OOP
✅ Separating interface from implementation