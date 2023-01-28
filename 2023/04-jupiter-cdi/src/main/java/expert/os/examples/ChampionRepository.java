package expert.os.examples;

public interface ChampionRepository {
    boolean existByName(String name);

    void save(Team team);
}
