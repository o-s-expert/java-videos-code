package expert.os.examples.entity;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    public void shouldCreatePerson() {
        Person person = Person.builder()
                .id(1L)
                .name("John Doe")
                .email("jonh@test.com").build();

        assertEquals(1L, person.getId());
    }
}