package com.osachitech.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    @Test
    public void shouldAddPlayerTeam() {
        Team team = new Team();
        team.add(new Player("Bruno"));
        Assertions.assertThrows(UnsupportedOperationException.class,
                () -> team.getPlayers().clear());
        Assertions.assertFalse(team.getPlayers().isEmpty());
    }

}