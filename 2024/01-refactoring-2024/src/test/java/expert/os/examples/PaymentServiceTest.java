package expert.os.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {


    @Test
    void pay() {
        User user = new User();
        Money amount = new Money();
        PaymentService paymentService = new CreditCardPaymentService();
        String result = paymentService.pay(user, amount);
        assertEquals("The credit Card Payment Successful", result);
    }
}