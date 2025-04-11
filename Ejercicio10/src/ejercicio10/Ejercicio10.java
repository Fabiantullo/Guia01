/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author fabia
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte hora = 23;
        byte minuto = 59;
        byte segundo = 50;
        Reloj unReloj = new Reloj(hora, minuto, segundo);
        
        byte contador = 0;
        while (contador < 20){
            unReloj.avanzarTiempo();
            unReloj.getTiempoActual();
            contador ++;
        }}
        
    
}
