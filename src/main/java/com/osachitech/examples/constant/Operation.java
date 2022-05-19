package com.osachitech.examples.constant;

public enum Operation {

    PLUS {
        @Override
        public double operate(double a, double b) {
            return a + b;
        }
    },

    MINUS {
        @Override
        public double operate(double a, double b) {
            return a - b;
        }
    },
    TIMES {
        @Override
        public double operate(double a, double b) {
            return a * b;
        }
    },

    DIVIDE {
        @Override
        public double operate(double a, double b) {
            return a / b;
        }
    };


    public abstract double operate(double a, double b);
}
