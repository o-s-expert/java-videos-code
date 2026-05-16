package expert.os.videos.soccer;

import java.util.List;
import java.util.UUID;

public class Team {

    private UUID id;

    private String name;

    private List<Player> players;

    public Team(UUID id, String name, List<Player> players) {
        this.id = id;
        this.name = name;
        this.players = players;
    }

    public void remove(Player player) {
        players.remove(player);
    }
}
