package expert.os.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Year;

class BookTest {


    @Test
    public void shouldReturnInvalid() {
        Assertions.assertThrows(NullPointerException.class, () ->
                new Book(null, null, null, -1));
    }

    @Test
    public void shouldReturnError() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Book("id", "Effective Java",
                Year.of(2001), 0));

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Book("id", "Effective Java",
                Year.of(2001), -1));
    }

    @Test
    public void shouldTitle() {
        Book book = new Book("id", "Effective Java", Year.of(2001), 1);
        System.out.println(book.title());
    }

    @Test
    public void shouldCreateFromBuilder() {
        Book book = Book.builder().id("id").title("Effective Java").release(Year.of(2001)).builder();
    }

    @Test
    public void shouldCreateNewEdition() {
        Book first = Book.builder().id("id").title("Effective Java").release(Year.of(2001)).builder();
        Book second = first.newEdition("id-2", Year.of(2009));
        Assertions.assertNotNull(second);
        Assertions.assertEquals(first.title(), second.title());
        Assertions.assertNotEquals(first.id(), second.id());
        Assertions.assertNotEquals(first.release(), second.release());
        Assertions.assertEquals(2, second.edition());
    }

}