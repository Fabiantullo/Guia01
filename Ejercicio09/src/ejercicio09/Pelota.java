/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author fabia
 * o Define una clase Pelota con atributos marca y circunferencia.
o Implementa un método para comparar si dos pelotas tienen la misma circunferencia.
o Crea un método que permita inflar la pelota, aumentando su circunferencia en un valor dado.
 */
public class Pelota {
    private String marca;
    private double circunferencia;

    public Pelota(String marca, double circunferencia) {
        this.marca = marca;
        this.circunferencia = circunferencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }
    
    public boolean compararPelotas(Pelota otraPelota){
        return this.circunferencia == otraPelota.getCircunferencia();
        
    }
    
    public void inflarPelota(double cantidad){
    if (cantidad > 0){
        this.circunferencia += cantidad;
    }}
    
}
