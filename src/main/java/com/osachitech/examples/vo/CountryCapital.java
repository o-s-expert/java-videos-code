package com.osachitech.examples.vo;

public enum CountryCapital {

    BRAZIL("Brazil", "Brasilia"), ENGLAND("England", "London"),
    ITALY("Italy", "Rome"),
    GREEK("Greek", "Athens");

    private final String country;
    private final String capital;

    CountryCapital(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }

    public String getCapital() {
        return capital;
    }
}
