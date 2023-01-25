package expert.os.examples;

import java.time.LocalDate;
import java.time.Month;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Person person = new Person("Otavio", LocalDate.of(1988,
                Month.JANUARY, 9), "Salvador");

        System.out.println("The person: " + person);
    }
}
