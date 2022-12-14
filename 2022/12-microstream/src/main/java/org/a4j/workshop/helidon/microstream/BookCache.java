package org.a4j.workshop.helidon.microstream;

import one.microstream.integrations.cdi.types.Store;
import one.microstream.integrations.cdi.types.cache.StorageCache;

import javax.cache.Cache;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Optional;

@ApplicationScoped
public class BookCache {

    @Inject
    @StorageCache
    private Cache<String, Book> cache;

    @Store
    public void add(Book book) {
        this.cache.put(book.getId(), book);
    }

    public Optional<Book> getById(String id) {
        return Optional.ofNullable(this.)
    }

}
