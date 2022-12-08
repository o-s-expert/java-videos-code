package org.a4j.workshop.helidon.microstream;

import java.time.Year;

public class BookBuilder {
    private String isbn;
    private String title;
    private String author;
    private Year release;

    BookBuilder() {
    }

    public BookBuilder isbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public BookBuilder title(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder author(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder release(Year release) {
        this.release = release;
        return this;
    }

    public Book build() {
        return new Book(isbn, title, author, release);
    }
}