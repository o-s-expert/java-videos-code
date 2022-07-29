package com.osachitech.examples.cdi.music;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Disposes;
import jakarta.enterprise.inject.Produces;

import java.util.function.Supplier;

class MusicSupplier implements Supplier<Music> {

    @Override
    @Produces
    @ApplicationScoped
    public Music get() {
        return new Music("Don't stop me now");
    }

    public void stopSinning(@Disposes Music music) {
        music.stop();
    }

}
