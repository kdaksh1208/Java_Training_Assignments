package com.mmcoe.jdbc_ipl;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private int teamId;
    private String teamName;
    private List<Player> players;

    public Team() {

        players = new ArrayList<>();

    }

    public Team(int teamId, String teamName) {

        this.teamId = teamId;
        this.teamName = teamName;
        players = new ArrayList<>();

    }

    public int getTeamId() {

        return teamId;

    }

    public String getTeamName() {

        return teamName;

    }

    public void addPlayer(Player p) {

        players.add(p);

    }

    public List<Player> getPlayers() {

        return players;

    }

}