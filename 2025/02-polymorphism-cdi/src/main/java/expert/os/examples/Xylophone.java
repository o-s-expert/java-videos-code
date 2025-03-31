package expert.os.examples;


@MusicalInstrument(InstrumentType.PERCUSSION)
class Xylophone implements Instrument {
    @Override
    public String sound() {
        return "xylophone";
    }
}