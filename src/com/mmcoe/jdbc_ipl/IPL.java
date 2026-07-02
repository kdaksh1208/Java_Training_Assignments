package com.mmcoe.jdbc_ipl;

public class IPL {

    private TeamDao dao;

    public IPL() {

        dao = new TeamDaoJdbcImpl();

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
