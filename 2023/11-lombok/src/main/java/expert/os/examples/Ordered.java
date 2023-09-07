package expert.os.examples;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public record Ordered(List<String> products) implements Order {

    public Ordered {
        Objects.requireNonNull(products, "products is required");
    }
    @Override
    public Order next() {
        return new Delivered(products);
    }

    @Override
    public List<String> products() {
        return Collections.unmodifiableList(products);
    }
}
