package com.gayabita.dominio;

import java.util.ArrayList;
import java.util.List;

public class Round {
    private float totalBet;
    private List<Player> players;

    public Round() {
        this.totalBet = 0;
        this.players = new ArrayList<>();
    }

    public float getTotalBet() {
        return totalBet;
    }

    public void setTotalBet(float totalBet) {
        this.totalBet = totalBet;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player players) {
        this.players.add(players);
    }
}
