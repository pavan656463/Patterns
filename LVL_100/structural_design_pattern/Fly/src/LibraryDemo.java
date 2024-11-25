package structural_design_pattern.Fly.src;

public class LibraryDemo {
    public static void main(String[] args) {
        // Place all books on shelves and create flyweight objects
        placeBooksOnShelves();

        // Simulate User 1 requesting the location of a book by author
        String authorName = "Author M";
        Book bookByAuthor = getBookByAuthor(authorName);
        System.out.print("Location of a book by " + authorName + ": ");
        bookByAuthor.display();

        // Simulate User 2 requesting the location of a book by title
        String bookTitle = "Book M";
        Book bookByTitle = getBookByTitle(bookTitle);
        System.out.print("Location of " + bookTitle + ": ");
        bookByTitle.display();
    }

    private static void placeBooksOnShelves() {
        String[] titles = {
            "Book A", "Book B", "Book C", "Book D", "Book E",
            "Book F", "Book G", "Book H", "Book I", "Book J",
            "Book K", "Book L", "Book M", "Book N", "Book O",
            "Book P", "Book Q", "Book R", "Book S", "Book T",
            "Book U", "Book V", "Book W", "Book X", "Book Y",
            "Book Z", "Book AA", "Book BB", "Book CC", "Book DD"
        };
        String[] authors = {
            "Author A", "Author B", "Author C", "Author D", "Author E",
            "Author F", "Author G", "Author H", "Author I", "Author J",
            "Author K", "Author L", "Author M", "Author N", "Author O",
            "Author P", "Author Q", "Author R", "Author S", "Author T",
            "Author U", "Author V", "Author W", "Author X", "Author Y",
            "Author Z", "Author AA", "Author BB", "Author CC", "Author DD"
        };

        for (int i = 0; i < titles.length; i++) {
            // Generate random shelf and position
            int shelf = (int) (Math.random() * 5) + 1;
            int position = (int) (Math.random() * 20) + 1;
            String location = "Shelf " + shelf + ", Position " + position;
            BookFactory.getBook(titles[i], authors[i], location);
        }
    }

    private static Book getBookByAuthor(String authorName) {
        // Simulate retrieving a book by author (not implemented)
        // Here we return a static book for demonstration
        return BookFactory.getBook("Book C", authorName, "");
    }

    private static Book getBookByTitle(String bookTitle) {
        // Simulate retrieving a book by title (not implemented)
        // Here we return a static book for demonstration
        return BookFactory.getBook(bookTitle, "Author M", "");
    }
}
    
