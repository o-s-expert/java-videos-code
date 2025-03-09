package expert.os.books.ddd.chapter13;

import org.jmolecules.ddd.annotation.AggregateRoot;
import org.jmolecules.ddd.annotation.Association;
import org.jmolecules.ddd.annotation.Identity;

import java.util.UUID;

@AggregateRoot
public class DomainStory {

    @Identity
    private final UUID id;

    private final String title;

    private StoryStatus status;

    @Association
    private final DomainExpert domainExpert;

    @Association
    private final Developer developer;

    public DomainStory(UUID id, String title, DomainExpert domainExpert, Developer developer) {
        this.id = id;
        this.title = title;
        this.status = StoryStatus.DRAFT;
        this.domainExpert = domainExpert;
        this.developer = developer;
    }

    public void setStatus(StoryStatus storyStatus) {
        this.status = storyStatus;
    }
}
