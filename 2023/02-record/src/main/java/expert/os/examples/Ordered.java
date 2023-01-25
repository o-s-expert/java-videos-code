package expert.os.examples;

import java.util.Collections;
import java.util.List;

public record Ordered(List<String> products) implements Order {
    @Override
    public Order next() {
        return new Delivered(products);
    }

    @Override
    public List<String> products() {
        return Collections.unmodifiableList(products);
    }
}
