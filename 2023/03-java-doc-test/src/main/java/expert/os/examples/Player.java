package expert.os.examples;

import java.util.Objects;

/**
 * A unit of soccer.
 * @see Player#of(String, String, int)
 * @author otaviojava
 */
public class Player {

    private String name;

    private String city;

    private int score;

    private Player(String name, String city, int score) {
        this.name = name;
        this.city = city;
        this.score = score;
    }

    public String name() {
        return name;
    }

    public String city() {
        return city;
    }

    public int score() {
        return score;
    }

    /**
     * When the player does a goal, it increases the score and return the result
     * @return the score with the new goal.
     * @since 0.0.2
     */
    public int goal() {
        score++;
        return score;
    }

    /**
     * Creates a player, but without team
     * @param name the player's name, put the full name
     * @param city the city where the player was born
     * @param score the score
     * @return a new instance of Player;
     * @throws NullPointerException when name or city are null
     * @throws IllegalArgumentException when the score is negative
     */
    public static Player of(String name, String city, int score) {
        Objects.requireNonNull(name, "name is required");
        Objects.requireNonNull(city, "city is required");

        if(score < 0) {
            throw new IllegalStateException("A player cannot have negative score");
        }
        return new Player(name, city, score);
    }
}
