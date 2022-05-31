package com.osachitech.examples;

import java.time.Duration;

public enum DocumentType {
    PERSON {
        @Override
        Duration getDays() {
            return Duration.ofDays(10);
        }
    }, COMPANY {
        @Override
        Duration getDays() {
            return Duration.ofDays(20);
        }
    }, UNPROCESSED {
        @Override
        Duration getDays() {
            throw new IllegalStateException("");
        }
    };

    abstract Duration getDays();

    public boolean isUnprocessed() {
        return this == UNPROCESSED;
    }
}
