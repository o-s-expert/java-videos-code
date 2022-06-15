package com.osachitech.examples;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.javamoney.moneta.Money;
import org.javamoney.moneta.function.MonetarySummaryStatistics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;

class TeamTest {

    @Test
    public void shouldCreateTeam() {
        Team team = Team.of("Mario Soccer");
        Player mario = Player.builder().name("Mario")
                .position(Position.ATTACKER).build();
        team.add(mario);

        team.add(Player.builder().name("Mario")
                .position(Position.DEFENDER).build());

        Map<Position, List<Player>> byPosition = team.getPlayerGroupByPosition();
        Assertions.assertNotNull(byPosition);
        List<Player> players = byPosition.get(Position.ATTACKER);
        MatcherAssert.assertThat(players, Matchers.contains(mario));
    }

    @Test
    public void shouldCreateSummary() {
        Team team = Team.of("Mario Soccer");
        Player mario = Player.builder().name("Mario")
                .position(Position.ATTACKER).score(2).build();
        team.add(mario);

        team.add(Player.builder().name("Luigi")
                .position(Position.DEFENDER).score(1).build());

        IntSummaryStatistics summary = team.getScoreSummary();
        Assertions.assertEquals(3, summary.getSum());
    }

    @Test
    public void shouldCreatePlayerSummary() {
        CurrencyUnit currency = Monetary.getCurrency("USD");

        Team team = Team.of("Mario Soccer");
        Player mario = Player.builder().name("Mario")
                .position(Position.ATTACKER).score(2)
                .salary(Money.of(10, currency)).build();
        team.add(mario);

        team.add(Player.builder().name("Luigi")
                .position(Position.DEFENDER).score(1).salary(Money.of(10, currency)).build());

        PlayerSummary summary = team.getSummary();
        Assertions.assertNotNull(summary);
        Map<Position, List<Player>> positions = summary.getPositions();
        MonetarySummaryStatistics salary = summary.getSalary();
        IntSummaryStatistics goals = summary.getGoals();
    }
}