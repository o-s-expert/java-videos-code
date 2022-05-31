package com.osachitech.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Team {

    private List<Player> players = new ArrayList<>();

    public void add(Player player) {
        Objects.requireNonNull(player, "player is required");
        this.players.add(player);
    }
    public List<Player> getPlayers() {
        return Collections.unmodifiableList(players);
    }

}
