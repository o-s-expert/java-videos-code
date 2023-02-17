package expert.os.workshop.ddd.taxi;

import java.time.Year;
import java.util.Objects;

public record Car(String plate, Year year, String model) {

    public Car {
        Objects.requireNonNull(plate, "plate is required");
        Objects.requireNonNull(year, "year is required");
        Objects.requireNonNull(model, "model is required");
    }
}
