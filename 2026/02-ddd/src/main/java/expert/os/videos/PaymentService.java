package expert.os.videos;

import java.math.BigDecimal;

public class PaymentService {

     public void process(String userId, BigDecimal amount) {
            // Simulate payment processing logic
            System.out.println("Processing payment for user: " + userId + " with amount: " + amount);
     }

     public void addPayment(String userId, CreditCard card) {
            // Simulate adding a new payment method for the user
            System.out.println("Adding new payment method for user: " + userId);
     }
}
