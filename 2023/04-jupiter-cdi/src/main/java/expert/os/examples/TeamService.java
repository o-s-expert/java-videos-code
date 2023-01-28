package expert.os.examples;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TeamService {

    @Inject
    private TeamRepository repository;
}
