package expert.os.videos.ai;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;


@ApplicationScoped
public class ResolutionAgentFactory {

    @Inject
    private ChatModel chatModel;

    @Inject
    private EnterpriseTools tools;

    @Produces
    public CustomerResolutionAgent create() {
        return AiServices.builder(CustomerResolutionAgent.class)
                .chatModel(chatModel)
                .tools(tools)
                .build();
    }
}
