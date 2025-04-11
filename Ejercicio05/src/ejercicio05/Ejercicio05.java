/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author fabia
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria carlos = new CuentaBancaria(2000, "Carlos Ezequiel Jara", 00000001);
        
        carlos.depositarDinero(-200);
        carlos.depositarDinero(200);
        carlos.retirarDinero(2400);
        carlos.retirarDinero(2000);
        System.out.println("El saldo de la cuenta es de: " + carlos.getSaldo());
        
    }
    
}
