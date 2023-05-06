/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package page;

/**
 *
 * @author jordi
 */
public class PagoFactory {
     public static Pago crearPago (TipoPago tipoPago) {
        return switch (tipoPago) {
            case Sinpe -> new Sinpe(); 
            case Efectivo -> new Efectivo();
            default -> new Tarjeta();
        };
    }
}
