/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author fabia
 * o Define una clase CuentaBancaria con atributos saldo, titular, y numeroDeCuenta.
o Implementa métodos para depositar y retirar dinero, asegurándote de que no se permita retirar
más de lo que hay en el saldo.
o Crea un método para consultar el saldo actual de la cuenta.
 */
public class CuentaBancaria {
    private double saldo;
    private String titular;
    private int numeroDeCuenta;

    public CuentaBancaria(double saldo, String titular, int numeroDeCuenta) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
    
    public void depositarDinero(double cantidadADepositar){
        if (cantidadADepositar > 0){
        this.saldo += cantidadADepositar;
            System.out.println("Se ha depositado la cantidad de: $" + cantidadADepositar);
        }
        else{
            System.out.println("La cantidad a depositar es invalida");}
    }
    
    public void retirarDinero(double cantidadARetirar){
        if (cantidadARetirar <= this.saldo){
            this.saldo -= cantidadARetirar;
            System.out.println("Se han retirado $" + cantidadARetirar+ " de tu cuenta.");
        }
        else{
            System.out.println("La cantidad a retirar se excede al saldo de la cuenta en: $"
            + (cantidadARetirar - this.saldo));
        }
    }
    
    
    
}
