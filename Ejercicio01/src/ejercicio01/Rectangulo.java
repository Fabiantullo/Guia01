/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * Clase Rectángulo:
o Crea una clase Rectángulo con atributos ancho y alto de tipo double.
o Implementa métodos para calcular el área y el perímetro del rectángulo.
o Escribe un método esCuadrado() que devuelva true si el rectángulo es un cuadrado, es decir, si
ancho y alto son iguales.
 */
public class Rectangulo {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }


    public double getAlto() {
        return alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public double calcularArea(){
    return this.ancho * this.alto;
    }
    
    public double calcularPerimetro(){
    return this.ancho * 2 + this.alto * 2;
            }
    
    public boolean esCuadrado(){
    return this.ancho == this.alto;
            }
        
}
