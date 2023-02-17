package expert.os.workshop.ddd.taxi;

import org.javamoney.moneta.Money;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Objects;

public class Taximeter {

    private static final LocalTime START_ECONOMIC = LocalTime.of(8, 0, 0);
    private static final LocalTime END_ECONOMIC = LocalTime.of(8, 0, 0);

    private static final CurrencyUnit USD = Monetary.getCurrency(Locale.US);
    private static final MonetaryAmount ECONOMIC = Money.of(1, USD);
    private static final MonetaryAmount EXPENSIVE = Money.of(2, USD);

    public MonetaryAmount fare(Ride ride) {
        Objects.requireNonNull(ride, "ride is required");
        MonetaryAmount flag = flag(ride.time());
        return flag.multiply(ride.distance());
    }


    private MonetaryAmount flag(LocalTime time) {
        if (START_ECONOMIC.isAfter(time) && END_ECONOMIC.isBefore(END_ECONOMIC)) {
            return ECONOMIC;
        }
        return EXPENSIVE;
    }

}
