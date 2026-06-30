package expert.os.videos.flight;

public class FlightBookingFlow {

    public static DepartureCityStep bookFlight() {
        return departureCity ->
                destinationCity ->
                passengerName ->
                seatNumber ->
                baggageCount ->
                        () ->new FlightBooking(departureCity, destinationCity, passengerName, seatNumber, baggageCount);
    }
    public interface DepartureCityStep {
        DestinationCityStep from(String departureCity);
    }

    public interface DestinationCityStep {
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
