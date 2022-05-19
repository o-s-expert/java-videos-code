package com.osachitech.examples.vo;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import java.util.function.Supplier;

public enum Currencies implements Supplier<CurrencyUnit> {

    EURO("EUR"),DOLLAR("USD");

    private CurrencyUnit currency;
    Currencies(String currencyCode) {
        this.currency = Monetary.getCurrency(currencyCode);
    }

    @Override
    public CurrencyUnit get() {
        return currency;
    }
}
