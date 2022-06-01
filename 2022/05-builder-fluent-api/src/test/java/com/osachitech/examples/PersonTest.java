package com.osachitech.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void shouldCreatePersonWithOccupation() {
        String name = "Ada";
        String occupation = "Engineer";
        String city = "London";
        Person person = new Person(name, city, occupation);
        Assertions.assertEquals(name, person.getName());
        Assertions.assertEquals(occupation, person.getOccupation().orElse(""));
        Assertions.assertEquals(city, person.getCity());
    }

    @Test
    public void shouldCreatePersonWithNoOccupation() {
        String name = "Ada";
        String occupation = null;
        String city = "London";
        Person person = new Person(name, city, occupation);
        Assertions.assertEquals(name, person.getName());
        Assertions.assertTrue(person.getOccupation().isEmpty());
        Assertions.assertEquals(city, person.getCity());
    }

}