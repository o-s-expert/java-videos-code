package expert.os.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TeamTest {


    @Test
    public void shouldCreateAnEmptyTeam() {
        Team bahia = Team.of("Bahia");
        Assertions.assertEquals("Bahia", bahia.name());
        Assertions.assertTrue(bahia.isEmpty());
    }

}