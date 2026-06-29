package com.mmcoe.IPL_Assignment;

public class IPL {

    private Team[] teams;
    private int teamCount;

    public IPL() {
        teams = new Team[10];
        teamCount = 0;
    }


    public void addTeam(Team t) {
        if (teamCount >= teams.length) {
            System.out.println("IPL is full. Cannot add more teams.");
            return;
        }
        teams[teamCount++] = t;
    }


    public Team searchTeam(String tname) {
        for (int i = 0; i < teamCount; i++) {
            if (teams[i].getTname().equalsIgnoreCase(tname)) {
                return teams[i];
            }
        }
        return null;
    }

    
    public Object[] searchPlayer(String pname) {
        for (int i = 0; i < teamCount; i++) {
            Player p = teams[i].searchPlayer(pname);
            if (p != null) {
                return new Object[]{p, teams[i]};
            }
        }
        return null;
    }
}