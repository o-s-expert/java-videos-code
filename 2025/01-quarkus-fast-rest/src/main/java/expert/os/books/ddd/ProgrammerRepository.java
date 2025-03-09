package expert.os.books.ddd;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProgrammerRepository implements PanacheRepository<Programmer> {
}
