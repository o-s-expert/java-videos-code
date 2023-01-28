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

    @ParameterizedTest
    @MethodSource("players")
    public void shouldCreatePlayer(Player player) {
        Assertions.assertNotNull(player);
        Team bahia = Team.of("Bahia");
        bahia.add(player);
    }


    @ParameterizedTest
    @MethodSource("fullTeam")
    public void shouldThrowsAnExceptionWhenTeamIsOver(List<Player> players) {
        Team bahia = Team.of("name");
        players.forEach(bahia::add);

        Assertions.assertThrows(OverTeamException.class, () ->
                bahia.add(Player.of("Otavio", "Salvador", 0)
                ));

    }

    @ParameterizedTest(name = "Should create a team {0}")
    @ValueSource(strings = {"Bahia", "Santos"})
    public void shouldCreateTeam(String name) {
        Team team = Team.of(name);
        Assertions.assertNotNull(team);

    }

    @ParameterizedTest
    @ArgumentsSource(PlayersProvider.class)
    public void shouldShouldTotalScore(List<Player> players) {
        Team team = Team.of("Leiria");
        players.forEach(team::add);
        int score = team.score();
        Assertions.assertEquals(20, score);
    }

    static Collection<Arguments> players() {
        return List.of(Arguments.of(Player.of("Neymar", "Santos", 10)));
    }

    static Collection<Arguments> fullTeam() {
        return List.of(Arguments.of(
                List.of(
                        Player.of("Neymar", "Santos", 10),
                        Player.of("Neymar", "Santos", 10),
                        Player.of("Neymar", "Santos", 10),
                        Player.of("Neymar", "Santos", 10),
                        Player.of("Neymar", "Santos", 10),
                        Player.of("Neymar", "Santos", 10),
                        Player.of("Neymar", "Santos", 10),
                        Player.of("Neymar", "Santos", 10),
                        Player.of("Neymar", "Santos", 10),
                        Player.of("Neymar", "Santos", 10),
                        Player.of("Neymar", "Santos", 10))));
    }

}