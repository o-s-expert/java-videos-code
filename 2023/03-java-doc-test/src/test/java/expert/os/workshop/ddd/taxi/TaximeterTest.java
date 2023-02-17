package expert.os.workshop.ddd.taxi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.money.MonetaryAmount;
import java.time.LocalTime;

import static expert.os.workshop.ddd.taxi.Taximeter.ECONOMIC;
import static expert.os.workshop.ddd.taxi.Taximeter.EXPENSIVE;
import static org.junit.jupiter.api.Assertions.*;

class TaximeterTest {

    private Taximeter taximeter;


    @BeforeEach
    public void setUp() {
        this.taximeter = new Taximeter();
    }

    @Test
    public void shouldUseEconomicFlag() {
        LocalTime time = LocalTime.of(9, 0);
        Ride economic = new Ride("Aiport", "house", 1, time);
        MonetaryAmount amount = taximeter.fare(economic);
        Assertions.assertThat(amount).isNotNull().isEqualTo(ECONOMIC);
    }

    @Test
    public void shouldUseExpensiveFlag() {
        LocalTime time = LocalTime.of(21, 0);
        Ride expensive = new Ride("Aiport", "house", 1, time);
        MonetaryAmount amount = taximeter.fare(expensive);
        Assertions.assertThat(amount).isNotNull().isEqualTo(EXPENSIVE);
    }

}