/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predet;

import gui.MainGUI;
import gui.PuntuazioaGUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import model.Jokalaria;

/**
 *
 * @author blazg
 */
public class Inicializar {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Jokalaria> jokalariak = new ArrayList<>();

        jokalariak.add(new Jokalaria("Asier", 520, "10"));
        jokalariak.add(new Jokalaria("Julen", 300, "8"));
        jokalariak.add(new Jokalaria("Ana", 0, "0"));
        jokalariak.add(new Jokalaria("Raul", 620, "16"));

        FileOutputStream fout = new FileOutputStream("src/resources/puntuazioa.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(jokalariak);
        out.close();

        FileInputStream fin = new FileInputStream("src/resources/puntuazioa.txt");
        ObjectInputStream ois = new ObjectInputStream(fin);
        ArrayList<Jokalaria> jokalariak2 = (ArrayList<Jokalaria>) ois.readObject();

        System.out.println(jokalariak2);
        System.out.println("ordenado");

        System.out.println(jokalariak2);
        
        
       /* 
        ArrayList<Marrazkia> marrazkiak = new ArrayList<>();
              int id = 0;
              
              
        
         marrazkiak.add(new Marrazkia(id++, "etxea", "etxea"));
              marrazkiak.add(new Marrazkia(id++, "JAPON", "JAPON"));
              marrazkiak.add(new Marrazkia(id++, "arraina", "arraina"));
              marrazkiak.add(new Marrazkia(id++, "azterketa", "azterketa"));
              marrazkiak.add(new Marrazkia(id++, "facebook", "facebook"));
              
         jokalariak.add(new Jokalaria("Asier", 520, "10"));
        jokalariak.add(new Jokalaria("Julen", 300, "8"));
        jokalariak.add(new Jokalaria("Ana", 0, "0"));
        jokalariak.add(new Jokalaria("Raul", 620, "16"));
        
        
        PuntuazioaGUI.gorde(jokalariak);
        
           MainGUI.gorde(marrazkiak);*/

    }
}
