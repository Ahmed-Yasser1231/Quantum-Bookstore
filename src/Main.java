public class Main {
    public static void main(String[] args) {
        QuantumBookStore store = new QuantumBookStore();

        // Add books to inventory
        store.addBook(new PaperBook("123", "Java Basics", "2022", 20.0, 10));
        store.addBook(new EBook("456", "Advanced Java", "2020", 15.0, "PDF"));
        store.addBook(new DemoBook("789", "Java Showcase", "2023", 5.0));
        store.addBook(new PaperBook("101", "Quantum Computing", "1990", 30.0, 5));


        // Remove outdated books
        store.removeOutdatedBook(10);

        // Buy books
        try {
            double amount = store.buyBook("123", 2, "customer@example.com", "123 Main St");
            System.out.println("Paid amount: $" + amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            store.buyBook("789", 1, "customer@example.com", "Alexandria");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            double amount = store.buyBook("456", 1, "customer@example.com", "Cairo");
            System.out.println("Paid amount: $" + amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}