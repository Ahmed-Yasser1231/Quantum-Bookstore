# Quantum Book Store

The **Quantum Book Store** is a Java-based application designed to manage an online bookstore. It supports multiple book types and provides functionality to add, remove, and purchase books, with specific handling logic based on the book type.

---

## 📚 Features

### ✅ Book Types
- **Paper Book**: Physical books with stock management and shipping support.
- **EBook**: Digital books (e.g., PDF) sent via email.
- **Demo Book**: Showcase-only books that are not available for sale.

### 🧰 Inventory Management
- Add books to the inventory.
- Remove outdated books based on their age.

### 🛒 Purchase Functionality
- Buy books using their ISBN.
- Automatically handle stock reduction for paper books.
- Send eBooks via email to the customer.
- Throw exceptions for unsupported operations or unavailable stock.

---

## 🗂️ Project Structure

```
src/
├── Book.java             # Abstract base class for all book types
├── PaperBook.java        # Implementation for paper books
├── EBook.java            # Implementation for eBooks
├── DemoBook.java         # Implementation for demo books
├── QuantumBookStore.java # Bookstore logic: add, remove, purchase
├── Main.java             # Entry point for testing
```

---

## 🚀 Getting Started

### Prerequisites
- **Java 8** or higher
- **IntelliJ IDEA** or any Java-compatible IDE

### How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/Quantum-Bookstore.git
   ```
2. Open the project in your IDE.
3. Run the `Main.java` file to test the functionality.

---

## 💡 Example Usage

### Adding Books
```java
store.addBook(new PaperBook("123", "Java Basics", "2022", 20.0, 10));
store.addBook(new EBook("456", "Advanced Java", "2020", 15.0, "PDF"));
store.addBook(new DemoBook("789", "Java Showcase", "2023", 5.0));
```

### Removing Outdated Books
```java
store.removeOutdatedBook(10);
```

### Buying Books
```java
double amount = store.buyBook("123", 2, "customer@example.com", "123 Main St");
System.out.println("Paid amount: $" + amount);
```

---

## 🧱 Extensibility

The system is designed with extensibility in mind. To add a new product type:
1. Create a new class extending `Book`.
2. Implement the `buy` method with the new product's custom behavior.

---

## 📜 License

This project is for educational/demo purposes. Feel free to modify and use it in your own learning projects.

---

## 👨‍💻 Author

**Ahmed Yasser**  
Feel free to connect via [GitHub](https://github.com/Ahmed-Yasser1231)
