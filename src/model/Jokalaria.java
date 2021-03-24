/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author blazg
 */
public class Jokalaria implements Serializable, Comparable<Jokalaria> {

    private String username;
    private int puntuazioa;
    private String asmatutakoak;

    public Jokalaria(String username, int puntuazioa, String asmatutakoak) {
        this.username = username;
        this.puntuazioa = puntuazioa;
        this.asmatutakoak = asmatutakoak;
    }

    public String getUsername() {
        return username;
    }

    public int getPuntuazioa() {
        return puntuazioa;
    }

    public String getAsmatutakoak() {
        return asmatutakoak;
    }


    @Override
    public String toString() {
        return "Jokalaria{" + "username=" + username + ", puntuazioa=" + puntuazioa + ", asmatutakoak=" + asmatutakoak + '}';
    }

    @Override
    public int compareTo(Jokalaria o) {

        if (puntuazioa < o.getPuntuazioa()) {
            return 1;
        }
        if (puntuazioa > o.getPuntuazioa()) {
            return -1;
        }
        return 0;
    }
}
