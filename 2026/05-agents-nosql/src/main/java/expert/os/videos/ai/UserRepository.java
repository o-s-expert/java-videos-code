package expert.os.videos.ai;

import jakarta.data.repository.BasicRepository;
import jakarta.data.repository.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends BasicRepository<User, UUID> {

    Optional<User> findByEmail(String email);
}
