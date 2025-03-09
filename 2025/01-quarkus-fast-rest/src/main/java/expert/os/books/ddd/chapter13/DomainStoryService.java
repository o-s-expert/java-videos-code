package expert.os.books.ddd.chapter13;

import org.jmolecules.ddd.annotation.Service;

import java.util.UUID;

@Service
public class DomainStoryService {

    private final DomainStoryRepository domainStoryRepository;

    public DomainStoryService(DomainStoryRepository domainStoryRepository) {
        this.domainStoryRepository = domainStoryRepository;
    }

    public DomainStory createDomainStory(DomainStory story) {
        story.setStatus(StoryStatus.DRAFT);
        return domainStoryRepository.save(story);
    }

    public DomainStory updateDomainStoryStatus(UUID storyId, StoryStatus newStatus) {
        DomainStory story = domainStoryRepository.findById(storyId)
                .orElseThrow(() -> new RuntimeException("DomainStory not found"));
        story.setStatus(newStatus);
        return domainStoryRepository.save(story);
    }
}
