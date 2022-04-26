/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.daddo.agenda;

import com.formdev.flatlaf.FlatDarkLaf;
import it.daddo.agenda.gui.login.LoginFrame;
import javax.swing.UIManager;

/**
 *
 * @author Anna
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("");
        FlatDarkLaf.installLafInfo();

        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
}
