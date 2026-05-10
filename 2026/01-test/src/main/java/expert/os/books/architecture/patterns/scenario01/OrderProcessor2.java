package expert.os.books.architecture.patterns.scenario01;

public class OrderProcessor2 {
    private final OrderStorage storage;
    private final NotificationClient notifier;

    public OrderProcessor2(OrderStorage storage, NotificationClient notifier) {
        this.storage = storage;
        this.notifier = notifier;
    }

    public void process(Order order) {
        // Pure business logic. Infrastructure is hidden behind standard interfaces.
        storage.save(order);
        notifier.sendConfirmation(order.getCustomer());
    }
}
