package com.osachitech.examples.vo;

import java.util.function.Supplier;

public enum Colors implements Supplier<String> {


    BLUE("#00FFFF"), WHITE("#FFFFFF"),
    BLACK("#000000"), GREEN("#008000");

    private final String value;

    Colors(String value) {
        this.value = value;
    }

    @Override
    public String get() {
        return value;
    }
}
