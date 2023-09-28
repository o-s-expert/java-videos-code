package expert.os.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


//JPE 440
public class RecordsTest {

    record User(String name, long accountNumber) {
    }

    record UserDeletedEvent(User user) {
    }

    record UserCreatedEvent(String name) {
    }

    @Test
    void respondToEvents() {
        Assertions.assertEquals(
                respond(new UserCreatedEvent("jlong")), "the new user with name jlong has been created"
        );
        Assertions.assertEquals(
                respond(new UserDeletedEvent(new User("jlong", 1))),
                "the user jlong has been deleted"
        );
    }

    String respond(Object o) {
        return switch (o) {
           case UserDeletedEvent(var user) -> "the user " + user.name() + " has been deleted";
           case UserCreatedEvent(var name) -> "the new user with name " + name + " has been created";
            default -> null;
        };
    }
}
