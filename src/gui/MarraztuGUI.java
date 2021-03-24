package gui;

import predet.Dibujar;
import model.Marrazkia;
import gui.MainGUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;
import javax.swing.JSlider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author blazg
 */
public class MarraztuGUI extends javax.swing.JFrame {

    private Dibujar lienzo;
    JFrame frame = new JFrame("Lienzo");

    /**
     * Creates new form GUIPRUEBA
     */
    public MarraztuGUI() {
        initComponents();
        verLienzo();
        this.setLocation(600, 50);

    }

    public void verLienzo() {

        Container content = frame.getContentPane();
        content.setLayout(new BorderLayout());
        lienzo = new Dibujar();
        content.add(lienzo, BorderLayout.CENTER);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        GordeButton = new javax.swing.JButton();
        anchoButton = new javax.swing.JButton();
        colorButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        borragomaButton = new javax.swing.JButton();
        botePinturaButton = new javax.swing.JButton();
        pintzelaButton = new javax.swing.JButton();
        unoButton = new javax.swing.JButton();
        tresButton = new javax.swing.JButton();
        dosButton = new javax.swing.JButton();
        cuatroButton = new javax.swing.JButton();
        lapizButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Herramientas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label1.setText("Marrazteko Tresnak");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 160, 60));

        GordeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gorde.png"))); // NOI18N
        GordeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GordeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(GordeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 70, 70));

        anchoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/loditasuna.png"))); // NOI18N
        anchoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anchoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(anchoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 70, 70));

        colorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/kolorea.png"))); // NOI18N
        colorButton.setToolTipText("");
        colorButton.setContentAreaFilled(false);
        colorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButtonActionPerformed(evt);
            }
        });
        getContentPane().add(colorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 60, 70));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/borratuGuztia.png"))); // NOI18N
        jButton1.setActionCommand("Borratu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 70, 70));

        borragomaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/borragoma.png"))); // NOI18N
        borragomaButton.setMaximumSize(new java.awt.Dimension(66, 23));
        borragomaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borragomaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(borragomaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 70, 70));

        botePinturaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/botePintura.png"))); // NOI18N
        botePinturaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botePinturaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(botePinturaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 70, 70));

        pintzelaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pintzela.png"))); // NOI18N
        pintzelaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pintzelaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pintzelaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 70, 70));

        unoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/1.png"))); // NOI18N
        unoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(unoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 70, 70));

        tresButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/3.png"))); // NOI18N
        tresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresButtonActionPerformed(evt);
            }
        });
        getContentPane().add(tresButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 70, 70));

        dosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/2.png"))); // NOI18N
        dosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosButtonActionPerformed(evt);
            }
        });
        getContentPane().add(dosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 70, 70));

        cuatroButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/4.png"))); // NOI18N
        cuatroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cuatroButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 70, 70));

        lapizButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lapiz.png"))); // NOI18N
        lapizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapizButtonActionPerformed(evt);
            }
        });
        getContentPane().add(lapizButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 70, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GordeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GordeButtonActionPerformed
        // TODO add your handling code here:

        int input = showConfirmDialog(null, " Marrazkia Gorde nahi duzu");

        if (input == 0) {
            try {
                String izena = JOptionPane.showInputDialog("Zer da marraztu duzuna?:");
                String imagen = JOptionPane.showInputDialog("Zein izena jarriko diozu?:");
                
                Marrazkia m = new Marrazkia(1, izena, imagen);
                System.out.println(m);
                lienzo.save(m);
                MainGUI.marrazkiak.add(m);
                MainGUI.gorde(MainGUI.marrazkiak);
                System.out.println(MainGUI.marrazkiak);
                JOptionPane.showMessageDialog(null, "Marrazkia Gorde da", "Informazioa", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                frame.dispose();
            } catch (IOException ex) {
                Logger.getLogger(MarraztuGUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_GordeButtonActionPerformed

    private void anchoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anchoButtonActionPerformed
        // TODO add your handling code here:
        String ancho = JOptionPane.showInputDialog("Sartu pintzelaren loditasuna:");
        try {
            if (ancho != "" || ancho != null) {
                lienzo.anchura(Integer.parseInt(ancho));
            }

        } catch (Exception e) {

        }


    }//GEN-LAST:event_anchoButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        lienzo.clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void borragomaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borragomaButtonActionPerformed
        // TODO add your handling code here:
        lienzo.anchura(15);
        lienzo.borragoma();
    }//GEN-LAST:event_borragomaButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //cuando se cierra la ventana

        frame.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void colorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButtonActionPerformed
        // TODO add your handling code here:

        Color c = JColorChooser.showDialog(rootPane, "Aukeratu Kolorea", Color.black);

        lienzo.koloreaAldatu(c);
    }//GEN-LAST:event_colorButtonActionPerformed

    private void botePinturaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botePinturaButtonActionPerformed
        // TODO add your handling code here:

        lienzo.anchura(800);
    }//GEN-LAST:event_botePinturaButtonActionPerformed

    private void pintzelaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pintzelaButtonActionPerformed
        // TODO add your handling code here:
        lienzo.koloreaAldatu(Color.black);


    }//GEN-LAST:event_pintzelaButtonActionPerformed

    private void unoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoButtonActionPerformed
        // TODO add your handling code here:
        lienzo.anchura(80);

    }//GEN-LAST:event_unoButtonActionPerformed

    private void cuatroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroButtonActionPerformed
        // TODO add your handling code here:
        lienzo.anchura(5);

    }//GEN-LAST:event_cuatroButtonActionPerformed

    private void dosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosButtonActionPerformed
        // TODO add your handling code here:
        lienzo.anchura(35);

    }//GEN-LAST:event_dosButtonActionPerformed

    private void tresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresButtonActionPerformed
        lienzo.anchura(15);
    }//GEN-LAST:event_tresButtonActionPerformed

    private void lapizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapizButtonActionPerformed
        // TODO add your handling code here:
        lienzo.anchura(1);
        

    }//GEN-LAST:event_lapizButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MarraztuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarraztuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarraztuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarraztuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarraztuGUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GordeButton;
    private javax.swing.JButton anchoButton;
    private javax.swing.JButton borragomaButton;
    private javax.swing.JButton botePinturaButton;
    private javax.swing.JButton colorButton;
    private javax.swing.JButton cuatroButton;
    private javax.swing.JButton dosButton;
    private javax.swing.JButton jButton1;
    private java.awt.Label label1;
    private javax.swing.JButton lapizButton;
    private javax.swing.JButton pintzelaButton;
    private javax.swing.JButton tresButton;
    private javax.swing.JButton unoButton;
    // End of variables declaration//GEN-END:variables
}
