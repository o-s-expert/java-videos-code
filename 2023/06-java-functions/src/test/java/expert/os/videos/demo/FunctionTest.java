package expert.os.videos.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionTest {

    @Test
    public void shouldCreateFunction() {
        Function<String, Integer> converter = Integer::valueOf;
        Integer result = converter.apply("123");
        Assertions.assertThat(result).isEqualTo(123);
    }

    @Test
    public void shouldCreateSpeciliazations() {
        UnaryOperator<String> trim = String::trim;
        BiFunction<Integer, Integer, Integer> operation = (a, b) -> a * b;

        Assertions.assertThat(operation.apply(1, 2)).isEqualTo(2);
    }

}
