package expert.os.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.SequencedCollection;

//JEP 431
class SequencedCollectionTest {

    @Test
    void ordering()  {
        SequencedCollection<String> sequencedCollection = LinkedHashSet.newLinkedHashSet(100);
        sequencedCollection.add("ciao");
        sequencedCollection.add("hola");
        sequencedCollection.add("ni hao");
        sequencedCollection.add("salut");
        sequencedCollection.add("hello");
        sequencedCollection.addFirst("ola"); //<1>
        Assertions.assertEquals(sequencedCollection.getFirst(), "ola"); // ②
    }
}