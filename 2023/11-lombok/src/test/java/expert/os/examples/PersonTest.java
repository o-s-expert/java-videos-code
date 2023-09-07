package expert.os.examples;

import expert.os.examples.entity.Person;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class PersonTest {


    @Test
    public void shouldCreate() {
        Person person = Person.builder().id(1L)
                .name("John Doe")
                .email("otavio@test.com").build();

        SoftAssertions.assertSoftly(softAssertions -> {
            softAssertions.assertThat(person.getId()).isEqualTo(1L);
            softAssertions.assertThat(person.getName()).isEqualTo("John Doe");
            softAssertions.assertThat(person.getEmail()).isEqualTo("otavio@test.com");
        });
    }

}