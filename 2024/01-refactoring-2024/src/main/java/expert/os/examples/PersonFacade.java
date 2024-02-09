package expert.os.examples;

public class PersonFacade {

    private final PersonService service;

    public PersonFacade(PersonService service) {
        this.service = service;
    }

    public String payment() {
        return service.payment();
    }
}
