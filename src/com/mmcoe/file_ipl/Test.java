package com.mmcoe.file_ipl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        IPL ipl = new IPL();

        try {

            BufferedReader br = new BufferedReader(
                    new FileReader("src/com/mmcoe/file_ipl/players.csv"));

            String line;

            while ((line = br.readLine()) != null) {

                String arr[] = line.split(",");

                String teamName = arr[0];
                String playerName = arr[1];
                long price = Long.parseLong(arr[2]);

                Team team = ipl.searchTeam(teamName);

                if (team == null) {

                    team = new Team(teamName);
                    ipl.addTeam(team);

                }

                team.addPlayer(new Player(playerName, price));

            }

            br.close();

        }

        catch (IOException e) {

            System.out.println(e);

        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Team Name or Player Name : ");

        String input = sc.nextLine();

        Team team = ipl.searchTeam(input);

        if (team != null) {

            team.displayPlayers();

        }

        else {

            Player p = ipl.searchPlayer(input);

            if (p != null)

                System.out.println(p);

            else

                System.out.println("No Team or Player Found");

        }

        sc.close();

    }

}