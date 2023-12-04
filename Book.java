import java.util.ArrayList;


public class Book {
   private String title;
  private String author;
    ArrayList<Rental> rentals;
    final private String Isbn;

    public Book(String title, String author,String Isbn) {
        this.title =title.toUpperCase();
        this.author = author.toUpperCase();
        rentals = new ArrayList<>();
        this.Isbn=Isbn;

    }



    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

//    public void addRental(Rental rental) {
//        rentals.add(rental);
//        rental.setBook(this);
//    }

    public String getIsbn() {
        return Isbn;
    }
}
