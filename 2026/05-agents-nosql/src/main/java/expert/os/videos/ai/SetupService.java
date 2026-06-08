package expert.os.videos.ai;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.jnosql.mapping.Database;
import org.eclipse.jnosql.mapping.DatabaseType;

import java.util.logging.Logger;

@ApplicationScoped
public class SetupService {

    private static final Logger LOGGER = Logger.getLogger(SetupService.class.getName());

    private final UserRepository userRepository;
    private final OrderRepository orderRepository;

    @Inject
    public SetupService(@Database(DatabaseType.DOCUMENT) UserRepository userRepository,
                        @Database(DatabaseType.DOCUMENT) OrderRepository orderRepository) {
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
    }

    public void initializeData(String email) {
        LOGGER.info("Initializing sample data...");

        // Create sample users
        User alice = userRepository.findByEmail(email).orElseGet(() -> {
            User user = User.of(email, "Alice");
            userRepository.save(user);
            LOGGER.info("Created user: " + user.getEmail());
            return user;
        });
        var pen = orderRepository.findByCustomerId(alice.getId()).orElseGet(() -> orderRepository.save(Order.of(alice, "Pen")));
        LOGGER.info("Created order for user: " + alice.getEmail() + " - Item: " + pen.id());
    }
}
