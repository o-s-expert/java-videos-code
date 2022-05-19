package com.osachitech.examples.strategy;

import javax.money.MonetaryAmount;

public interface Transport {

    String getName();

    MonetaryAmount getPrice(long kilometerDistance);


}
