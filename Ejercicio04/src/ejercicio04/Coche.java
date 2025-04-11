/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author fabia
 * o Crea una clase Coche con atributos marca, modelo, kilometraje, y combustibleRestante (en
litros).
o Escribe un método para calcular cuántos kilómetros puede recorrer el coche con el
combustible restante, considerando un consumo fijo de combustible por kilómetro.
o Implementa un método para "recargar" el combustible del coche.
 */
public class Coche {
    
    private String marca;
    private String modelo;
    private double kilometraje;
    private double combustibleRestante;
    
    /**
     * 
     * @param marca
     * @param modelo
     * @param kilometraje
     * @param combustibleRestante 
     */
    
    
    public Coche(String marca, String modelo, double kilometraje, double combustibleRestante) {
        
        
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.combustibleRestante = combustibleRestante;
        
    }

    /**
     *
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     *
     * @return
     */
    public double getKilometraje() {
        return kilometraje;
    }

    /**
     *
     * @param kilometraje
     */
    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     *
     * @return
     */
    public double getCombustibleRestante() {
        return combustibleRestante;
    }

    /**
     *
     * @param combustibleRestante
     */
    public void setCombustibleRestante(double combustibleRestante) {
        this.combustibleRestante = combustibleRestante;
    }
    
    /**
     *
     * @return
     */
    public double calcularAutonomia(){
    return this.combustibleRestante / 0.10;
    }
    
    /**
     *
     * @param cantidad
     */
    public void recargarCombustible(double cantidad){
        this.combustibleRestante += cantidad;
    }
    
}
