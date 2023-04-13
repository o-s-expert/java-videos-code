package expert.os.videos.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

public class PredicateTest {

    @Test
    public void shouldUsePredicate() {
        Predicate<Integer> higherTen = i -> i > 10;

        Assertions.assertThat(higherTen.test(12)).isTrue();
        Assertions.assertThat(higherTen.test(5)).isFalse();
    }

    @Test
    public void shouldDecoratePredicate() {
        Predicate<Integer> higherTen = i -> i > 10;
        Predicate<Integer> lesserOneHundraded = i -> i < 100;

        Assertions.assertThat(higherTen.or(lesserOneHundraded).test(35))
                .isTrue();
        Assertions.assertThat(higherTen.and(lesserOneHundraded).test(200))
                .isFalse();
    }
}
