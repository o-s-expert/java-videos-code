package com.osachitech.examples;

import java.util.Objects;
import java.util.Optional;

public class Person {

    private String name;

    private String city;

    private DriveLicense license;

    public Person(String name, String city, DriveLicense license) {
        this.name = Objects.requireNonNull(name, "name is required");
        this.city = Objects.requireNonNull(city, "city is required");
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Optional<DriveLicense> getDriveLicense() {
        return Optional.ofNullable(this.license);
    }
    public static PersonBuilder builder() {
        return new PersonBuilder();
    }
}
