package expert.os.books.architecture.patterns.scenario03;

import org.joda.money.Money;

class CreditCardStrategy implements PaymentProcessor {
    @Override
    public void processPayment(Money amount) {
        // Complex logic:
        // - Fraud detection
        // - Transaction authorization
        // - Gateway integration

        System.out.println(
                "Processing credit card payment: " + amount
        );
    }
}
