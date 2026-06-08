package expert.os.videos.ai;

import jakarta.data.repository.BasicRepository;
import jakarta.data.repository.Param;
import jakarta.data.repository.Query;
import jakarta.data.repository.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface OrderRepository extends BasicRepository<Order, String> {

    @Query("WHERE customerId = :customerId AND status = 'PLACED'")
    Optional<Order> findByCustomerId(@Param("customerId") String customerId);
}
