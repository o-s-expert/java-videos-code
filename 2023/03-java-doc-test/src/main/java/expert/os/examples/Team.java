package expert.os.examples;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Team is a unit to compete in a soccer match
 */
public record Team(String name, List<Player> players) {

    public Team{
        Objects.requireNonNull(name, "name is required");
        Objects.requireNonNull(players, "players is required");
    }

    /**
     * Add a {@link Player} to the team
     * @param player a team player
     * @throws NullPointerException when player is null
     * @throws IllegalArgumentException
     */
    public void add(Player player) {

    }

    @Override
    public List<Player> players() {
        return Collections.unmodifiableList(players);
    }
}
