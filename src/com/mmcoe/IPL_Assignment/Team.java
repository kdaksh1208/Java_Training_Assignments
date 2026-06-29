package com.mmcoe.IPL_Assignment;

public class Team {
	private String tname;
	private Player[] Players;
	private int count;
	
	
	public Team() {
		Players = new Player[15];
		count = 0;
	}


	public Team(String tname) {
		this.tname = tname;
		Players = new Player[15];
		count = 0;
	}
	
	public void setTname(String tname) {
        this.tname = tname;
    }
	
	public String getTname() {
        return tname;
    }
	
	public void addPlayer(Player p) {

        if (count >= Players.length) {
            System.out.println("Team is Full.");
            return;
        }

        Players[count++] = p;
    }
	
	public void displayPlayers() {

        System.out.println("\nTeam : " + tname);
        System.out.println("-------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + Players[i]);
        }
    }
	
	public Player searchPlayer(String pname) {

        for (int i = 0; i < count; i++) {

            if (Players[i].getName().equalsIgnoreCase(pname)) {
                return Players[i];
            }

        }

        return null;
    }
		
	
}
