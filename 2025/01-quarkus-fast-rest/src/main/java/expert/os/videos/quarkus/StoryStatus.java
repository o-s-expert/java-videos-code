package expert.os.videos.quarkus;


import org.jmolecules.ddd.annotation.ValueObject;

@ValueObject
public enum StoryStatus {
    DRAFT,
    REVIEWED,
    APPROVED
}
