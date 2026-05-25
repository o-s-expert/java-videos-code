package expert.os.videos.soccer;

import java.util.UUID;

public class PlayerFactory {

    public Player createFoward(String name) {
        return new Player(UUID.randomUUID(), name, Position.FORWARD);
    }
}
