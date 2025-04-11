/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author fabia
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto unProducto = new Producto("Coca Cola", 1000, 20);
        System.out.println("El producto con descuento queda en: " + unProducto.aplicarDescuento(20));
        unProducto.realizarVenta(25);
        unProducto.realizarVenta(20);

                
        
    }
    
}
