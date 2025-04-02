package expert.os.examples;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class App {

    public static void main(String[] args) {
        try(SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            Orchestra orchestra = container.select(Orchestra.class).get();
            Instrument keyboard = orchestra.select(InstrumentType.KEYBOARD);
            Instrument string = orchestra.select(InstrumentType.STRING);
            Instrument percurssion = orchestra.select(InstrumentType.PERCURSSION);

            System.out.println("Playing the orchestra");
            System.out.println("Keyboard: " + keyboard.play());
            System.out.println("string: " + string.play());
            System.out.println("percurssion: " + percurssion.play());

        }
    }
}
