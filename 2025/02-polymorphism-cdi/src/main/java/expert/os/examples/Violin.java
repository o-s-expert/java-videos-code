package expert.os.examples;

@MusicalInstrument(InstrumentType.STRING)
class Violin implements Instrument {
    @Override
    public String sound() {
        return "violin";
    }
}