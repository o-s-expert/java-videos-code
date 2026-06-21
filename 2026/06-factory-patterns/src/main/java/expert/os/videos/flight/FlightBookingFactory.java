package expert.os.videos.flight;

import java.util.Objects;

public class FlightBookingFactory {

    public FlightBooking createInternationalFlight(
            String passengerName,
            String departureCity,
            String destinationCity) {

        Objects.requireNonNull(passengerName, "Passenger name must not be null");
        Objects.requireNonNull(departureCity, "Departure city must not be null");
        Objects.requireNonNull(destinationCity, "Destination city must not be null");

        if (departureCity.equals(destinationCity)) {
            throw new IllegalArgumentException(
                    "International flights require different cities");
        }

        return new FlightBooking(
                passengerName,
                departureCity,
                destinationCity,
                "UNASSIGNED",
                1
        );
    }
}