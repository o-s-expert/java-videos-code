package expert.os.videos.flight;

public class FlightBooking {
    private final String passengerName;
    private final String departureCity;
    private final String destinationCity;
    private final String seatNumber;
    private final int baggageCount;

    FlightBooking(String passengerName,
                         String departureCity,
                         String destinationCity,
                         String seatNumber,
                         int baggageCount) {
        this.passengerName = passengerName;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.seatNumber = seatNumber;
        this.baggageCount = baggageCount;
    }

    public static FlightBookingBuilder builder() {
        return new FlightBookingBuilder();
    }
}
