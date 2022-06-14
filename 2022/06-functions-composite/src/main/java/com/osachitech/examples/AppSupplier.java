package com.osachitech.examples;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class AppSupplier {

    public static void main(String[] args) {
        Supplier<Person> database = () -> new Person("Otavio");

        Optional<Person> person = Optional.empty();
        Person person1 = person.orElseGet(database);
        System.out.println("The value result is: " + person1);

    }
}
