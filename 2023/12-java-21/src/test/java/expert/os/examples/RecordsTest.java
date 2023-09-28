package expert.os.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Optional;
import java.util.function.Supplier;


//JPE 440
public class RecordsTest {



    @Test
    void shouldGetEvent() {
      User otaviojava = new User("otaviojava");
        Supplier<User> event = new UserCreatedEvent(otaviojava, Instant.now());
        log(event);
    }

    private Optional<User> log(Supplier<User> event) {
        if(event instanceof UserCreatedEvent(User user1, Instant instant)) {
            System.out.println("User created: " + user1.username() + " at " + instant);
            return Optional.of(user1);
        }
        if(event instanceof UserDeletedEvent(User user1, Instant instant, String reason)) {
            System.out.println("User deleted: " + user1.username() + " at " + instant + "the reason is " + reason);
            return Optional.of(user1);
        }
        return Optional.empty();
    }

    @Test
    public void shouldGetString(){

    }

    String respond(Supplier<User> supplier) {
        return switch (supplier) {
           case UserDeletedEvent(var user, var instant, var reason) -> "the user " + user.username() + " has been deleted";
           case UserCreatedEvent(var name, var instant) -> "the new user with name " + name + " has been created";
            default -> "unknown event";
        };
    }
}
