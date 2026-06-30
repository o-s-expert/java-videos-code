package expert.os.videos.flight.app;

import expert.os.videos.flight.FlightBooking;
import expert.os.videos.flight.FlightBookingFactory;
import expert.os.videos.flight.FlightBookingFlow;

public class App {
    public static void main(String[] args) {
            System.out.println("Welcome to the Flight Booking Application!");
            FlightBooking booking = FlightBooking.builder()
                    .passengerName("John Doe")
                    .build();

            var factory = new FlightBookingFactory();
            factory.createFlightBooking("John Doe", "New York", "Los Angeles", "A1", 2);
            System.out.println("Booking created: " + booking);

        FlightBookingFlow.bookFlight().from("New York")
                .to("Los Angeles")
                .forPassenger("John Doe")
                .seat("A1")
                .withBags(2)
                .confirm();
    }
}
