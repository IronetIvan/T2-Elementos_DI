/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.elementos_di;

import javax.swing.SwingUtilities;

/**
 *
 * @author irone
 */
public class Entrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ventana v = new Ventana();
                v.initGUI();
            }
        });
    }
}
