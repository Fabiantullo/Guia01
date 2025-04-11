/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author fabia
 * o Diseña una clase Libro con atributos titulo, autor, numeroDePaginas, y paginaActual.
o Implementa métodos para avanzar y retroceder páginas.
o Crea un método que indique si el lector ha terminado de leer el libro.
 */
public class Libro  {
    
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaActual = 0;

    public Libro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getPaginaActual() {
        return paginaActual;
    }
    
    public void avanzarPaginas(int cantidad){
    if (this.paginaActual + cantidad <= this.numeroDePaginas && cantidad > 0){
        this.paginaActual += cantidad;}
    else{
        System.out.println("La cantidad de paginas a avanzar se pasa de la cantidad de paginas o se ingreso un numero no valido.");}}
    
    public void retrocederPaginas(int cantidad){
    if (this.paginaActual - cantidad > 0 && cantidad > 0){
        this.paginaActual -= cantidad;}
    else{
        System.out.println("Se ha ingresado una cantidad de paginas no valida.");}}
    
    public boolean verificarSiTermino(){
        return this.paginaActual == this.numeroDePaginas;
    }
    
    
}
