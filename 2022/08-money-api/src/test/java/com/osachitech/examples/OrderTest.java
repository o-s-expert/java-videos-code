package com.osachitech.examples;

import org.javamoney.moneta.Money;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    public void shouldReturnTotal() {
        Order order = new Order();
        CurrencyUnit dollar = Monetary.getCurrency("USD");
        Money money = Money.of(BigDecimal.valueOf(2.8), dollar);
        Money moneyB = Money.of(BigDecimal.valueOf(0.17), dollar);
        order.add(Product.of("Banana", money));
        order.add(Product.of("Pen",  moneyB));
        Optional<MonetaryAmount> total = order.getTotal();
        Money result = Money.of(2.97, dollar);
        Assertions.assertEquals(result, total.get());
    }

}