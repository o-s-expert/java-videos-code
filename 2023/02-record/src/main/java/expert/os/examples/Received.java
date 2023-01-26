package expert.os.examples;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public record Received(List<String> products) implements Order {

    public Received {
        Objects.requireNonNull(products, "products is required");
    }

    @Override
    public Order next() {
        throw new IllegalStateException("We finished our journey here");
    }

    @Override
    public List<String> products() {
        return Collections.unmodifiableList(products);
    }

}
