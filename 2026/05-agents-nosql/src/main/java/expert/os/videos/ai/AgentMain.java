package expert.os.videos.ai;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

import java.util.logging.Logger;

public class AgentMain {

    private static final Logger LOGGER = Logger.getLogger(AgentMain.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Starting Customer Resolution Agent...");
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {

            // Fetch the Orchestrator Factory
            ResolutionAgentFactory factory = container.select(ResolutionAgentFactory.class).get();
            var setupService = container.select(SetupService.class).get();
            LOGGER.info("Initializing data for user");
            setupService.initializeData("alice@test.com");
            CustomerResolutionAgent agent = factory.createAgent();
            var prompt = "User: Hi, my email is alice@test.com. Please cancel my current order.";
            LOGGER.info("Starting conversation with user: " + prompt);
            System.out.println();

            // The ReAct loop happens automatically inside this method call!
            String response = agent.resolveCustomer(prompt);
            LOGGER.info("Conversation ended with user: " + response);
        }
    }
}
