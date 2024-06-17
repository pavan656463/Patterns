package structural_design_pattern.Fly.src;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    private static final Map<String, Book> bookRegistry = new HashMap<>();

    public static Book getBook(String title, String author, String location) {
        String key = title + "-" + author;
        Book book = bookRegistry.get(key);
        if (book == null) {
            // Create a new book object since it doesn't exist in the registry
            book = new Book(title, author, location); // Pass location to the constructor
            // Store the newly created book in the registry
            bookRegistry.put(key, book);
        }
        return book;
    }



    public static String getLocationForBook(String title, String author) {
        String key = title + "-" + author;
        Book book = bookRegistry.get(key);
        if (book != null) {
            return book.getLocation();
        } else {
            return "Location not found for the book";
        }
    }
}




