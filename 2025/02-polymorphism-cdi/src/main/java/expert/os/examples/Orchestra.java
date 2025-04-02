package expert.os.examples;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Any;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class Orchestra {

    @Inject
    @Any
    private Instance<Instrument> instruments;

    public Instrument select(InstrumentType type) {
        return instruments.select(MusicInstrumentLiteral.of(type)).get();
    }
}
