/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author fabia
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona carlos = new Persona("Carlos", 18, 1.85);
        System.out.println(carlos.getNombre() + " es mayor de 18 años? " + carlos.esMayorDeEdad());
        System.out.println("El Indice de Masa Corporal es de: " + carlos.calcularIMC(50));
    }
    
}
