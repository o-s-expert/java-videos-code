package expert.os.examples;


@MusicInstrument(InstrumentType.PERCURSSION)
public class Xylophone implements Instrument {
    @Override
    public String play() {
        return "Xylophone Sound";
    }
}
