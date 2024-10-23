package expert.os.examples;


import java.util.Optional;

public interface Hotel {

    void checkIn(Room room);

    void checkOut(Room room);

    Optional<Room> checkReservation(int number);
}
