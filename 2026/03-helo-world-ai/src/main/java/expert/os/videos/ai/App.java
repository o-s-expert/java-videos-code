package expert.os.videos.ai;

import jakarta.enterprise.context.control.RequestContextController;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class App {

    public static void main(String[] args) {
        try(SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            RequestContextController requestContextController = container.select(RequestContextController.class).get();
            requestContextController.activate();
            var service = container.select(AssistantService.class).get();
            System.out.println("The city is: " + service.chat("What is the capital of France?"));
            System.out.println("Who will win the next world cup: " + service.chat("Who will win the next FIFA's mens world cup ?"));
            requestContextController.deactivate();
        }
    }
}
