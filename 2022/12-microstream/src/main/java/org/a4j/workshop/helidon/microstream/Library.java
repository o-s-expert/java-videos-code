package org.a4j.workshop.helidon.microstream;

import one.microstream.integrations.cdi.types.Storage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Storage
public class Library {

    private final Set<Book> books;

    public Library() {
        books = new HashSet<>();
    }

    public void add(Book book){
        this.books.add(book);
    }

    public List<Book> getBooks() {
        return this.books.stream().collect(Collectors.toUnmodifiableList());
    }
}
