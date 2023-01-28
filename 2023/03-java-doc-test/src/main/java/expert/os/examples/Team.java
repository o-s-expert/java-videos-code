package expert.os.examples;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Team is a unit to compete in a soccer match
 */
public record Team(String name, List<Player> players) {

    /**
     * Creates a Team
     *
     * @param name    the team's name
     * @param players the players
     * @throws NullPointerException when name or players are <b>null</b>
     */
    public Team {
        Objects.requireNonNull(name, "name is required");
        Objects.requireNonNull(players, "players is required");
    }

    /**
     * Add a {@link Player} to the team
     *
     * @param player a team player
     * @throws NullPointerException     when player is null
     * @throws IllegalArgumentException when a team is over eleven players
     */
    public void add(Player player) {

    }

    /**
     * Returns players names split by comma {@link Player#name()}
     * @return the players names split by comma
     * @see Player#name()
     */
    public String getPlayerNames() {
        return  players.stream()
                .map(Player::name)
                .collect(Collectors.joining(","));
    }
    @Override
    public List<Player> players() {
        return Collections.unmodifiableList(players);
    }
}
