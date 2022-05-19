package com.osachitech.examples.strategy;

import com.osachitech.examples.vo.Currencies;
import org.javamoney.moneta.Money;

import javax.money.MonetaryAmount;
import java.math.BigDecimal;
import java.time.Duration;

import static com.osachitech.examples.vo.Currencies.EURO;

public enum GroundTransports implements Transport {

    BIKE("Bike", 20, 0),
    BUS("Bus", 50, 0.1),
    TAXI("Taxi", 100, 0.5);

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
        if (kilometerDistance <= 0) {
            throw new IllegalArgumentException("the kilometer distance cannot be negative or zero");
        }
        Duration duration = Duration.ofHours(kilometerDistance / this.speedKilometerHours);
        MonetaryAmount cost = Money.of(kilometerDistance * this.priceFactor, EURO.get());
        return Trajectory.of(cost, duration);
    }
}
