package expert.os.videos.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

import java.util.Optional;
import java.util.function.Supplier;

@EnabledIfSystemProperty(named = "os.exepert.test",matches = "true")
public class SupplierTest {

    @Test
    public void shouldUseSupplier() {
        Supplier<String> db = () -> "Ada";

        Optional<String> cache = Optional.empty();

        String name = cache.orElseGet(db);
        Assertions.assertThat(name).isEqualTo("Ada");
    }
}
