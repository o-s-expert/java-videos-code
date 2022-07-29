package com.osachitech.examples.cdi.worker;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class TextSupplier implements Supplier<String> {

    @Override
    @Timed
    public String get() {
        try {
            TimeUnit.SECONDS.sleep(2L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Using my text";
    }
}
