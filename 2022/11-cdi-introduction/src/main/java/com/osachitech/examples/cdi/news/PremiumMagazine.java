package com.osachitech.examples.cdi.news;

import jakarta.enterprise.event.Observes;

public class PremiumMagazine {

    public void receive(@Observes @PremiumCategory News news) {
        System.out.println("Publishing the news on the premium magazine: " + news);
    }
}
