package expert.os.videos.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerTest {

    @Test
    public void shouldList() {
        Player neymar = new Player("Neymar", "Santos", 10);
        Player ronaldo = new Player("Ronaldo", "Lisbon", 15);
        Player messi = new Player("Messi", "Buenos Aires", 20);

        List<Player> team = List.of(neymar, ronaldo, messi);
        List<Player> players = team.stream().sorted().collect(Collectors.toUnmodifiableList());

        Assertions.assertThat(players)
                .isNotEmpty()
                .containsExactly(messi, neymar, ronaldo);
    }

    @Test
    public void shouldUseComparator() {
            Player neymar = new Player("Neymar", "Santos", 10);
            Player ronaldo = new Player("Ronaldo", "Lisbon", 15);
            Player messi = new Player("Messi", "Buenos Aires", 20);

            List<Player> team = List.of(neymar, ronaldo, messi);

            Comparator<Player> orderByCity = Comparator.comparing(Player::city);

            List<Player> players = team.stream().sorted(orderByCity).collect(Collectors.toUnmodifiableList());

            Assertions.assertThat(players)
                    .containsExactly(messi, ronaldo, neymar);
        }

    @Test
    public void shouldUseComparatorReverse() {
        Player neymar = new Player("Neymar", "Santos", 10);
        Player ronaldo = new Player("Ronaldo", "Lisbon", 15);
        Player messi = new Player("Messi", "Buenos Aires", 20);

        List<Player> team = List.of(neymar, ronaldo, messi);

        Comparator<Player> orderByCity = Comparator.comparing(Player::city).reversed();

        List<Player> players = team.stream().sorted(orderByCity).collect(Collectors.toUnmodifiableList());

        Assertions.assertThat(players)
                .containsExactly(neymar, ronaldo, messi);
    }


}
