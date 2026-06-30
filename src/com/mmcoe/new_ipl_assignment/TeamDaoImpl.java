package com.mmcoe.new_ipl_assignment;

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

        return teams.get(teamName);

    }

    @Override
    public Player searchPlayer(String playerName) {

        for (Team t : teams.values()) {

            Player p = t.searchPlayer(playerName);

            if (p != null)
                return p;

        }

        return null;

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