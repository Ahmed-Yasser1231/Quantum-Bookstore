public class DemoBook extends Book {
        public DemoBook(String ISBN, String title, String publishYear, double price) {
            super(ISBN, title, publishYear, price);
        }

    @Override
    public void buy(String email, String address) {
        throw new UnsupportedOperationException("Demo books are not for sale.");
    }
}

