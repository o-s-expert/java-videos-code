package com.osachitech.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Team {

    private String name;

    private List<Player> players;

    private Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    Team() {
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return Collections.unmodifiableList(players);
    }

    public void add(Player player) {
        this.players.add(Objects.requireNonNull(player, "player is required"));
    }

    public Map<Position, List<Player>> getPlayerGroupByPosition() {
        return players.stream()
                .collect(Collectors.groupingBy(Player::getPosition));
    }

    public IntSummaryStatistics getScoreSummary() {
        return this.players
                .stream()
                .mapToInt(Player::getScore)
                .summaryStatistics();
    }

    public static Team of(String name) {
        Objects.requireNonNull(name, "name is required");
        return new Team(name);
    }
}
