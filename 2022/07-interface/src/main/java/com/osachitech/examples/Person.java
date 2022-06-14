package com.osachitech.examples;

import java.util.Optional;

public class Person {

    private String name;

    private String city;

    private String occupation;



    @Deprecated
    Person() {
    }

    Person(String name, String city, String occupation) {
        this.name = name;
        this.city = city;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Optional<String> getOccupation() {
        return Optional.ofNullable(occupation);
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static PersonFluent.PersonCity name(String name) {
        return PersonFluent.name(name);
    }
}
