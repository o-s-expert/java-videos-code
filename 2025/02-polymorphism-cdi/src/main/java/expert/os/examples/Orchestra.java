package expert.os.examples;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Any;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

import java.util.logging.Logger;

@ApplicationScoped
public class Orchestra {

    private static final Logger LOGGER = Logger.getLogger(Orchestra.class.getName());

    @Inject
    @Any
    private Instance<Instrument> instruments;

    public Instrument playInstrument(InstrumentType type) {
        LOGGER.fine("Playing instrument: " + type);
        return instruments.select(MusicalInstrumentLiteral.of(type))
                .get();
    }

}
