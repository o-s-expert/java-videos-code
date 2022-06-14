package com.osachitech.examples;

public interface Transport {

    String getName();

    void move();

    static Transport get(TransportType type) {
        return type.get();
    }
}
