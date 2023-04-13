package expert.os.videos.demo;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class PersonTest {

    private Person person;

    @Test
    public void shouldReturnDriverLicense() {
        Optional<DriverLicense> license = person.getLicense();
        license.ifPresent(d -> System.out.println("my license : " + d));
        DriverLicense driver = license
                .orElseThrow(
                        () -> new RuntimeException("It should have a license for driver"))
        ;

        if(license != null) {
            //
        }
        if(license.isPresent()) {
            //
        }
    }
}
