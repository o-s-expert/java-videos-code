package com.osachitech.examples.cdi.news;

import jakarta.enterprise.event.Observes;
import jakarta.enterprise.event.ObservesAsync;

public class Twitter {

    public void receive(@ObservesAsync News news) {
        System.out.println("Publishing the news on twitter: " + news + " "
        + Thread.currentThread().getName());
    }
}
