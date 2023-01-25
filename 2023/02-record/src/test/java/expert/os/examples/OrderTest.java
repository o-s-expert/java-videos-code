package expert.os.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderTest {

    @Test
    public void shouldShouldOrder() {
        List<String> products = List.of("Banana");
        Order order = Order.newOrder(products);
        assertThat(order).isInstanceOfAny(Ordered.class);
        Order delivered = order.next();
        assertThat(delivered).isInstanceOfAny(Delivered.class);
        Order received = delivered.next();
        assertThat(received).isInstanceOfAny(Received.class);

        Assertions.assertThrows(IllegalStateException.class, () -> received.next());
    }
}
