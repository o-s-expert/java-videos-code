package expert.os.workshop.ddd.taxi;

import java.math.BigDecimal;
import java.util.Currency;

public record Money (Currency currency, BigDecimal value){
}
