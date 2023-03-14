package expert.os.videos.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class FunctionTest {

    @Test
    public void shouldCreateFunction() {
        Function<String, Integer> converter = Integer::valueOf;
        Integer result = converter.apply("123");
        Assertions.assertThat(result).isEqualTo(123);
    }

}
