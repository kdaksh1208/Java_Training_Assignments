package com.mmcoe.new_ipl_assignment;


public interface TeamDao {

    void addTeam(Team team);

    Team searchTeam(String teamName);

    Player searchPlayer(String playerName);

    void displayTeam(String teamName);

}
