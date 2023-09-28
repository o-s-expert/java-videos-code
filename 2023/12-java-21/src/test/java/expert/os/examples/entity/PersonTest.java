package expert.os.examples.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void shouldCreatePerson() {
        Person person = Person.builder()
                .id(1L)
                .name("John Doe")
                .email("jonh@test.com").build();

        assertEquals(1L, person.getId());
        person.setId(2L);
        assertEquals(2L, person.getId());
    }
}