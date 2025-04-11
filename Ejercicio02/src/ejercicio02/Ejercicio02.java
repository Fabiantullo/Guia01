/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author fabia
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Circulo circ = new Circulo(4);
        System.out.println("El area del circulo es: " + circ.calcularArea());
        System.out.println("La circunferencia del circulo es: " + circ.calcularCircunferencia());
        circ.escalarCirculo(-50);
        System.out.println("El nuevo radio del circulo es: " + circ.getRadio());
        
    }
    
}
