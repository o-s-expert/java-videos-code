package expert.os.examples;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class App {

    public static void main(String[] args) {
        try(SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            Orchestra orchestra = container.select(Orchestra.class).get();

            Instrument piano = orchestra.playInstrument(InstrumentType.KEYBOARD);
            System.out.println("Playing: " + piano.sound());
            Instrument violin = orchestra.playInstrument(InstrumentType.STRING);
            System.out.println("Playing: " + violin.sound());
            Instrument xylophone = orchestra.playInstrument(InstrumentType.PERCUSSION);
            System.out.println("Playing: " + xylophone.sound());

        }
    }
}
