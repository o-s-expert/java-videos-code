package expert.os.books.architecture.patterns.scenario03;

import org.joda.money.Money;

public interface PaymentProcessor {

    void processPayment(Money amount);
}