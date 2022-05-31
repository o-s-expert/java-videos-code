package com.osachitech.examples;

import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;

public class Document {

    private String name;

    private String description;

    private DocumentType type = DocumentType.UNPROCESSED;

    public Document(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Duration getDays() {
        if (type.isUnprocessed()) {
            //load
            this.type = DocumentType.PERSON;
        }
        return type.getDays();
    }
}
