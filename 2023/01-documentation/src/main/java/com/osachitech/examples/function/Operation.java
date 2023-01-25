package com.osachitech.examples.function;

public enum Operation {

    PLUS{
        @Override
        public double operate(double valueA, double valueB) {
            return valueA + valueB;
        }
    }, MINUS{
        @Override
        public double operate(double valueA, double valueB) {
            return valueA - valueB;
        }
    }, TIMES{
        @Override
        public double operate(double valueA, double valueB) {
            return valueA * valueB;
        }
    };

    public abstract double operate(double valueA, double valueB);
}
