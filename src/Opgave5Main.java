import java.util.ArrayList;

public class Opgave5Main {

    void main() {

        Library library = new Library("Gladsaxe Bibliotek");

        Book book1 = new Book("Pride and Prejudice","Jane Austen");
        Book book2 = new Book("The Great Gatsby","F. Scott Fitzgerald");
        Book book3 = new Book("To Kill a Mockingbird","Harper Lee");
        Book book4 = new Book("1984","George Orwell");
        Book book5 = new Book("Alice’s Adventures in Wonderland", "Lewis Carroll");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        System.out.println("\n=== Books are being processed ===");
        book1.borrow();
        book5.borrow();

        ArrayList<Book> availableBook = library.findAvailableBooks();
        System.out.println("\n=== Available Book ===");
        for (Book b : availableBook) {
            System.out.println(b.getTitle() + " " + b.getAuthor());
        }

        System.out.println("\n=== Books are being processed ===");
        book3.returnBook();
        book1.returnBook();
        book2.returnBook();

        System.out.println("\n=== Alle Books ===");
        library.printAllBooks();

        System.out.println("\n=== Find Book ===");
        Book find1 = library.findBookByTitle("1984");
        Book find2 = library.findBookByTitle("1985");

        System.out.println(find1);
        System.out.println(find2);

    }

}
