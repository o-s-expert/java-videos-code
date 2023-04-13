package expert.os.videos.demo;

public record Player(String name, String city, int score) implements Comparable<Player> {

    @Override
    public int compareTo(Player player) {
        return this.name.compareTo(player.name);
    }
}
