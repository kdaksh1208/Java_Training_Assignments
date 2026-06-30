package com.mmcoe.new_ipl_assignment;

import java.util.HashMap;
import java.util.Map;

public class Team {

    private String teamName;

    private Map<String, Player> players;

    public Team(String teamName) {

        this.teamName = teamName;
        players = new HashMap<>();

    }

    public String getTeamName() {
        return teamName;
    }

    public void addPlayer(Player p) {

        players.put(p.getName(), p);

    }

    public Player searchPlayer(String playerName) {

        return players.get(playerName);

    }

    public void displayPlayers() {

        System.out.println("\nTeam : " + teamName);

        for (Player p : players.values()) {

            System.out.println(p);

        }

    }

}
