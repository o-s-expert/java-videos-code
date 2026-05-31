package expert.os.videos.ai;

import dev.langchain4j.agent.tool.Tool;
import jakarta.enterprise.context.ApplicationScoped;

// --- 1. The Disconnected Tools (Deterministic Infrastructure) ---
@ApplicationScoped
public class EnterpriseTools {

    // Tool A
    @Tool("Finds the internal Customer ID given a customer's email address.")
    public String getCustomerIdByEmail(String email) {
        System.out.println("[TOOL EXECUTION] Searching DB for email: " + email);
        return "CUST-9988"; // Mock database lookup
    }

    // Tool B (Requires the output of Tool A)
    @Tool("Finds the active Order Number for a given internal Customer ID.")
    public String getActiveOrderNumber(String customerId) {
        System.out.println("[TOOL EXECUTION] Looking up order for ID: " + customerId);
        if (customerId.equals("CUST-9988")) {
            return "ORD-12345";
        }
        return "NO_ACTIVE_ORDERS";
    }

    // Tool C (Requires the output of Tool B)
    @Tool("Cancels an order given an Order Number. Returns the refund status.")
    public String cancelOrder(String orderNumber) {
        System.out.println("[TOOL EXECUTION] Calling payment gateway to cancel: " + orderNumber);
        return "SUCCESS - $45.00 Refunded";
    }
}