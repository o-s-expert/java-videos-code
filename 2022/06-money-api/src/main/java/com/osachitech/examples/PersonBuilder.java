package com.osachitech.examples;

import java.util.Objects;

public class PersonBuilder {
    private String name;
    private String city;
    private String occupation;

    PersonBuilder() {
    }

    public PersonBuilder name(String name) {
        this.name = Objects.requireNonNull(name, "name is required");
        return this;
    }

    public PersonBuilder city(String city) {
        this.city = Objects.requireNonNull(city, "city is required");
        return this;
    }

    public PersonBuilder occupation(String occupation) {
        this.occupation = Objects.requireNonNull(occupation, "occupation is required");
        return this;
    }

    public Person build() {
        if(Objects.isNull(name) || Objects.isNull(city)) {
            throw new IllegalStateException("You cannot create a person without name or city");
        }
        return new Person(name, city, occupation);
    }
}