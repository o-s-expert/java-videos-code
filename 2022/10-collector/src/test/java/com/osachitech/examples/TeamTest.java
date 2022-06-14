package com.osachitech.examples;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}