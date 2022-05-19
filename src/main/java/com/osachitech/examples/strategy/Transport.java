package com.osachitech.examples.strategy;

public interface Transport {

    String getName();

    Trajectory move(long kilometerDistance);
}
