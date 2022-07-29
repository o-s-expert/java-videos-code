package com.osachitech.examples.cdi.cars;

import jakarta.enterprise.inject.Any;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

public class Garage {

    @Inject
    @Brand(CarType.SPORT)
    private Car sport;

    @Inject
    @Brand(CarType.REGULAR)
    private Car regular;

    @Inject
    @Any
    private Instance<Car> cars;

    public void moveSport() {
        this.sport.move();
    }

    public void moveRegular() {
        this.regular.move();
    }

    public void moves() {
        this.cars.forEach(c -> c.move());
    }
}
