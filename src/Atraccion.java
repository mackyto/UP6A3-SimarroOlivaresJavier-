/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Clase abstracta Atraccion:
 * 
 *      Atributos: nombre, capacidadMaxima, tiempoRecorrido, nivelAdrenalina
 *      Métodos abstractos: calcularPrecio(), realizarMantenimiento()
 *      Métodos concretos: getters/setters, iniciarAtraccion(), detenerAtraccion()
 * 
 * @author javsimoli
 */

abstract public class Atraccion {

    private String nombre;
    private int capacidadMaxima, tiempoRecorrido, nivelAdrenalina;

    public abstract double calculaPrecio();

    public abstract void realizarMantenimiento();

    public void iniciarAtraccion();
        
    public void detenerAtraccion();
    
}
