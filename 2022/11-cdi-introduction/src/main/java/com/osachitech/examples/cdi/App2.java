package com.osachitech.examples.cdi;

import com.osachitech.examples.cdi.music.Music;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import org.javamoney.moneta.Money;

import javax.money.CurrencyUnit;
import javax.money.MonetaryAmount;

public class App2 {

    public static void main(String[] args) {

        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            Music music = container.select(Music.class).get();
            music.play();

            CurrencyUnit currency = container.select(CurrencyUnit.class).get();
            MonetaryAmount money = Money.of(10, currency);

            System.out.println("The money value: " + money);


        }

    }
}
