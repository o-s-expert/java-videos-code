package expert.os.videos;

import java.math.BigDecimal;

public class PaymentService {

        public void processPayment(String userId, BigDecimal amount) {
            // Simulate payment processing logic
            System.out.println("Processing payment of $" + amount + " for user: " + userId);
            // In a real application, you would integrate with a payment gateway here
        }
}
