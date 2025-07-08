public class PaperBook extends Book{
    private int stock;

    public PaperBook(String ISBN, String title, String publishYear, double price, int stock) {
        super(ISBN, title, publishYear, price);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void reduceStock(int quantity) {
        if (quantity > stock) {
            throw new IllegalArgumentException("Not enough stock available.");
        }
        stock -= quantity;
    }

    @Override
    public void buy(String email, String address) {
        System.out.println("Paper book purchased by " + email + " and will be shipped to " + address);
    }
}
