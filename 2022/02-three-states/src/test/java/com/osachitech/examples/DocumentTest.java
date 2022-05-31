package com.osachitech.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class DocumentTest {

    @Test
    public void shouldCreateDocument() {
        Document document = new Document("Otavio", "Description");
        Duration days = document.getDays();
        Assertions.assertEquals(Duration.ofDays(10), days);
    }
}