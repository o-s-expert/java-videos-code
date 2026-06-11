package expert.os.videos.ai;

import dev.langchain4j.agent.tool.Tool;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.jnosql.mapping.Database;
import org.eclipse.jnosql.mapping.DatabaseType;

import java.util.Optional;
import java.util.UUID;
import java.util.logging.Logger;

@ApplicationScoped
public class OrderService {

    private static final Logger LOGGER = Logger.getLogger(OrderService.class.getName());

    private final OrderRepository repository;

    @Inject
    public OrderService(@Database(DatabaseType.DOCUMENT) OrderRepository repository) {
        this.repository = repository;
    }

    // Tool B (Requires the output of Tool A)
    @Tool("Finds the active Order Number for a given internal Customer ID.")
    public String getActiveOrderNumber(String customerId) {
        LOGGER.info("[TOOL EXECUTION] Looking up order for ID: " + customerId);
        Optional<Order> order = repository.findByCustomerId(customerId);
        return order.map(Order::id).map(UUID::toString).orElse("NO_ACTIVE_ORDERS");
    }

    // Tool C (Requires the output of Tool B)
    @Tool("Cancels an order given an Order Number. Returns the refund status.")
    public String cancelOrder(String orderNumber) {
        LOGGER.info("[TOOL EXECUTION] Calling payment gateway to cancel: " + orderNumber);
        Optional<Order> order = repository.findById(UUID.fromString(orderNumber));
        order.ifPresent(o -> repository.save(o.cancel()));
        return order.isPresent() ? "SUCCESS - $45.00 Refunded" : "ORDER_NOT_FOUND";
    }
}
