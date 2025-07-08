public class EBook extends Book {
    private String fileType;

    public EBook(String ISBN, String title, String publishYear, double price, String fileType) {
        super(ISBN, title, publishYear, price);
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public void buy(String email, String address) {
        System.out.println("EBook purchased by " + email + ". Download link sent to " + email + ".");
    }

}
