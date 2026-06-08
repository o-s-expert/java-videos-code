package expert.os.videos.ai;

import dev.langchain4j.agent.tool.Tool;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.jnosql.mapping.Database;
import org.eclipse.jnosql.mapping.DatabaseType;

import java.util.Optional;
import java.util.logging.Logger;

@ApplicationScoped
public class UserService {

    private static final Logger LOGGER = Logger.getLogger(UserService.class.getName());

    private final UserRepository userRepository;

    @Inject
    public UserService(@Database(DatabaseType.DOCUMENT) UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Tool("Finds the internal Customer ID given a customer's email address.")
    public String getCustomerIdByEmail(String email) {
        LOGGER.info("[TOOL EXECUTION] Searching DB for email: " + email);
        Optional<User> user = this.userRepository.findByEmail(email);
        LOGGER.info("[TOOL EXECUTION] User found: " + user.isPresent());
        return user.map(u -> u.getId().toString()).orElse("USER_NOT_FOUND");
    }

}
