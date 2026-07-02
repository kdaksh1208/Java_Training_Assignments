package com.mmcoe.file_ipl;

import java.util.HashMap;
import java.util.Map;

public class TeamDaoImpl implements TeamDao {

    private Map<String, Team> teams;

    public TeamDaoImpl() {

        teams = new HashMap<>();

    }

    @Override
    public void addTeam(Team team) {

        teams.put(team.getTeamName(), team);

    }

    @Override
    public Team searchTeam(String teamName) {

        return teams.values()
                .stream()
                .filter(t -> t.getTeamName().equalsIgnoreCase(teamName))
                .findFirst()
                .orElse(null);

    }

    @Override
    public Player searchPlayer(String playerName) {

        return teams.values()
                .stream()
                .map(team -> team.searchPlayer(playerName))
                .filter(p -> p != null)
                .findFirst()
                .orElse(null);

    }

    @Override
    public void displayTeam(String teamName) {

        Team t = searchTeam(teamName);

        if (t != null)
            t.displayPlayers();
        else
            System.out.println("Team Not Found.");

    }

}