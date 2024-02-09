package expert.os.examples;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.SequencedCollection;

import static org.assertj.core.api.Assertions.assertThat;

public class SequenceCollectionTest {

    @Test
    public void shouldCreateSequenceCollection() {
        SequencedCollection<String> languages = LinkedHashSet.newLinkedHashSet(10);
        languages.add("English");
        languages.add("Spanish");
        languages.add("French");
        languages.add("Italian");
        languages.addFirst("Portuguese");

        assertThat(languages.getFirst()).isEqualTo("Portuguese");
        assertThat(languages.getLast()).isEqualTo("Italian");

        assertThat(languages)
                .containsExactly("Portuguese", "English", "Spanish", "French", "Italian");

        SequencedCollection<String> reversed = languages.reversed();
        assertThat(reversed)
                .containsExactly("Italian", "French", "Spanish", "English", "Portuguese");
    }
}
