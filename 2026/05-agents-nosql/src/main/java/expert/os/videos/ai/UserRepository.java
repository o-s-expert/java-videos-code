package expert.os.videos.ai;

import jakarta.data.repository.BasicRepository;
import jakarta.data.repository.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends BasicRepository<User, String> {

    Optional<User> findByEmail(String email);
}
