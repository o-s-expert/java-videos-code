package org.a4j.workshop.helidon.microstream;

import java.time.Year;
import java.util.Objects;

public class Book {

    private final String id;

    private final String title;

    private final String author;

    private final Year release;

    Book(String id, String title, String author, Year release) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.release = release;
    }

    public String getId() {
        return id;
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
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", release=" + release +
                '}';
    }

    public static BookBuilder builder() {
        return new BookBuilder();
    }
}
