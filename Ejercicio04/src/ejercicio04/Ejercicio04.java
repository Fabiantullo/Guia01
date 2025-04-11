/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author fabia
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche unCoche = new Coche("Chevrolet", "Corsa 2009", 4500, 20);
        System.out.println("La autonomia del coche es de: " + unCoche.calcularAutonomia() + "km");
        unCoche.recargarCombustible(20);
        System.out.println("El combustible total es de: " + unCoche.getCombustibleRestante());
        
        
    }
    
}
