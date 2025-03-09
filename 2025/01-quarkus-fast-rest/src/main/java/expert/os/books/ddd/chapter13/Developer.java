package expert.os.books.ddd.chapter13;

import org.jmolecules.ddd.annotation.Association;
import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

import java.util.List;
import java.util.UUID;

@Entity
public class Developer {

    @Identity
    private final UUID id;

    private final String name;

    @Association
    private List<DomainStory> domainStories;

    public Developer(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

}
