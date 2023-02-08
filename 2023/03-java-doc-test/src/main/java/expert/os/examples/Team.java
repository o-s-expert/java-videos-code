package expert.os.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public record Team(String name, List<Player> players) {

    private static final int TEAM_SIZE = 11;

    /**
     * Once, we don't change the team during the championship, we'll create using record to make it immutable.
     *
     * @param name the team's name that is valid to FIFA
     * @param players the players of the time that should not be higher the eleven.
     * @throws NullPointerException when name or players are null
     * @throws IllegalArgumentException when it has more than eleven players
     * @deprecated please use {@link Team#of(String)} instead
     */
    public Team{
        Objects.requireNonNull(name, "name is required");
        Objects.requireNonNull(players, "players is required");
    }

    /**
     * Create an empty team
     * @param name the team's name.
     * @return a {@link Team} instance
     */
    public static Team of(String name) {
        return new Team(Objects.requireNonNull(name, "name is required")
                , new ArrayList<>());
    }


    @Override
    public List<Player> players() {
        return Collections.unmodifiableList(players);
    }

    /**
     * Add a new {@link Player} on the team
     * @param player the player
     * @throws NullPointerException when player is null
     * @throws OverTeamException when it has more than eleven players.
     */
    public void add(Player player) {
        Objects.requireNonNull(player, "player is required");
        if(this.players.size() == TEAM_SIZE) {
            throw new OverTeamException("We don't support one more player");
        }
        this.players.add(player);

    }
    public boolean isEmpty() {
        return this.players.isEmpty();
    }

    public int score() {
        return players.stream().mapToInt(Player::score)
                .sum();
    }
}
