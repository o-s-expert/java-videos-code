package expert.os.examples;

@MusicInstrument(InstrumentType.STRING)
public class Violin implements Instrument {
    @Override
    public String sound() {
        return "Violin Sound";
    }
}
