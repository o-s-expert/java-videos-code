package expert.os.videos.soccer;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Team {

    private TeamId id;

    private String name;

    private List<Player> players;


    public Team(TeamId id, String name, List<Player> players) {
        this.id = id;
        this.name = name;
        this.players = players;
    }

    public List<Player> getPlayers() {
        return Collections.unmodifiableList(players);
    }

    public void remove(Player player) {
        players.remove(player);
    }

    public void add(Player player) {
        players.add(player);
    }
}
