package com.osachitech.examples.cdi.music;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Disposes;
import jakarta.enterprise.inject.Produces;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

@ApplicationScoped
class CurrencySupplier {

    private CurrencyUnit currency;

    @PostConstruct
    public void setUp() {
        this.currency = Monetary.getCurrency("EUR");
    }

    @Produces
    CurrencyUnit getCurrency() {
        return currency;
    }

    void close(@Disposes CurrencyUnit currency) {
        System.out.println("We don't need this currency: " + currency);
    }
}
