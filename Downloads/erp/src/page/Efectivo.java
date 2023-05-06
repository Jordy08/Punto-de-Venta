/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package page;

/**
 *
 * @author jordi
 */
public class Efectivo extends Pago{
    private double precio;
    private int cantidad;
    private int impuesto;

    public Efectivo() {
    }

    public Efectivo(double precio, int cantidad, int impuesto) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.impuesto = impuesto;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the impuesto
     */
    public int getImpuesto() {
        return impuesto;
    }

    /**
     * @param impuesto the impuesto to set
     */
    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }
    
    
  public double montoTotal(){
      return (precio*cantidad)+impuesto;
  } 
}
