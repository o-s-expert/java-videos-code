package expert.os.books.ddd.chapter13;

import org.jmolecules.ddd.annotation.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface DomainStoryRepository {

    DomainStory save(DomainStory domainStory);

    Optional<DomainStory> findById(UUID id);

    List<DomainStory> findAll();

    void deleteById(UUID id);

    List<DomainStory> findByStatus(StoryStatus status);
}
