package expert.os.videos.demo;

public interface ChampionRepository {
    boolean existByName(String name);

    void save(Team team);
}
