package model;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class Marrazkia implements Serializable{
    private int id;
    private String izena;
    private String imagen; //        prueba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img1.jpg")));  argazkia imprimatzeko
     private String argazkiIzena; // argazkia gero gordetzeko
    
    public Marrazkia(int id, String izena, String imagen) {
        this.id = id;
        this.izena = izena.toLowerCase();
        this.argazkiIzena= imagen.toLowerCase();
        this.imagen = "/img/"+imagen.toLowerCase()+".png";
         //this.imagen = "/img/"+imagen.toLowerCase()+".png";

    }

    public int getId() {
        return id;
    }

    public String getIzena() {
        return izena;
    }

    public String getArgazkiIzena() {
        return argazkiIzena;
    }

    public int getLetraZenbakia() {
        
       
        return  izena.length();
    }

    public String getImagen() {
        return imagen;
    }

    @Override
    public String toString() {
        return "Marrazkia{" + "id=" + id + ", izena=" + izena + ", imagen=" + imagen + ", argazkiIzena=" + argazkiIzena + '}';
    }
    
    
    
    
    
    
    
    
}
