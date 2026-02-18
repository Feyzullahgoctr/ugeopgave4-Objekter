import java.util.ArrayList;

public class Library {

    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
            System.out.println(book.getTitle() + " has been added to the library.");
        }
    }


    public ArrayList<Book> findAvailableBooks(){
        ArrayList<Book> availableBook = new ArrayList<>();
        for (Book b : books) {
            if (b.isAvailable()) {
                availableBook.add(b);
            }
        }
        return availableBook;
    }

    public Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public void printAllBooks(){
        for (Book b : books) {
            System.out.println(b);
        }
    }

}
