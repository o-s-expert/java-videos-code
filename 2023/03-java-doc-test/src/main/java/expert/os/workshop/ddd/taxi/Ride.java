package expert.os.workshop.ddd.taxi;

import java.time.LocalTime;

public record Ride (String departure, String destination, int distance, LocalTime time) {
}
