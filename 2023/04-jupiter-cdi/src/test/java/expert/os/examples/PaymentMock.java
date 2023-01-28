package expert.os.examples;


import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.interceptor.Interceptor;

@ApplicationScoped
@Alternative
@Priority(Interceptor.Priority.APPLICATION)
public class PaymentMock implements Payment {
    @Override
    public void buy(Product product) {
        System.out.println("this one is to test env");
    }
}
