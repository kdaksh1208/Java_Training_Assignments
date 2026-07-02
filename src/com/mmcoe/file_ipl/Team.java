package com.mmcoe.file_ipl;

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

        return players.values()
                .stream()
                .filter(p -> p.getName().equalsIgnoreCase(playerName))
                .findFirst()
                .orElse(null);

    }

    public void displayPlayers() {

        System.out.println("\nTeam : " + teamName);

        players.values()
                .stream()
                .forEach(System.out::println);

    }

}
