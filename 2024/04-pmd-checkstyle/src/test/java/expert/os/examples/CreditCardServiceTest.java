package expert.os.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardServiceTest {

private CreditCardService creditCardService = new CreditCardService();
    @Test
    void shouldPay() {
CreditCard creditCard = new CreditCard();
    Product product = new Product();
        creditCardService.pay(creditCard, product);
    }

}