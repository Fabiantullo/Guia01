/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author fabia
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Termometro unTermometro = new Termometro(20);
        
        System.out.println("La temperatura en farenheit seria de: " + unTermometro.convertirCelsiusAFarenheit());
        System.out.println("La temperatura en celsius seria de: " + unTermometro.convertirFahrenheitACelsius());
        unTermometro.aumentarTemperatura(20);
        System.out.println(unTermometro.getTemperatura());
        unTermometro.disminuirTemperatura(20);
        System.out.println(unTermometro.getTemperatura());
    }
    
}
