package expert.os.videos.flight;

import java.util.Objects;

public class FlightBookingBuilder {
    private String passengerName;
    private String departureCity;
    private String destinationCity;
    private String seatNumber;
    private int baggageCount;

    public FlightBookingBuilder passengerName(String passengerName) {
        this.passengerName = Objects.requireNonNull(passengerName, "Passenger name cannot be null");
        return this;
    }

    public FlightBookingBuilder departureCity(String departureCity) {
        this.departureCity = departureCity;
        return this;
    }

    public FlightBookingBuilder destinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
        return this;
    }

    public FlightBookingBuilder seatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
        return this;
    }

    public FlightBookingBuilder baggageCount(int baggageCount) {
        this.baggageCount = baggageCount;
        return this;
    }

    public FlightBooking build() {
        Objects.requireNonNull(passengerName, "Passenger name cannot be null");
        Objects.requireNonNull(departureCity, "Departure city cannot be null");
        Objects.requireNonNull(destinationCity, "Destination city cannot be null");
        Objects.requireNonNull(seatNumber, "Seat number cannot be null");
        if(baggageCount < 0) {
            throw new IllegalArgumentException("Baggage count cannot be negative");
        }
        if(departureCity.equals(destinationCity)) {
            throw new IllegalArgumentException("Departure and destination cities cannot be the same");
        }

        return new FlightBooking(passengerName, departureCity, destinationCity, seatNumber, baggageCount);
    }
}