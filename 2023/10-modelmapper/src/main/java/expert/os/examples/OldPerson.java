package expert.os.examples;

import java.time.LocalDate;
import java.util.Objects;

public class OldPerson {

    private final String name;

    private final LocalDate birthday;

    private final String city;

    public OldPerson(String name, LocalDate birthday, String city) {
        this.name = name;
        this.birthday = birthday;
        this.city = city;
    }


    public String name() {
        return name;
    }

    public LocalDate birthday() {
        return birthday;
    }

    public String city() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OldPerson person = (OldPerson) o;
        return Objects.equals(name, person.name)
                && Objects.equals(birthday, person.birthday)
                && Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday, city);
    }

    @Override
    public String toString() {
        return "OldPerson{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", city='" + city + '\'' +
                '}';
    }
}
