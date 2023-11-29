package expert.os.examples;

public class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public String payment() {
        //logic
        return "return";
    }
}
