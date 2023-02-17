package expert.os.workshop.ddd.taxi;

import java.time.LocalTime;
import java.util.Objects;

public record Ride(String departure, String destination, int distance, LocalTime time) {

    public Ride {
        Objects.requireNonNull(departure, "departure is required");
        Objects.requireNonNull(destination, "departure is required");
        Objects.requireNonNull(time, "departure is required");
        if (distance < 0) {
            throw new IllegalArgumentException("A distance cannot be negative");
        }
    }
}
