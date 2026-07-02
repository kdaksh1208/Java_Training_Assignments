package com.mmcoe.jdbc_ipl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeamDaoJdbcImpl implements TeamDao {

    @Override
    public Team searchTeam(String teamName) {

        String sql = """
                SELECT t.team_id,
                       t.team_name,
                       p.player_name,
                       p.price
                FROM team t
                JOIN player p
                ON t.team_id=p.team_id
                WHERE t.team_name=?
                """;

        try {

            Connection conn = JdbcFactory.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, teamName);

            ResultSet rs = ps.executeQuery();

            Team team = null;

            while (rs.next()) {

                if (team == null)

                    team = new Team(
                            rs.getInt("team_id"),
                            rs.getString("team_name"));

                team.addPlayer(new Player(
                        rs.getString("player_name"),
                        rs.getLong("price")));

            }

            return team;

        }

        catch (SQLException e) {

            e.printStackTrace();

        }

        return null;

    }

    @Override
    public Player searchPlayer(String playerName) {

        String sql = """
                SELECT player_name,
                       price
                FROM player
                WHERE player_name=?
                """;

        try {

            Connection conn = JdbcFactory.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, playerName);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                return new Player(
                        rs.getString("player_name"),
                        rs.getLong("price"));

            }

        }

        catch (SQLException e) {

            e.printStackTrace();

        }

        return null;

    }

    @Override
    public void displayTeam(String teamName) {

        Team team = searchTeam(teamName);

        if (team == null) {

            System.out.println("Team Not Found");

            return;

        }

        System.out.println("\nTeam : " + team.getTeamName());

        for (Player p : team.getPlayers()) {

            System.out.println(p);

        }

    }

}