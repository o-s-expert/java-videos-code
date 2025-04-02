package expert.os.examples;

@MusicInstrument(InstrumentType.KEYBOARD)
public class Piano implements Instrument {

    @Override
    public String play() {
        return "Piano Sound";
    }
}
