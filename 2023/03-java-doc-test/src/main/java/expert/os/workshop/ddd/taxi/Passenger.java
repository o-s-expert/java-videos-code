package expert.os.workshop.ddd.taxi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Passenger {
    private String name;

    private final List<Ride> rides = new ArrayList<>();

    public String getName() {
        return name;
    }

    public List<Ride> getRides() {
        return Collections.unmodifiableList(rides);
    }
}
