package expert.os.examples;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class App {

    public static void main(String[] args) {
        try(SeContainer container = SeContainerInitializer.newInstance().initialize()) {

        }
    }
}
