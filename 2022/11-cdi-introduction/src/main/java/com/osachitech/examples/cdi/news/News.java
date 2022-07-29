package com.osachitech.examples.cdi.news;

import java.util.function.Supplier;

public class News implements Supplier<String> {

    private final String value;

    public News(String value) {
        this.value = value;
    }


    @Override
    public String get() {
        return value;
    }

    @Override
    public String toString() {
        return "News{" +
                "value='" + value + '\'' +
                '}';
    }
}
