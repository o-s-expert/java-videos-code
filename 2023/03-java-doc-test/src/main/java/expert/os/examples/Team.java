package expert.os.examples;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public record Team(String name, List<Player> players) {

    /**
     * Creates a team
     * @param name the team's name that is valid to FIFA
     * @param players the players of the time that should not be higher the eleven.
     * @throws NullPointerException when name or players are null
     * @throws IllegalArgumentException when it has more than eleven players
     */
    public Team{
        Objects.requireNonNull(name, "name is required");
        Objects.requireNonNull(players, "players is required");
    }

    @Override
    public List<Player> players() {
        return Collections.unmodifiableList(players);
    }

    /**
     * Add a new {@link Player} on the team
     * @param player the player
     * @throws NullPointerException when player is null
     * @throws IllegalArgumentException when it has more than eleven players.
     */
    public void add(Player player) {

    }
}
