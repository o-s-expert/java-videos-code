package com.osachitech.examples.cdi.cars;

import jakarta.inject.Named;

@Brand(CarType.REGULAR)
public class Fiat implements Car{
    @Override
    public void move() {
        System.out.println("Moving my fiat 500");
    }
}
