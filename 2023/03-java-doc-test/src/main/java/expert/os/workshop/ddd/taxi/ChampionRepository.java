package expert.os.workshop.ddd.taxi;

public interface ChampionRepository {
    boolean existByName(String name);

    void save(Team team);
}
