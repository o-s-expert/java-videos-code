package expert.os.examples;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Inventory {

    @Inject
    private Payment payment;


    public void buy(Product product) {
        this.payment.buy(product);
    }
}
