Quantum Book Store

Project Description
The Quantum Book Store is an extensible Java-based application designed to manage an online bookstore. It supports multiple types of books, including paper books, eBooks, and demo books. The system allows adding books to inventory, removing outdated books, and purchasing books with specific handling for each type.

Features
- Book Types:
  - Paper Book: Physical books with stock that can be shipped.
  - EBook: Digital books with file types that can be sent via email.
  - Demo Book: Showcase books that are not for sale.
- Inventory Management:
  - Add books to the inventory.
  - Remove outdated books based on their age.
- Purchase Functionality:
  - Buy books by providing ISBN, quantity, email, and address.
  - Handle stock reduction for paper books.
  - Send eBooks via email.
  - Throw errors for unsupported operations or unavailable stock.

Project Structure
src/
├── Book.java                # Abstract base class for all book types
├── PaperBook.java           # Class for paper books
├── EBook.java               # Class for eBooks
├── DemoBook.java            # Class for demo books
├── QuantumBookStore.java    # Main class for managing the bookstore
├── Main.java                # Entry point for testing the bookstore functionality

How to Run
1. Clone the repository to your local machine.
2. Open the project in IntelliJ IDEA or any Java IDE.
3. Run the Main.java file to test the functionality.

Example Usage
Adding Books
store.addBook(new PaperBook("123", "Java Basics", "2022", 20.0, 10));
store.addBook(new EBook("456", "Advanced Java", "2020", 15.0, "PDF"));
store.addBook(new DemoBook("789", "Java Showcase", "2023", 5.0));

Removing Outdated Books
store.removeOutdatedBook(10);

Buying Books
double amount = store.buyBook("123", 2, "customer@example.com", "123 Main St");
System.out.println("Paid amount: $" + amount);

Requirements
- Java 8 or higher
- IntelliJ IDEA or any Java IDE

Extensibility
The system is designed to be easily extensible. To add a new type of product:
1. Create a new class extending the Book class.
2. Implement the buy method with specific behavior for the new product type.