package com.osachitech.examples;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class App {

    public static void main(String[] args) {

        String text = " 10 ";
        Function<String, Integer> convertString =Integer::valueOf;
        UnaryOperator<String> trim = String::trim;
        Function<String, Integer> smartConverter = trim.andThen(convertString);
        Integer value = smartConverter.apply(text);

        System.out.println("the integer value is: " + value);

    }
}
