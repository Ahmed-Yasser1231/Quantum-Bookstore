public abstract class Book {
    private String ISBN;
    private String title;
    private String PublishYear;
    private double price;

    public Book(String ISBN, String title, String PublishYear, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.PublishYear = PublishYear;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishYear() {
        return PublishYear;
    }

    public void setPublishYear(String publishYear) {
        PublishYear = publishYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void buy(String email, String address);
}
