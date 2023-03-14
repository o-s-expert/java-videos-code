package expert.os.videos.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.function.Supplier;

public class SupplierTest {

    @Test
    public void shouldUseSupplier() {
        Supplier<String> db = () -> "Ada";

        Optional<String> cache = Optional.empty();

        String name = cache.orElseGet(db);
        Assertions.assertThat(name).isEqualTo("Ada");
    }
}
