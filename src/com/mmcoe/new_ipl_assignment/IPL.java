package com.mmcoe.new_ipl_assignment;


public class IPL {

    private TeamDao dao;

    public IPL() {

        dao = new TeamDaoImpl();

    }

    public void addTeam(Team team) {

        dao.addTeam(team);

    }

    public Team searchTeam(String name) {

        return dao.searchTeam(name);

    }

    public Player searchPlayer(String name) {

        return dao.searchPlayer(name);

    }

    public void displayTeam(String name) {

        dao.displayTeam(name);

    }

}
