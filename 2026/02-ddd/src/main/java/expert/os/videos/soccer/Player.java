package expert.os.videos.soccer;

import javax.money.MonetaryAmount;
import java.util.UUID;

public class Player {

    private UUID id;

    private String name;

    private String city;

    private MonetaryAmount salary;

    public Player(UUID id, String name, String city, MonetaryAmount salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
    }
}
