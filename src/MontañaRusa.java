/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Clase MontanaRusa (hereda de Atraccion, implementa Mantenible):
 *
 *      Atributos adicionales: alturaMaxima, longitudRecorrido
 *      Método sobrecargado: calcularPrecio() y calcularPrecio(boolean temporadaAlta)
 * 
 * @author javsimoli
 */

public class MontañaRusa extends Atraccion implements Mantenible {
    
    private double alturaMaxima, longitudRecorrido;
    private final double PRECIO = 4.00; // Precio en euros de 
    
    /**
     * Contructor MontañaRusa 
     * @param alturaMaxima altura máxima permitda.
     * @param longitudRecorrido longitud en metros
     * @param nombre Parametro de superclase nombre de la atraccion.
     * @param capacidadMaxima Parametro de superclase capacidadMaxima
     * @param tiempoRecorrido Parametro de superclase tiempoRecorrido
     * @param nivelAdrenalina Parametro de superclase nivelAdrenalina
     * @throws ErrorDatos 
     */
    public MontañaRusa (double alturaMaxima, double longitudRecorrido, String nombre, int capacidadMaxima,int tiempoRecorrido,int nivelAdrenalina) throws ErrorDatos{
    
        super(nombre, capacidadMaxima, tiempoRecorrido, nivelAdrenalina);
            
        if (super.enteroPositivo(alturaMaxima))
            this.alturaMaxima = alturaMaxima;
        if(super.enteroPositivo(longitudRecorrido))
            this.longitudRecorrido = longitudRecorrido;
        
    }    
    
    public double calculaPrecio(){
        return this.PRECIO;
    }

    public void realizarMantenimiento(){
    
    }
    
        
        
}
