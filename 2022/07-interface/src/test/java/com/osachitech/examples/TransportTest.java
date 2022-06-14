package com.osachitech.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportTest {

    @Test
    public void shouldCreateTransport() {
        Transport transport = Transport.get(TransportType.BOAT);
        Assertions.assertNotNull(transport);
        Assertions.assertEquals("Boat", transport.getName());
        transport.move();
    }

}