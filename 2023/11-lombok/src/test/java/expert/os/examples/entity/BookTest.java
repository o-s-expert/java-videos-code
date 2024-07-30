package expert.os.examples.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {


    @Test
    public void shouldCreateBook() {
        Book book = new Book("1", "The Lord of the Rings", "J. R. R. Tolkien");

        assertEquals("1", book.id());
        assertEquals("The Lord of the Rings", book.title());
        assertEquals("J. R. R. Tolkien", book.author());

    }

}