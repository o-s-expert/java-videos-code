package expert.os.videos.ai;

import jakarta.nosql.Column;
import jakarta.nosql.Entity;
import jakarta.nosql.Id;

import java.util.UUID;

@Entity
public record Order(@Id UUID id, @Column String customerId, @Column String product, @Column OrderStatus status) {


    public static Order of(User user, String product) {
        return new Order(UUID.randomUUID(), user.getId(), product, OrderStatus.PLACED);
    }

    public Order cancel() {
        return new Order(id, customerId, product, OrderStatus.CANCELLED);
    }
}
