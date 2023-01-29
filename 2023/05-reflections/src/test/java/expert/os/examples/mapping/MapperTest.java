package expert.os.examples.mapping;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapperTest {

    private Mapper mapper;

    @BeforeEach
    public void setUp() {
        this.mapper = new ReflectionMapper();
    }
    @Test
    public void shouldConvertToMap() {
        Pet ada = Pet.of("Ada", 8);
        Map<String, Object> map = mapper.toMap(ada);
        Assertions.assertNotNull(map);
        org.assertj.core.api.Assertions.assertThat(map)
                .containsKeys("_entity", "name", "age")
                .containsEntry("name", "Ada")
                .containsEntry("age", 8)
                .containsEntry("_entity", Pet.class.getName());
    }
}