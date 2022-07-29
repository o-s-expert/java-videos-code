package com.osachitech.examples.cdi.news;

import jakarta.enterprise.event.Observes;

public class Press {

    public void receive(@Observes News news) {
        System.out.println("Publishing the news on the TV: " + news);
    }
}
