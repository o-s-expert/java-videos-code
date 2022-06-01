package com.osachitech.examples;

import java.util.Objects;

public interface PersonFluent {

    static PersonCity name(String name) {
        Objects.requireNonNull(name, "name is required");
        return new PersonDSL(name);
    }

    interface PersonCity {
        PersonBuild city(String city);
    }

    interface PersonBuild {

        Person build();

        Person occupation(String occupation);
    }
}
