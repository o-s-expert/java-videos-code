package com.osachitech.examples;

import javax.money.MonetaryAmount;

public class Player {

    private String name;

    private String city;

    private MonetaryAmount salary;

    private int score;

    private Position position;

    Player(String name, String city,
                  MonetaryAmount salary, int score,
                  Position position) {
        this.name = name;
        this.city = city;
        this.salary = salary;
        this.score = score;
        this.position = position;
    }

    /**
     * Please use the builder method instead, it is to framework only.
     * {@link Player#builder()}
     */
    @Deprecated
    Player() {
    }

    public static PlayerBuilder builder() {
        return new PlayerBuilder();
    }
}
