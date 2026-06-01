package expert.os.videos.ai;

import dev.langchain4j.agent.tool.Tool;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EnterpriseTools {

    @Tool("Finds the internal customer id given a customer email address")
    public String getCustomerId(String email) {
        System.out.println("searching for email " + email);
        return "CUS-001";
    }

    @Tool("Finds the order id given a customer id")
    public String getOrder(String customerId) {
        System.out.println("searching for customer " + customerId);
        return "ORD-001";
    }

    @Tool("Cancels an order given its order id")
    public String cancelOrder(String orderId) {
        System.out.println("cancelling order " + orderId);
        return "cancelled";
    }
}
