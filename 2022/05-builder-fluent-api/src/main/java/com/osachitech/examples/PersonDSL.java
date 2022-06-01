package com.osachitech.examples;

import java.util.Objects;

public class PersonDSL implements PersonFluent, PersonFluent.PersonCity, PersonFluent.PersonBuild {

    private final String name;

    private String city;

    private String occupation;

    public PersonDSL(String name) {
        this.name = name;
    }


    @Override
    public PersonBuild city(String city) {
        this.city = Objects.requireNonNull(city, "city is required");
        return this;
    }

    @Override
    public Person build() {
        return new Person(name, city, occupation);
    }

    @Override
    public Person occupation(String occupation) {
        this.occupation = Objects.requireNonNull(city, "occupation is required");
        return build();
    }
}
