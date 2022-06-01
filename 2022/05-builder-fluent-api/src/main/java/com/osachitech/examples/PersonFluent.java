package com.osachitech.examples;

public interface PersonFluent {

    PersonCity name(String name);

    interface PersonCity {
        PersonBuild city(String city);
    }

    interface PersonBuild {

        Person build();

        Person occupation(String occupation);
    }
}
