package com.mmcoe.jdbc_ipl;

public interface TeamDao {

    Team searchTeam(String teamName);

    Player searchPlayer(String playerName);

    void displayTeam(String teamName);

}