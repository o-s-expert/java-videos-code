package com.osachitech.examples;

import javax.money.MonetaryAmount;

public class PlayerBuilder {
    private String name;
    private String city;
    private MonetaryAmount salary;
    private int score;
    private Position position;

    PlayerBuilder() {
    }

    public PlayerBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PlayerBuilder city(String city) {
        this.city = city;
        return this;
    }

    public PlayerBuilder salary(MonetaryAmount salary) {
        this.salary = salary;
        return this;
    }

    public PlayerBuilder score(int score) {
        this.score = score;
        return this;
    }

    public PlayerBuilder position(Position position) {
        this.position = position;
        return this;
    }

    public Player build() {

        return new Player(name, city, salary, score, position);
    }
}