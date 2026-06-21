package expert.os.videos.flight;

import java.util.Objects;

public class FlightBookingBuilder {
    private String passengerName;
    private String departureCity;
    private String destinationCity;
    private String seatNumber;
    private int baggageCount;

    public FlightBookingBuilder passengerName(String passengerName) {
        this.passengerName =   Objects.requireNonNull(passengerName, "Passenger name must not be null");;
        return this;
    }

    public FlightBookingBuilder departureCity(String departureCity) {
        this.departureCity =    Objects.requireNonNull(departureCity, "Departure city must not be null");;
        return this;
    }

    public FlightBookingBuilder destinationCity(String destinationCity) {
        this.destinationCity =  Objects.requireNonNull(destinationCity, "Destination city must not be null");;
        return this;
    }

    public FlightBookingBuilder seatNumber(String seatNumber) {
        this.seatNumber =   Objects.requireNonNull(seatNumber, "Seat number must not be null");;
        return this;
    }

    public FlightBookingBuilder baggageCount(int baggageCount) {
        if(baggageCount < 0) {
            throw new IllegalArgumentException("Baggage count must not be negative");
        }
        this.baggageCount = baggageCount;
        return this;
    }

    public FlightBooking build() {
        Objects.requireNonNull(passengerName, "Passenger name must not be null");
        Objects.requireNonNull(departureCity, "Departure city must not be null");
        Objects.requireNonNull(destinationCity, "Destination city must not be null");
        Objects.requireNonNull(seatNumber, "Seat number must not be null");
        if(baggageCount < 0) {
            throw new IllegalArgumentException("Baggage count must not be negative");
        }
        return new FlightBooking(passengerName, departureCity, destinationCity, seatNumber, baggageCount);
    }
}