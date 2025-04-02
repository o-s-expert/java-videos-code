package expert.os.examples;

import jakarta.enterprise.util.AnnotationLiteral;

public class MusicInstrumentLiteral extends AnnotationLiteral<MusicInstrument> implements MusicInstrument {

    private final InstrumentType type;

    private MusicInstrumentLiteral(InstrumentType type) {
        this.type = type;
    }

    @Override
    public InstrumentType value() {
        return type;
    }

    public static MusicInstrumentLiteral of(InstrumentType instrumentType) {
        return new MusicInstrumentLiteral(instrumentType);
    }
}
