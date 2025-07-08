import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuantumBookStore {
    private List<Book> inventory = new ArrayList<>();

    public void addBook(Book book) {
        inventory.add(book);
        System.out.println("Added a book - " + book.getTitle());
    }

    public Book removeOutdatedBook(int years) {
        Iterator<Book> iterator = inventory.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            int bookAge = 2025 - Integer.parseInt(book.getPublishYear());
            if (bookAge > years) {
                iterator.remove();
                System.out.println("Removed an outdated book - " + book.getTitle());
                return book;
            }
        }
        return null;
    }

    public double buyBook(String ISBN, int quantity, String email, String address) {
        for (Book book : inventory) {
            if (book.getISBN().equals(ISBN)) {
                if (book instanceof PaperBook) {
                    PaperBook paperBook = (PaperBook) book;
                    paperBook.reduceStock(quantity);
                    paperBook.buy(email, address);
                    return paperBook.getPrice() * quantity;
                } else if (book instanceof EBook) {
                    book.buy(email, address);
                    return book.getPrice();
                } else {
                    throw new UnsupportedOperationException("This book type not for sale.");
                }
            }
        }
        throw new IllegalArgumentException("This book is not found.");
    }
}