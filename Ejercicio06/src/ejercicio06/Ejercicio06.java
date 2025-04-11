/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author fabia
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro unLibro = new Libro("Como triunfar en la vida", "Un tonto", 500);
        unLibro.avanzarPaginas(501);
        unLibro.avanzarPaginas(500);
        System.out.println(unLibro.getPaginaActual());
        unLibro.retrocederPaginas(1000);
        unLibro.retrocederPaginas(100);
        System.out.println(unLibro.getPaginaActual());
        System.out.println("Terminaste el libro? " + unLibro.verificarSiTermino());
    }
    
}
