package expert.os.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    @Test
    public void shouldSpeakEnglish(){
        Person person = new Person("John");
        assertEquals("Hello, my name is John", person.speakEnglish());

    }
}