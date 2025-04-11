/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author fabia
 * 
 * o Define una clase Círculo con un atributo radio de tipo double.
o Crea métodos para calcular el área y la circunferencia del círculo.
o Implementa un método para escalar el círculo, aumentando o disminuyendo su radio en un
porcentaje dado.
 */
public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    public double calcularCircunferencia(){
        return 2 * Math.PI * radio;
    }
    
    public void escalarCirculo(double porcentaje){
        this.radio += radio * (porcentaje / 100);
    }
}
