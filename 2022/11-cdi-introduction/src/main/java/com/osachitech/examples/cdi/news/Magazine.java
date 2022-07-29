package com.osachitech.examples.cdi.news;

import jakarta.enterprise.event.Observes;

public class Magazine {

    public void receive(@Observes News news) {
        System.out.println("Publishing the news on magazine: " + news);
    }
}
