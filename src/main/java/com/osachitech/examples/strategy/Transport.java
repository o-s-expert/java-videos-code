package com.osachitech.examples.strategy;

import javax.money.MonetaryAmount;
import java.time.Duration;

public interface Transport {

    String getName();

    MonetaryAmount getPrice(long kilometerDistance);


}
