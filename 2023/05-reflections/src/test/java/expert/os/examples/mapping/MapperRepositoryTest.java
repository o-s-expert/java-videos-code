package expert.os.examples.mapping;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MapperRepositoryTest {

    private MapperRepository repository;

    @BeforeEach
    public void setUp() {
        this.repository = MapperRepository.repository();
    }

    @Test
    public void shouldEntity() {
        Pet ada = Pet.of("Ada", 8);
        Map<String, Object> map = repository.map(ada);

        assertThat(map)
                .isNotNull()
                .isNotEmpty()
                .containsKeys("_entity", "name", "age")
                .containsEntry("name", "Ada")
                .containsEntry("age", 8)
                .containsEntry("_entity", Pet.class.getName());
    }

    @Test
    public void shouldMap() {
        Map<String, Object> map = Map.of("_entity", Pet.class.getName()
                , "name", "Ada", "age", 8);

        Pet pet = repository.entity(map);

        assertThat(pet).isNotNull()
                .isInstanceOf(Pet.class)
                .matches(p -> p.name().equals("Ada"))
                .matches(p -> p.age() == 8);
    }
}