package com.osachitech.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonDSLTest {

    @Test
    public void shouldCreateInstance() {
        Person edson = Person.name("Yanaga").city("Salvador").occupation("DevRel");
        Assertions.assertNotNull(edson);
    }
}