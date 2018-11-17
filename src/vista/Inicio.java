/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Josue Cuba
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //modelo
                    Login f = new Login();
                    //que aparezca maximizado
                    f.setLocationRelativeTo(null);
                    f.setVisible(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "BASE DE DATOS NO EXISTE");
                }
            }
        });

    }
}
