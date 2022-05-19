package com.osachitech.examples.strategy;

import com.osachitech.examples.vo.Currencies;
import org.javamoney.moneta.Money;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.money.Monetary;
import javax.money.MonetaryAmount;
import java.time.Duration;

import static com.osachitech.examples.strategy.GroundTransports.BIKE;
import static com.osachitech.examples.strategy.GroundTransports.BUS;
import static com.osachitech.examples.strategy.GroundTransports.TAXI;
import static org.junit.jupiter.api.Assertions.*;

class GroundTransportsTest {

    @Test
    public void shouldReturnErrorWhenIsNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> BIKE.move(-1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> TAXI.move(-1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> BUS.move(-1));
    }

    @Test
    public void shouldReturnErrorWhenIsZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> BIKE.move(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> TAXI.move(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> BUS.move(0));
    }

    @Test
    public void shouldMoveOneHundredKM() {
        MonetaryAmount free = Money.of(0, Currencies.EURO.get());

        Trajectory move = BIKE.move(100);
        Assertions.assertEquals(Duration.ofHours(5L), move.getDuration());
        Assertions.assertEquals(free, move.getDuration());
    }

}