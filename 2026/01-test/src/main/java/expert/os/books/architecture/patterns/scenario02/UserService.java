package expert.os.books.architecture.patterns.scenario02;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(User user) {
        try {
            User u = userRepository.findById("123");
        } catch (RuntimeException e) {
            // THE LEAK: The domain logic is forced to know about java.sql infrastructure
            // to properly handle the error, destroying the value of the interface.
            if (e.getCause() instanceof java.sql.SQLException) {
                // Execute DB-specific retry logic...
            }
        }
    }
}
