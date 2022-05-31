package com.osachitech.examples.constant;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OperationTest {

    @Test
    public void shouldAdd() {
        Operation plus = Operation.PLUS;
        Assertions.assertEquals(12D, plus.operate(10,2));
    }

    @Test
    public void shouldRemove(){
        Operation plus = Operation.MINUS;
        Assertions.assertEquals(8D, plus.operate(10,2));
    }

    @Test
    public void shouldTimes(){
        Operation plus = Operation.TIMES;
        Assertions.assertEquals(20D, plus.operate(10,2));
    }

    @Test
    public void shouldDivide() {
        Operation plus = Operation.DIVIDE;
        Assertions.assertEquals(5D, plus.operate(10,2));
    }
}