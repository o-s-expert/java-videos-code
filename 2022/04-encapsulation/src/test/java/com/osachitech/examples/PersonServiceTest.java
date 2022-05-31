package com.osachitech.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class PersonServiceTest {

    private PersonService service;

    @BeforeEach
    public void setUp() {
        this.service = new PersonService();
    }

    @Test
    public void shouldReturnHelder() {
        Optional<Person> helber = service.findByName("Helber");
        Assertions.assertNotNull(helber);
        String name = helber.map(Person::getName)
                .orElse("not know person");
        Assertions.assertEquals("Helber", name);
    }

    @Test
    public void shouldReturnNotHelber() {
        Optional<Person> helder = service.findByName("Helder");
        Person person = helder
                .orElseGet(() -> new PersonBuilder().name("Helder").city("Sao Paulo").build());

        helder.ifPresent(p -> p.getName());
        Assertions.assertNotNull(person.getName());
        Assertions.assertEquals("Helder", person.getName());
    }
}