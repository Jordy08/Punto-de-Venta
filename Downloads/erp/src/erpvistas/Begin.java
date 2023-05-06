/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package erpvistas;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author ucr
 */
public class Begin {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
//cnxocknzxocnz
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
//
//        FRMPOS pos = new FRMPOS();
//
//        pos.setBounds(0, 0, ((int) width), ((int) height));
//        pos.setVisible(true);
//        pos.setLocationRelativeTo(null);
        
        Login lo = new Login();
        lo.setVisible(true);
       
    }

}
