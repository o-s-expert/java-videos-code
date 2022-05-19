package com.osachitech.examples.strategy;

public interface Transport {

    String getName();

    Trajectory getPrice(long kilometerDistance);
}
