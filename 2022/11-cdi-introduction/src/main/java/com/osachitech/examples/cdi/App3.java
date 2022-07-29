package com.osachitech.examples.cdi;

import com.osachitech.examples.cdi.news.Journalist;
import com.osachitech.examples.cdi.news.News;
import com.osachitech.examples.cdi.news.SocialMedia;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class App3 {

    public static void main(String[] args) {

        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {

            Journalist journalist = container.select(Journalist.class).get();
            journalist.publish(new News("Java version has arrived"));
            System.out.println("The premium news");
            journalist.premiumNews(new News("Jakarta EE has arrived"));
        }

    }
}
