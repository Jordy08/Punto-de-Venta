/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package page;

import java.util.ArrayList;
import erpvistas.FormaPago;

/**
 *
 * @author jordi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Efectivo> efec = new ArrayList<Efectivo>();
    public static ArrayList<Sinpe> sin = new ArrayList<Sinpe>();
    public static ArrayList<Tarjeta> tar = new ArrayList<Tarjeta>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        FormaPago p = new FormaPago();
        p.setVisible(true);
    }
    
}
