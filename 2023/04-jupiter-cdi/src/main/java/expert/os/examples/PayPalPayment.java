package expert.os.examples;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PayPalPayment implements Payment {
    @Override
    public void buy(Product product) {
        System.out.println("Using payment from external service " + product);
    }
}
