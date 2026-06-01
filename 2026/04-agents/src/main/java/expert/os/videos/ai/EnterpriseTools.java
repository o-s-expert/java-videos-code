package expert.os.videos.ai;


import dev.langchain4j.agent.tool.Tool;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EnterpriseTools {


    @Tool("Finds the internal customer id for a given email address")
    public String getCustomerId(String email){
        System.out.println("[TOOL EXECUTION] searching for customer id for email: " + email);
        return "CUST-0001";
    }

    @Tool("Finds the active order for a given customer id")
    public String getActiveOrder(String customerId){
        System.out.println("[TOOL EXECUTION] searching for active order for customer id: " + customerId);
        return "ORDER-1234";
    }

    @Tool("Cancels an active order")
    public String cancelOrder(String orderId){
        System.out.println("[TOOL EXECUTION] cancelling order: " + orderId);
        return "Order cancelled";
    }
}
