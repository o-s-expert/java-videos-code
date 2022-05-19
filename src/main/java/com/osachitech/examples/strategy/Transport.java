package com.osachitech.examples.strategy;

import javax.money.MonetaryAmount;

public interface Transport {

    String getName();

    Trajectory getPrice(long kilometerDistance);
}
