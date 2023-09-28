package expert.os.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Optional;
import java.util.function.Supplier;

public class RecordTest {

    @Test
    public void shouldGetEvent(){
        User otaviojava = new User("otaviojava");
        Supplier<User> userSupplier = new UserCreatedEvent(otaviojava, Instant.now());
        var log = log(userSupplier);
        Assertions.assertEquals(otaviojava, log.get());
    }

    @Test
    public void shouldGetEventDeleted(){
        User otaviojava = new User("otaviojava");
        Supplier<User> userSupplier = new UserDeletedEvent(otaviojava, Instant.now(), "nope reason");
        var log = log(userSupplier);
        Assertions.assertEquals(otaviojava, log.get());
    }

    @Test
    public void switchSample(){
        User otaviojava = new User("otaviojava");
        Supplier<User> userSupplier = new UserDeletedEvent(otaviojava, Instant.now(), "nope reason");
        var log = fireEvent(userSupplier);
        System.out.println("The log:" + log);
    }

    private Optional<User> log(Supplier<User> supplier){
        if(supplier instanceof UserCreatedEvent(User user, Instant instant) ){
            System.out.println("User created at " + instant + " with username " + user.username());
            return Optional.of(user);
        } else if (supplier instanceof UserDeletedEvent(User user, Instant instant, String reason)) {
            System.out.println("User delete at " + instant + " with username " + user.username() + " because " + reason);
            return Optional.of(user);
        }
        return Optional.empty();
    }

    String fireEvent(Supplier<User> supplier) {
        return switch (supplier){
            case UserCreatedEvent(var user, var instant) -> "User created at " + instant + " with username " + user.username();
            case UserDeletedEvent(var user, var instant, var reason) -> "User delete at " + instant +
                    " with username " + user.username() + " because " + reason;
            default -> "No event";
        };
    }
}
