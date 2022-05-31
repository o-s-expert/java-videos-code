package com.osachitech.examples;

public class PersonBuilder {
    private String name;
    private String city;
    private DriveLicense license;

    PersonBuilder() {
    }

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder city(String city) {
        this.city = city;
        return this;
    }

    public PersonBuilder license(DriveLicense license) {
        this.license = license;
        return this;
    }

    public Person build() {
        return new Person(name, city, license);
    }
}