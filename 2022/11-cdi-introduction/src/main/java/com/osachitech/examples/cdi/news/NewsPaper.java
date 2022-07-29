package com.osachitech.examples.cdi.news;

import jakarta.enterprise.event.Observes;

public class NewsPaper {

    public void receive(@Observes News news) {
        System.out.println("Publishing the newspaper: " + news);
    }
}
