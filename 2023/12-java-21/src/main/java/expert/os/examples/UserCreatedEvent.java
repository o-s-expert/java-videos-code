package expert.os.examples;

import java.time.Instant;
import java.util.function.Supplier;

public record UserCreatedEvent(User user, Instant when) implements Supplier<User> {
    @Override
    public User get() {
        return user;
    }
}
