package com.osachitech.examples.strategy;

import javax.money.MonetaryAmount;

public enum Transports implements Transport {
    BIKE("bike", 1, 0),
    BUS("bus", 1, 0),
    TAXI("bike", 1, 0);

    Transports(String name, int speedFactor, int priceFactor) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Trajectory getPrice(long kilometerDistance) {
        return null;
    }
}
