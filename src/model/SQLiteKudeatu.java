package model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author blazquez.asier
 */
public class SQLiteKudeatu {

    private static String url = "jdbc:sqlite:db/puntuazioa.db";

    private static Connection connect() {
        // SQLite connection string
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static String jokalariakImprimatu() {
        String sql = "SELECT * FROM Jokalariak";
        String s = "";
        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {

                s = s + rs.getString("username") + "\t"
                        + rs.getInt("puntuazioa") + "\t"
                        + rs.getString("asmatutakoak") + "\n";
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return s;
    }

    public static void jokalariaGehitu(Jokalaria j) {

        String username = j.getUsername();
        int puntuazioa = j.getPuntuazioa();
        String asmatutakoak = j.getAsmatutakoak();
        String sql = "INSERT INTO Jokalariak(username,puntuazioa,asmatutakoak) VALUES(?,?,?)";

        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setInt(2, puntuazioa);
            pstmt.setString(3, asmatutakoak);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    
    
    
    public static ArrayList<Jokalaria> printToArray() {
        String sql = "SELECT * FROM Jokalariak";
        ArrayList<Jokalaria> jokalariak = new ArrayList<>();
        String s = "";
        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                jokalariak.add(new Jokalaria(rs.getString("username").toUpperCase(), rs.getInt("puntuazioa"), rs.getString("asmatutakoak").toUpperCase()));
                
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return jokalariak;
    }
    
    
        public static void terminoaEzabatu(String nombre) {
        String sql = "DELETE FROM Jokalariak WHERE username = ?";

        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setString(1, nombre);
            // execute the delete statement
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
