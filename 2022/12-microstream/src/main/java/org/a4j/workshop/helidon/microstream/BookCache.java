package org.a4j.workshop.helidon.microstream;

import one.microstream.integrations.cdi.types.Store;
import one.microstream.integrations.cdi.types.cache.StorageCache;

import javax.cache.Cache;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Objects;
import java.util.Optional;

@ApplicationScoped
public class BookCache {

    @Inject
    @StorageCache
    private Cache<String, String> cache;

    @Store
    public void add(Book book) {
        Objects.requireNonNull(book, "book is required");
        this.cache.put(book.getId(), book.getAuthor());
    }

    public Optional<String> getAuthor(String id) {
        Objects.requireNonNull(id, "id is required");
        return Optional.ofNullable(this.cache.get(id));
    }

}
