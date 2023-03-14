package expert.os.videos.demo;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

public class ConsumerTest {

    @Test
    public void shouldCreateConsumer() {
        Consumer<String> log = (s) -> System.out.println("my log: " + s);
        log.accept("Ada is my dog");
    }

    @Test
    public void shouldCombineConsumer() {
        Consumer<String> logA = (s) -> System.out.println("[A] my log: " + s);
        Consumer<String> logB = (s) -> System.out.println("[B] my log: " + s);

        logA.andThen(logB).accept("My log message");
    }
}
