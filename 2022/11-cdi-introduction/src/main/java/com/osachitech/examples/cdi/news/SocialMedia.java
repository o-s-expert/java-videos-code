package com.osachitech.examples.cdi.news;

import jakarta.enterprise.event.Observes;

public class SocialMedia {

    public void receive(@Observes News news) {
        System.out.println("Publishing the news on social media: " + news + " "
                + Thread.currentThread().getName());
    }
}
