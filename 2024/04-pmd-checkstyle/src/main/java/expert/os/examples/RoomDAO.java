package expert.os.examples;


import java.util.Optional;

public interface RoomDAO {

    void insert(Room room);

    void update(Room room);

    void delete(Room room);

    Optional<Room> findById(int number);
 }
