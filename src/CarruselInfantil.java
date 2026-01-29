
import java.time.LocalDate;

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

    /**
     * Getter numeroFiguras
     * @return int
     */
    public int getNumeroFiguras() {
        return numeroFiguras;
    }
    
    /**
     * Setter numeroFiguras
     * @param numeroFiguras 
     */
    public void setNumeroFiguras(int numeroFiguras) {
        this.numeroFiguras = numeroFiguras;
    }    
    
    /**
     * Método Calcularprecio 
     * @return double en €
     */
    @Override
    public double calculaPrecio(){
        return this.PRECIO;
    }

    /**
     * Lanzamiento delmensaje de log 'Se ha realizado el mantenimiento, a la atracción this hoy.
     */
    @Override
    public void realizarMantenimiento(){
        System.out.printf("A la atracción %s se le ha realizado mantenimiento el dia %s\n\n", super.getNombre(), LocalDate.now());        
    }
    
    /**
     * 
     */
    @Override
    public void revisarSeguridad(){
        
    }
    /**
     * 
     * @param incidencia 
     */
    @Override
    public void registrarIncidencia(String incidencia){
        
    }
    
    /**
     * 
     * Inicia la reproducción del canal de musica infantil en la atracción y registra el log.
     * 
     */
    public void activarMusicaInfantil() {
        System.out.printf("Se ha iniciado el canal de musica infantil en la atrcción %s\n\n", super.getNombre());
    }
    
    
}
