package expert.os.books.ddd.chapter13;

import org.jmolecules.ddd.annotation.Association;
import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

import java.util.List;
import java.util.UUID;

@Entity
public class DomainExpert {

    @Identity
    private final UUID id;

    private final String name;

    @Association
    private List<DomainStory> domainStories;

    public DomainExpert(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

}
