package expert.os.examples;

import java.util.List;

public sealed interface Order permits Ordered, Delivered, Received {

    static Order newOrder(List<String> products) {
        return new Ordered(products);
    }

    Order next();
    List<String> products();
}
