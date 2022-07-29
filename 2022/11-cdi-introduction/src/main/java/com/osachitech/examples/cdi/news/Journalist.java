package com.osachitech.examples.cdi.news;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;

@ApplicationScoped
public class Journalist {

    @Inject
    private Event<News> event;

    @Inject
    @PremiumCategory
    private Event<News> eventQualifier;
    public void publish(News news) {
        this.event.fire(news);
        this.event.fireAsync(news);
    }

    public void premiumNews(News news) {
        this.eventQualifier.fire(news);
    }
}
