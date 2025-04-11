/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author fabia
 * o Desarrolla una clase Persona con los atributos nombre, edad, y altura (en metros).
o Implementa un método esMayorDeEdad() que devuelva true si la persona es mayor de 18 años.
o Agrega un método para calcular el índice de masa corporal (IMC) de la persona, dado su peso.
 */
public class Persona {
    private String nombre;
    private int edad;
    private double altura;

    /**
     *
     * @param nombre
     * @param edad
     * @param altura
     */
    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @return
     */
    public double getAltura() {
        return altura;
    }

    /**
     *
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /**
     *
     * @return
     */
    public boolean esMayorDeEdad(){
    return this.edad >= 18;
    }
    
    /**
     *
     * @param peso
     * @return
     */
    public double calcularIMC(double peso){
    return peso / (Math.pow(altura, 2));
    }
    
    
    
    
}
