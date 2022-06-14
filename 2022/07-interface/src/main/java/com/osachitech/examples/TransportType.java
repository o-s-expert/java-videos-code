package com.osachitech.examples;

import java.util.function.Supplier;

public enum TransportType {

    CAR("Car"),BOAT("Boat"),PLANE("Plane");

    private final String name;

    TransportType(String name) {
        this.name = name;
    }

    Transport get() {
        return new Transport() {
            @Override
            public String getName() {
                return name;
            }

            @Override
            public void move() {
                System.out.println("moving by " + name);
            }
        };
    }
}
