package com.osachitech.examples;

import javax.money.MonetaryAmount;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Objects;

public class Product {

    private final String name;

    private final MonetaryAmount price;


    private Product(String name, MonetaryAmount price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public MonetaryAmount getPrice() {
        return price;
    }


    public static Product of(String name, MonetaryAmount price) {
        Objects.requireNonNull(name, "name is required");
        Objects.requireNonNull(price, "price is required");
        if(price.isNegative()) {
            throw new IllegalArgumentException("we not work with negative price");
        }
        return new Product(name, price);
    }
}
