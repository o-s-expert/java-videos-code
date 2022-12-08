package org.a4j.workshop.helidon.microstream;

import one.microstream.integrations.cdi.types.Storage;
import one.microstream.integrations.cdi.types.Store;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Storage
public class Library {

    private final Set<Book> books;

    public Library() {
        this.books = new HashSet<>();
    }

    public void add(Book book) {
        Objects.requireNonNull(book, "book is required");
        this.books.add(book);
    }

    public List<Book> getBooks() {
        return this.books.stream().collect(Collectors.toUnmodifiableList());
    }
}
