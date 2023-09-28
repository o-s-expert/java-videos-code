package expert.os.examples;

import java.time.Instant;
import java.util.function.Supplier;

public record UserDeletedEvent(User user, Instant when, String reason) implements Supplier<User> {
    @Override
    public User get() {
        return user;
    }
}
