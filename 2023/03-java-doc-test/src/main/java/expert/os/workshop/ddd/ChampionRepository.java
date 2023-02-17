package expert.os.workshop.ddd;

public interface ChampionRepository {
    boolean existByName(String name);

    void save(Team team);
}
