/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author fabia
 * o Desarrolla una clase Producto con atributos nombre, precio, y cantidadEnStock.
o Crea un método para aplicar un descuento al precio del producto.
o Implementa un método para realizar una venta, actualizando la cantidad en stock y verificando
que haya suficiente stock disponible.
 */
public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }
    
    public double aplicarDescuento(double porcentaje){
    return this.precio - porcentaje / 100 * precio;
    }
    
    public void realizarVenta(int cantidad){
    if (cantidad <= this.cantidadEnStock){
        this.cantidadEnStock -= cantidad;
        System.out.println("Venta realizada. Quedan " + this.cantidadEnStock + " productos en stock");
    }
    else{
        System.out.println("La cantidad ingresada excede la cantidad en stock.");}}
    
    
    
    
}
