package com.osachitech.examples.strategy;

public enum GroundTransports implements Transport {

    BIKE("Bike", 20, 0),
    BUS("Bus", 1, 0.5),
    TAXI("Taxi", 1, 2);

    private final String name;
    private final int speedKilometerHours;
    private final double priceFactor;

    GroundTransports(String name, int speedKilometerHours, double priceFactor) {
        this.name = name;
        this.speedKilometerHours = speedKilometerHours;
        this.priceFactor = priceFactor;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Trajectory move(long kilometerDistance) {
        if(kilometerDistance <= 0) {
            throw new IllegalArgumentException("the kilometer distance cannot be negative or zero");
        }

        return null;
    }
}
