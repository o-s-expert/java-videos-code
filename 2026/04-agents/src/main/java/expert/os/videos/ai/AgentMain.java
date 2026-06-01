package expert.os.videos.ai;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class AgentMain {

    public static void main(String[] args) {
        try(SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            CustomerResolutionAgent agent = container.select(CustomerResolutionAgent.class).get();
            String resolution = agent.resolveCustomer("I want to cancel my order, my email is otavio@otavio.com");
            System.out.println(resolution);

        }
    }
}
