package expert.os.videos.flight;


public final class FlightBookingFlow {

    private FlightBookingFlow() {
    }

    public static DepartureStep bookFlight() {
        return departureCity -> destinationCity -> passengerName -> seatNumber -> baggageCount ->
                () -> new FlightBooking(
                        passengerName,
                        departureCity,
                        destinationCity,
                        seatNumber,
                        baggageCount
                );
    }

    public interface DepartureStep {
        DestinationStep from(String departureCity);
    }

    public interface DestinationStep {
        PassengerStep to(String destinationCity);
    }

    public interface PassengerStep {
        SeatStep forPassenger(String passengerName);
    }

    public interface SeatStep {
        BaggageStep seat(String seatNumber);
    }

    public interface BaggageStep {
        ConfirmationStep withBags(int baggageCount);
    }

    public interface ConfirmationStep {
        FlightBooking confirm();
    }
}