package com.osachitech.examples;

import org.javamoney.moneta.function.DefaultMonetarySummaryStatistics;
import org.javamoney.moneta.function.MonetarySummaryStatistics;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlayerSummary {

    private IntSummaryStatistics goals;

    private Map<Position, List<Player>> positions;

    private MonetarySummaryStatistics salary;

    public PlayerSummary(CurrencyUnit currency) {
        this.goals = new IntSummaryStatistics();
        this.positions = new EnumMap<>(Position.class);
        this.salary = DefaultMonetarySummaryStatistics.of(currency);
    }

    public void accept(Player player) {
        Objects.requireNonNull(player, "player is required");
        this.goals.accept(player.getScore());
        this.salary.accept(player.getSalary());
        List<Player> players = getPlayers(player);
        players.add(player);


    }

    public PlayerSummary combine(PlayerSummary summary) {
        Objects.requireNonNull(summary, "summary is required");
        this.goals.combine(summary.goals);
        this.salary.combine(summary.salary);
        this.positions = Stream.concat(this.positions.values().stream(),
                        summary.positions.values().stream())
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Player::getPosition));

        return this;
    }

    public IntSummaryStatistics getGoals() {
        return goals;
    }

    public Map<Position, List<Player>> getPositions() {
        return Collections.unmodifiableMap(positions);
    }

    public MonetarySummaryStatistics getSalary() {
        return salary;
    }

    private List<Player> getPlayers(Player player) {
        List<Player> players = this.positions.get(player.getPosition());
        if(players == null) {
            this.positions.put(player.getPosition(), new ArrayList<>());
            return this.positions.get(player.getPosition());
        }
        return players;
    }

    @Override
    public String toString() {
        return "PlayerSummary{" +
                "goals=" + goals +
                ", positions=" + positions +
                ", salary=" + salary +
                '}';
    }
}
