package com.osachitech.examples.cdi.music;

import jakarta.enterprise.inject.Produces;
import jakarta.enterprise.inject.spi.InjectionPoint;

import java.util.logging.Logger;

class LoggerProducer {

    private static final Logger LOGGER = Logger.getLogger(LoggerProducer.class.getName());

    @Produces
    public Logger getLog(InjectionPoint ip) {
        String declaringClass = ip.getMember().getDeclaringClass().getName();
        LOGGER.info("creating the log for "+ declaringClass);
        return Logger.getLogger(declaringClass);

    }
}
