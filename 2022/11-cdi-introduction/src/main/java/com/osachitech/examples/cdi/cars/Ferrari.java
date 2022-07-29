package com.osachitech.examples.cdi.cars;

import jakarta.inject.Named;

@Brand(CarType.SPORT)
public class Ferrari implements Car {
    @Override
    public void move() {
        System.out.println("Moving my ferrari");
    }
}
