package expert.os.examples;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Objects;

public record Money(Currency currency, BigDecimal value) {

    Money add(Money money) {
        Objects.requireNonNull(money, "Money is required");
        if (currency.equals(money.currency)) {
            BigDecimal result = this.value.add(money.value);
            return new Money(currency, result);
        }
        throw new IllegalStateException("You cannot sum money with different currencies");
    }
}
