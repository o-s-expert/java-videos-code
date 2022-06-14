package com.osachitech.examples;

import java.util.function.Predicate;

public class AppPredicate {

    public static void main(String[] args) {
        Person otavio = new Person("Otavio");
        Predicate<Person> question = p -> p.getName().startsWith("O");
        Predicate<Person> size = p -> p.getName().length() > 3;
        Predicate<Person> validName = size.and(question);
        Predicate<Person> notStartWithO = question.negate();
        System.out.println("Is the predicate true: " + validName.test(otavio));

    }
}
