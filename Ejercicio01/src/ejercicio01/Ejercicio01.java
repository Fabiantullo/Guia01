/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;


public class Ejercicio01 {


    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo(3, 5);
        System.out.println("El area del rectangulo es: " + rect.calcularArea());
        System.out.println("El perimetro del rectangulo es: " + rect.calcularPerimetro());
        System.out.println("¿El rectangulo es un cuadrado? " + rect.esCuadrado());
       
    }
    
}
