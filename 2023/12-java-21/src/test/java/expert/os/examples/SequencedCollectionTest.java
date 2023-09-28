package expert.os.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.SequencedCollection;

import static org.assertj.core.api.Assertions.assertThat;

//JEP 431
class SequencedCollectionTest {

    @Test
    void shouldOrdering()  {
        SequencedCollection<String> languages = LinkedHashSet.newLinkedHashSet(10);
        languages.add("English");
        languages.add("French");
        languages.add("Italian");
        languages.add("Spanish");
        languages.addFirst("Portuguese");
        Assertions.assertEquals(languages.getFirst(), "Portuguese");
        Assertions.assertEquals(languages.getLast(), "Spanish");
        assertThat(languages)
                .isNotEmpty()
                .hasSize(5)
                .containsExactly("Portuguese", "English", "French", "Italian", "Spanish");

        SequencedCollection<String> reversed = languages.reversed();
        assertThat(reversed)
                .isNotEmpty()
                .hasSize(5)
                .containsExactly("Spanish", "Italian", "French", "English", "Portuguese");

    }
}