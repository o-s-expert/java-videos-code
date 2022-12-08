package org.a4j.workshop.helidon.microstream;

import java.time.Year;
import java.util.Objects;

public class Book {

    private final String isbn;

    private final  String title;

    private final  String author;

    private final  Year release;

    Book(String isbn, String title, String author, Year release) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.release = release;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Year getRelease() {
        return release;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", release=" + release +
                '}';
    }

    public static BookBuilder builder() {
        return new BookBuilder();
    }
}
