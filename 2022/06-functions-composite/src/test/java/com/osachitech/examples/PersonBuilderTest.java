package com.osachitech.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonBuilderTest {

    @Test
    public void shouldCreatePerson() {
        Person person = Person.builder().name("Otavio").occupation("Developer").city("Salvador").build();
        Assertions.assertNotNull(person);
    }

    @Test
    public void shouldReturnErrorWhenParametersIsNull() {
        Assertions.assertThrows(NullPointerException.class, () ->
        Person.builder().name(null)
                );
        Assertions.assertThrows(NullPointerException.class, () ->
                Person.builder().city(null)
        );

        Assertions.assertThrows(NullPointerException.class, () ->
                Person.builder().occupation(null)
        );
    }

    @Test
    public void shouldNotCreateInstanceWhenPersonIsInvalid() {

        Assertions.assertThrows(IllegalStateException.class,  () ->
                Person.builder().city("Salvador").build()
                );

        Assertions.assertThrows(IllegalStateException.class,  () ->
                Person.builder().name("Otavio").build()
        );
    }

}