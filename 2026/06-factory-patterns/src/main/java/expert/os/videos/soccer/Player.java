package expert.os.videos.soccer;

import java.util.UUID;

public class Player {

    private UUID id;

    private String name;

    private Position position;


    public Player(UUID id, String name, Position position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }
}
