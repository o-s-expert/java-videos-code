package expert.os.examples;

import java.math.BigDecimal;

//JPE 441
public class PatternSwitchTest {

    static String formatter(Number o) {
        return switch (o) {
            case Integer i -> String.format("int %d", i);
            case BigDecimal s -> String.format("String %s", s);
            case Double d -> String.format("double %f", d);
            default -> o.toString();
        };
    }
}
