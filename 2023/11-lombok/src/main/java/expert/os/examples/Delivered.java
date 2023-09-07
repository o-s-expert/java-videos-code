package expert.os.examples;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public record Delivered(List<String> products) implements Order {

    public Delivered {
        Objects.requireNonNull(products, "products is required");
    }
    @Override
    public Order next() {
        return new Received(products);
    }

    @Override
    public List<String> products() {
        return Collections.unmodifiableList(products);
    }
}
