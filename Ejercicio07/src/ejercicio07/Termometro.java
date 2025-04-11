/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author fabia
 * o Crea una clase Termómetro con un atributo temperatura de tipo double.
o Escribe métodos para convertir la temperatura de grados Celsius a Fahrenheit y viceversa.
o Implementa un método que permita aumentar o disminuir la temperatura en un valor dado.
 */
public class Termometro {
    private double temperatura;

    public Termometro(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    
    public double convertirCelsiusAFarenheit(){
        return this.temperatura * 1.8 + 32;
    }
    public double convertirFahrenheitACelsius(){
        return (this.temperatura - 32) / 1.8;
    }
    
    public void aumentarTemperatura(double cantidad){
    if (cantidad > 0){
        this.temperatura += cantidad;}
    else{
        System.out.println("Error, numero no valido");}}
    
    public void disminuirTemperatura(double cantidad){
    if (cantidad > 0){
        this.temperatura -= cantidad;
    }
    else{System.out.println("Error, numero no valido");}
    }
    
}
