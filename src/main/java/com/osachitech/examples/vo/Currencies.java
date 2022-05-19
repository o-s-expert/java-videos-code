package com.osachitech.examples.vo;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import java.util.function.Supplier;

public enum Monetaries implements Supplier<CurrencyUnit> {

    EURO("EUR"),DOLLAR("USD");

    private CurrencyUnit currency;
    Monetaries(String currencyCode) {
        this.currency = Monetary.getCurrency(currencyCode);
    }

    @Override
    public CurrencyUnit get() {
        return currency;
    }
}
