package com.osachitech.examples.cdi.music;

import jakarta.inject.Inject;

import java.util.logging.Logger;

public class MusicService {

    @Inject
    private Music music;

    @Inject
    private Logger logger;


    public void sing() {
        logger.info("Start to singing this music here: " + music);
    }
}
