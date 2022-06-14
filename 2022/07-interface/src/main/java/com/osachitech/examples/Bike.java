package com.osachitech.examples;

public class Bike implements Transport {

    @Override
    public String getName() {
        return "Bike";
    }

    @Override
    public void move() {
        System.out.println("Ride a bike");
    }
}
