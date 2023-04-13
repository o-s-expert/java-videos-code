package expert.os.videos.demo;

import java.util.Optional;

public class Person {

    private String name;

    private String city;

    private DriverLicense license;


    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Optional<DriverLicense> getLicense() {
        return Optional.ofNullable(license);
    }
}
