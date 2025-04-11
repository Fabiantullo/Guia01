/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author fabia
 */
public class Ejercicio09 {

    public static void main(String[] args) {
        // TODO code application logic here
        Pelota unaPelota = new Pelota("YPF", 5);
        Pelota otraPelota = new Pelota("Shell", 5);
        
        System.out.println("Verificando si las pelotas son iguales...");
        System.out.println(unaPelota.compararPelotas(otraPelota));
        unaPelota.inflarPelota(5);
        System.out.println("Verificando despues de inflar una de las pelotas..." );
        System.out.println(unaPelota.compararPelotas(otraPelota));
        System.out.println("Circunferencias de cada una: ");
        System.out.println(unaPelota.getCircunferencia());
        System.out.println(otraPelota.getCircunferencia());

    }
    
}
