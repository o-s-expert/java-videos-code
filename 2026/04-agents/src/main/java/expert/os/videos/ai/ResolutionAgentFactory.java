package expert.os.videos.ai;

import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ResolutionAgentFactory {

    @Inject
    private ChatModel chatModel;

    @Inject
    private EnterpriseTools enterpriseTools;

    public CustomerResolutionAgent createAgent() {
        return AiServices.builder(CustomerResolutionAgent.class)
                .chatModel(chatModel)
                .chatMemory(MessageWindowChatMemory.withMaxMessages(20))
                .tools(enterpriseTools) // Injecting the suite of tools
                .build();
    }
}