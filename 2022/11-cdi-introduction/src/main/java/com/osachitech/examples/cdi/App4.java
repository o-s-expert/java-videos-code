package com.osachitech.examples.cdi;

import com.osachitech.examples.cdi.worker.TextSupplier;
import com.osachitech.examples.cdi.worker.Worker;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class App4 {

    public static void main(String[] args) {

        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            Worker worker = container.select(Worker.class).get();
            String result = worker.work("A single button.");
            System.out.println("The result job is: " + result);
            TextSupplier supplier = container.select(TextSupplier.class).get();
            String value = supplier.get();
            System.out.println("the value is " + value);
        }

    }
}
