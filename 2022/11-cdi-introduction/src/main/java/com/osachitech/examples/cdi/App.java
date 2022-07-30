package com.osachitech.examples.cdi;

import com.osachitech.examples.cdi.cars.Garage;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class App {
    public static void main(String[] args) {

        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            Garage garage = container.select(Garage.class).get();
            garage.moves();
        }

    }
}
