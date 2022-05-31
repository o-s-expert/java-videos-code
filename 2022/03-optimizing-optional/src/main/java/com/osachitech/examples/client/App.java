package com.osachitech.examples.client;

import com.osachitech.examples.Person;
import com.osachitech.examples.PersonBuilder;
import com.osachitech.examples.PersonService;

import java.util.Optional;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        PersonService service = new PersonService();
        PersonBuilder builder = Person.builder();
        System.out.println("Hello World!");
    }
}
