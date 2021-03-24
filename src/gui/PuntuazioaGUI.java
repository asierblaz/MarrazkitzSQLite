/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Jokalaria;
import model.SQLiteKudeatu;

/**
 *
 * @author blazquez.asier
 */
public class PuntuazioaGUI extends javax.swing.JFrame {

    ArrayList<Jokalaria> players;

    DefaultTableModel modelo;

    /**
     * Creates new form PuntuazioaGUI
     */
    public PuntuazioaGUI() {
        initComponents();
        borrarButton.setVisible(false);
        modelo = new DefaultTableModel();
        modelo.addColumn("Posizioa");
        modelo.addColumn("Erabiltzaile Izena");
        modelo.addColumn("Puntuazioa");
        modelo.addColumn("Asmatutakoak");
        
        this.tabla.setModel(modelo);
        tabla.setEnabled(false);
        datuakKargatu();

    }

    public void borratu(){
      try {

            SQLiteKudeatu.jokalariaEzabatu((tabla.getValueAt(tabla.getSelectedRow(), 1).toString().toLowerCase()));

            JOptionPane.showMessageDialog(null, "Puntuaziotik ezabatu da", "Borratu", JOptionPane.INFORMATION_MESSAGE);
            datuakKargatu();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Aukeratu taulatik bat", "Errorea", JOptionPane.WARNING_MESSAGE);

        }
    }
   


    public void datuakKargatu() {

        
            players = SQLiteKudeatu.printToArray();

            Collections.sort(players);
      

        int numDatos = modelo.getRowCount();
        for (int i = 0; i < numDatos; i++) {   //para borrar la tabla y no se sobrecargue
            modelo.removeRow(0);
        }
        tabla.setVisible(true);

        
        Primerolabel.setText(players.get(0).getUsername().toUpperCase());
        segundoLabel.setText(players.get(1).getUsername().toUpperCase());
        tercerolabel.setText(players.get(2).getUsername().toUpperCase());

        String[] info = new String[4];
        int i = 0;
        for (Jokalaria j : players) {

            info[0] = i + 1 + "";
            info[1] = j.getUsername();
            info[2] = j.getPuntuazioa()+"";
            info[3] = j.getAsmatutakoak();
            modelo.addRow(info);
            i++;

        }
        System.out.println(players);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        segundoLabel = new javax.swing.JLabel();
        tercerolabel = new javax.swing.JLabel();
        Primerolabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        borrarButton = new javax.swing.JButton();
        adminButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Puntuazioa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 250, 60));

        tabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 790, 260));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/podio.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 440, 160));

        segundoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(segundoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        tercerolabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tercerolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        Primerolabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(Primerolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 520, -1, -1));

        borrarButton.setText("Ezabatu");
        borrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(borrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, -1, -1));

        adminButton.setText("Administrazioa");
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });
        getContentPane().add(adminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarButtonActionPerformed
       borratu();

    }//GEN-LAST:event_borrarButtonActionPerformed

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        tabla.setEnabled(true);
        borrarButton.setVisible(true);
        adminButton.setVisible(false);
    }//GEN-LAST:event_adminButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PuntuazioaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuntuazioaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuntuazioaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuntuazioaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuntuazioaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Primerolabel;
    private javax.swing.JButton adminButton;
    private javax.swing.JButton borrarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel segundoLabel;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel tercerolabel;
    // End of variables declaration//GEN-END:variables
}
