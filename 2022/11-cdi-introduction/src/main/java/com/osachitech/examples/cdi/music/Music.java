package com.osachitech.examples.cdi.music;

import jakarta.enterprise.inject.Vetoed;

@Vetoed
public class Music {

    private String sing;

    Music() {
    }

    public Music(String sing) {
        this.sing = sing;
    }

    public void play() {
        System.out.println("Playing the music: " + sing);
    }

    public void stop() {
        System.out.println("Stop sinning the music: " + sing);
    }
}
