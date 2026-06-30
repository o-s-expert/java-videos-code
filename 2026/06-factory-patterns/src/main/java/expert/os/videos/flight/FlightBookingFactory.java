package expert.os.videos.flight;

public class FlightBookingFactory {

        public static FlightBooking createFlightBooking(String passengerName,
                                                        String departureCity,
                                                        String destinationCity,
                                                        String seatNumber,
                                                        int baggageCount) {
            if(passengerName == null || passengerName.isEmpty()) {
                throw new IllegalArgumentException("Passenger name cannot be null or empty");
            }
            if(departureCity == null || departureCity.isEmpty()) {
                throw new IllegalArgumentException("Departure city cannot be null or empty");
            }
            if(destinationCity == null || destinationCity.isEmpty()) {
                throw new IllegalArgumentException("Destination city cannot be null or empty");
            }
            if(seatNumber == null || seatNumber.isEmpty()) {
                throw new IllegalArgumentException("Seat number cannot be null or empty");
            }
            if(baggageCount < 0) {
                throw new IllegalArgumentException("Baggage count cannot be negative");
            }
            if(departureCity.equals(destinationCity)) {
                throw new IllegalArgumentException("Departure and destination cities cannot be the same");
            }

            return new FlightBooking(passengerName, departureCity, destinationCity, seatNumber, baggageCount);
        }


}
