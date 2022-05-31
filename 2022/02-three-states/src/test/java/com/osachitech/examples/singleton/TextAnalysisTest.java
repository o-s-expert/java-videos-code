package com.osachitech.examples.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextAnalysisTest {

    @Test
    public void shouldPrepare() {
        TextAnalysis instance = TextAnalysis.INSTANCE;
        Assertions.assertNotNull(instance);
        String text = instance.prepare("hello poliana");
        Assertions.assertNotNull(instance);
        Assertions.assertEquals("hello poliana".toUpperCase(), text);
    }

}