package com.osachitech.examples;

import java.util.function.Consumer;

public class AppConsumer {
    public static void main(String[] args) {
        Person bruno = new Person("Bruno");
        Consumer<Person> log = p -> System.out.println("Log 1" + p);
        Consumer<Person> log2 = p -> System.out.println("Log 2" + p);
        Consumer<Person> consumer = log.andThen(log2);
        consumer.accept(bruno);
    }
}
