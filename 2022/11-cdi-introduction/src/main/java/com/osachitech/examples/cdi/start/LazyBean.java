package com.osachitech.examples.cdi.start;


import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LazyBean {
    @PostConstruct
    public void setUp() {
        System.out.println("Application starting up on the lazy way");
    }
    public void action() {
        System.out.println("Let me do something");
    }
}
