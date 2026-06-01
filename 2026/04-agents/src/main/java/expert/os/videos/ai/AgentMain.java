package expert.os.videos.ai;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class AgentMain {

    public static void main(String[] args) {
        try(SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            CustomerResolutionAgent agent = container.select(CustomerResolutionAgent.class).get();

            String resolved = agent.resolveCustomer("Hello, my name is Otavio, email is otavio@otavio.com. Please, cancel my current order");

            System.out.println("Agent execution finished: " + resolved);
        }
    }
}
