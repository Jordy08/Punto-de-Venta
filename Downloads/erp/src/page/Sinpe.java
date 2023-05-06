/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package page;

/**
 *
 * @author jordi
 */
public class Sinpe extends Pago{
    private double precio;
     private int cantidad;
     private int impuesto;
     private String name;
     private String cellphone;

    public Sinpe() {
    }

    public Sinpe(double precio, int cantidad, int impuesto, String name, String cellphone) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.impuesto = impuesto;
        this.name = name;
        this.cellphone = cellphone;
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

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cellphone
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone the cellphone to set
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
     
    
    
    public double montoTotal(){
      return (getPrecio()*getCantidad())+getImpuesto();
  }
}
