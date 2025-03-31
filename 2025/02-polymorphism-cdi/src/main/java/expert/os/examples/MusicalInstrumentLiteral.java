package expert.os.examples;

import jakarta.enterprise.util.AnnotationLiteral;

class MusicalInstrumentLiteral extends AnnotationLiteral<MusicalInstrument> implements MusicalInstrument {

    private final InstrumentType type;

    private MusicalInstrumentLiteral(InstrumentType type) {
        this.type = type;
    }

    @Override
    public InstrumentType value() {
        return type;
    }

    public static MusicalInstrumentLiteral of(InstrumentType type) {
        return new MusicalInstrumentLiteral(type);
    }
}