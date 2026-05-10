package expert.os.books.architecture.patterns.scenario03;

import org.joda.money.Money;

class PayPalStrategy implements PaymentProcessor {
    @Override
    public void processPayment(Money amount) {
        // Complex logic:
        // - HTTP communication
        // - Authentication
        // - Retry strategies
        // - External API integration

        System.out.println(
                "Processing PayPal payment: " + amount
        );
    }
}
