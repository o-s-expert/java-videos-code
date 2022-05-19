package com.osachitech.examples.strategy;

public enum GroundTransports implements Transport {

    BIKE("Bike", 1, 0),
    BUS("Bus", 1, 0.5),
    TAXI("Taxi", 1, 2);

    private final String name;
    private final int speedFactor;
    private final double priceFactor;

    GroundTransports(String name, int speedFactor, double priceFactor) {
        this.name = name;
        this.speedFactor = speedFactor;
        this.priceFactor = priceFactor;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Trajectory move(long kilometerDistance) {
        if(kilometerDistance < 0) {
            throw new IllegalArgumentException("the kilometer distance cannot be negative");
        }

        return null;
    }
}
