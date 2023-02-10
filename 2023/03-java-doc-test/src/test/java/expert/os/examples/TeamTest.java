package expert.os.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Collection;
import java.util.List;

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