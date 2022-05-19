package com.osachitech.examples.strategy;

import java.util.function.Predicate;

public interface DocumentValidation extends Predicate<String> {

    String getName();
}
