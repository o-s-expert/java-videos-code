package expert.os.videos.ai;

import jakarta.enterprise.context.control.RequestContextController;
import jakarta.enterprise.inject.se.SeContainer;

public class App {

    public static void main(String[] args) {
        try(SeContainer container = jakarta.enterprise.inject.se.SeContainerInitializer.newInstance().initialize()) {
            RequestContextController requestContextController = container.select(RequestContextController.class).get();
            requestContextController.activate();
            AssistantService assistantService = container.select(AssistantService.class).get();
            String response = assistantService.chat("What is the capital of France?");
            System.out.println("Assistant response: " + response);
            requestContextController.deactivate();
        }
    }
}
