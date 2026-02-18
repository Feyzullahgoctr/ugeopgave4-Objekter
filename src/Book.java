public class Book {

    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        if (title == null || title.isEmpty()) {
            this.title = "Unknown";
        } else {
            this.title = title;
        }

        if (author == null || author.isEmpty()) {
            this.author = "Unknown";
        } else {
            this.author = author;
        }

        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrow() {
        if (available) {
            available = false;
            System.out.println( title +  " was borrowed.");
        } else {
            System.out.println( title +  " It is not currently in the library.");
        }
    }

    public void returnBook() {

        if (available) {
            System.out.println(title + " is already available in the library.");
        } else {
            available = true;
            System.out.println(title + " was returned.");
        }


    }

    public String toString() {
        return "Title : " + title +
                ", Author : " + author +
                ", Available : " + (available ? "Tilgængelig" : "Udlånt");
    }

}
