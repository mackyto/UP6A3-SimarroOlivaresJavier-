/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * Clase CarruselInfantil (hereda de Atraccion, implementa Mantenible):
 * 
 *      Atributos adicionales: edadMaxima, numeroFiguras
 *      Método específico: activarMusicaInfantil()
 * 
 * @author javsimoli
 */

public class CarruselInfantil extends Atraccion implements Mantenible {
    
    private int edadMaxima, numeroFiguras;
    private final double PRECIO = 2.50;
    
    /**
     * Constructor  CarruselInfantil con todoslos párametros.
     * @param edadMaxima edad máxima orientativa de visitantes a la atracción. 
     * @param numeroFiguras numero de Figuras de la atracción.
     */
    public CarruselInfantil (int edadMaxima,int numeroFiguras, String nombre, int capacidadMaxima,int tiempoRecorrido,int nivelAdrenalina) throws ErrorDatos{
        
        super(nombre, capacidadMaxima, tiempoRecorrido, nivelAdrenalina);
        
        if(super.enteroPositivo(edadMaxima))
            this.edadMaxima = edadMaxima;

        if(super.enteroPositivo(numeroFiguras))
            this.numeroFiguras = numeroFiguras;

    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public int getNumeroFiguras() {
        return numeroFiguras;
    }

    public void setNumeroFiguras(int numeroFiguras) {
        this.numeroFiguras = numeroFiguras;
    }    
    
    @Override
    public double calculaPrecio(){
        return this.PRECIO;
    }

    @Override
    public void realizarMantenimiento(){
        
    }
    
}
