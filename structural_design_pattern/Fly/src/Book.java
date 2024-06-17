package structural_design_pattern.Fly.src;

public class Book {
    private final String title;
    private final String author;
    private String location;

    public Book(String title, String author, String location) {
        this.title = title;
        this.author = author;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Location: " + location);
    }
}

