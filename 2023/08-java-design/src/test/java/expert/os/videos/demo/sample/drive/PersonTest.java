package expert.os.videos.demo.sample.drive;

import expert.os.videos.demo.sample.drive.DriverLicense;
import expert.os.videos.demo.sample.drive.Person;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class PersonTest {

    private Person person;

    @Test
    @Disabled
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
