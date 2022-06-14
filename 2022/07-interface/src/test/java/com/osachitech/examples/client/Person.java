package com.osachitech.examples.client;

import com.osachitech.examples.Transport;
import com.osachitech.examples.TransportType;

public class Person {

    public void bla() {
        Transport transport = Transport.get(TransportType.BOAT);
    }
}
