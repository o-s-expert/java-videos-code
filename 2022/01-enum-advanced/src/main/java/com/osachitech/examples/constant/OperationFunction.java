package com.osachitech.examples.constant;

import java.util.function.BiFunction;

public enum OperationFunction {

    PLUS ((a,b) -> a + b),
    MINUS ((a,b) -> a - b),
    TIMES ((a,b) -> a * b),
    DIVIDE ((a,b) -> a / b);

    private final BiFunction<Double,Double,Double> operation ;

    OperationFunction(BiFunction<Double,Double,Double> operation) {
        this.operation = operation;
    }

    public Double operate(Double x, Double y) {
        return operation.apply(x,y);
    }
}
