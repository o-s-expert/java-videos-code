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

    @Test
    public void shouldCreatePlayers() {
        Team bahia = Team.of("Bahia");
        bahia.add(Player.of("Neymar", "Santos", 10));
        bahia.add(Player.of("Cristiano Ronaldo", "Lisbon", 10));

        org.assertj.core.api.Assertions.assertThat(bahia.players())
                .hasSize(2)
                .map(Player::name)
                .contains("Neymar", "Cristiano Ronaldo");
    }

}