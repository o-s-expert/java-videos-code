package org.a4j.workshop.helidon.microstream;

import one.microstream.integrations.cdi.types.Store;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.Objects;

@ApplicationScoped
public class BookService {

    @Inject
    private Library library;

    @Store
    public void add(Book book) {
        Objects.requireNonNull(book, "book is required");
        this.library.add(book);
    }

    public List<Book> getBooks() {
        return this.library.getBooks();
    }
}
