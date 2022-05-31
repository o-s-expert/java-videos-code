package com.osachitech.examples;

import java.util.Objects;
import java.util.Optional;

public class PersonService {

    public Optional<Person> findByName(String name){
        Objects.requireNonNull(name, "name is required");
        if("Helber".equals(name)) {
            return Optional.of(new PersonBuilder()
                    .name("Helber")
                    .city("Porto Alegre")
                            .license(new DriveLicense("123"))
                    .build());
        }
        return Optional.empty();
    }
}
