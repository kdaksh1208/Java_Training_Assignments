package com.mmcoe.file_ipl;

public interface TeamDao {

    void addTeam(Team team);

    Team searchTeam(String teamName);

    Player searchPlayer(String playerName);

    void displayTeam(String teamName);

}
