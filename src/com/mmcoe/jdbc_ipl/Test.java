package com.mmcoe.jdbc_ipl;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        IPL ipl = new IPL();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Team Name or Player Name : ");

        String input = sc.nextLine();

        Team team = ipl.searchTeam(input);

        if (team != null) {

            ipl.displayTeam(input);

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
