package com.mmcoe.new_ipl_assignment;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        IPL ipl = new IPL();

        Team mi = new Team("MI");

        mi.addPlayer(new Player("Rohit",1800000000L));
        mi.addPlayer(new Player("Hardik",1600000000L));
        mi.addPlayer(new Player("Bumrah",1700000000L));

        Team csk = new Team("CSK");

        csk.addPlayer(new Player("Dhoni",2000000000L));
        csk.addPlayer(new Player("Jadeja",1600000000L));
        csk.addPlayer(new Player("Ruturaj",1400000000L));

        Team rcb = new Team("RCB");

        rcb.addPlayer(new Player("Virat",2100000000L));
        rcb.addPlayer(new Player("Patidar",1100000000L));
        rcb.addPlayer(new Player("Hazlewood",1200000000L));

        ipl.addTeam(mi);
        ipl.addTeam(csk);
        ipl.addTeam(rcb);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Team Name or Player Name :");

        String input = sc.nextLine();

        Team team = ipl.searchTeam(input);

        if(team!=null){

            team.displayPlayers();

        }

        else{

            Player p = ipl.searchPlayer(input);

            if(p!=null){

                System.out.println(p);

            }

            else{

                System.out.println("No Team or Player Found");

            }

        }

        sc.close();

    }

}