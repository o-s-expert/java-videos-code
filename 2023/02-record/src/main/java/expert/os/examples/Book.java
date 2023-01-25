package expert.os.examples;

import java.time.Year;
import java.util.Objects;

public record Book(String id, String title, Year release, int edition) {


    public Book {
        Objects.requireNonNull(id, "id is required");
        Objects.requireNonNull(title, "title is required");
        Objects.requireNonNull(release, "release is required");
        if (edition < 1) {
            throw new IllegalArgumentException("Edition cannot be negative");
        }
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

    public static BookBuilder builder() {
        return new BookBuilder();
    }

}
