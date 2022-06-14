package com.osachitech.examples;

import javax.money.MonetaryAmount;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Order {

    private final List<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public void add(Product product) {
        Objects.requireNonNull(product, "product is required");
        this.products.add(product);
    }

    public Optional<MonetaryAmount> getTotal() {
        return this.products
                .stream()
                .map(Product::getPrice)
                .reduce(MonetaryAmount::add);
    }
}
