package expert.os.examples;

import java.util.Collections;
import java.util.List;

public record Delivered(List<String> products) implements Order {
    @Override
    public Order next() {
        return new Received(products);
    }

    @Override
    public List<String> products() {
        return Collections.unmodifiableList(products);
    }
}
