package expert.os.examples;

public class ChampionshipService {

    private ChampionRepository repository;

    public void register(Team team) {
        if(repository.existByName(team.name())) {
            throw new IllegalArgumentException("The champion league has a team with this name");
        }
        this.repository.save(team);
    }
}
