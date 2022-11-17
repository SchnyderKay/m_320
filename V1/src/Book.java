public class Book extends Medien{
    private int ISBN_Number;

    public Book(String title, int year, double price, int ISBN_Number) {
        super(title, year, price);
        this.ISBN_Number = ISBN_Number;
    }


    public int getISBN_Number() {
        return ISBN_Number;
    }

    public void setISBN_Number(int ISBN_Number) {
        this.ISBN_Number = ISBN_Number;
    }
}
