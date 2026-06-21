package expert.os.videos.flight;

public class App {

    public static void main(String[] args) {

        constructorExample();

        builderExample();

        fluentApiExample();

        factoryExample();
    }

    private static void constructorExample() {
        System.out.println("\n=== Constructor ===");

        FlightBooking booking = new FlightBooking(
                "Otavio Santana",
                "Lisbon",
                "Paris",
                "12A",
                1
        );

        System.out.println(booking);
    }

    private static void builderExample() {
        System.out.println("\n=== Builder Pattern ===");

        FlightBooking booking = new FlightBookingBuilder()
                .passengerName("Otavio Santana")
                .departureCity("Lisbon")
                .destinationCity("Paris")
                .seatNumber("12A")
                .baggageCount(1)
                .build();

        System.out.println(booking);
    }

    private static void fluentApiExample() {
        System.out.println("\n=== Fluent API ===");

        FlightBooking booking = FlightBookingFlow
                .bookFlight()
                .from("Lisbon")
                .to("Paris")
                .forPassenger("Otavio Santana")
                .seat("12A")
                .withBags(1)
                .confirm();

        System.out.println(booking);
    }

    private static void factoryExample() {
        System.out.println("\n=== DDD Factory ===");

        FlightBookingFactory factory = new FlightBookingFactory();

        FlightBooking booking = factory.createInternationalFlight(
                "Otavio Santana",
                "Lisbon",
                "Paris"
        );

        System.out.println(booking);
    }
}