package expert.os.videos.ai;

import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ResolutionAgentFactory {

    private final ChatModel chatModel;

    private final  OrderService orderService;

    private final  UserService userService;

    @Inject
    public ResolutionAgentFactory(ChatModel chatModel, OrderService orderService, UserService userService) {
        this.chatModel = chatModel;
        this.orderService = orderService;
        this.userService = userService;
    }

    public CustomerResolutionAgent createAgent() {
        return AiServices.builder(CustomerResolutionAgent.class)
                .chatModel(chatModel)
                .chatMemory(MessageWindowChatMemory.withMaxMessages(20))
                .tools(orderService, userService) // Injecting the suite of tools
                .build();
    }
}