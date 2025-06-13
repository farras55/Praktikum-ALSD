package Praktikum14;

public class Book {
    public String isbn, title;

    public Book() {
        
    }

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String toString() {
        return "ISBN: " + this.isbn + ", Judul: " + this.title;
    }
}
