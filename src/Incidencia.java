
import java.time.LocalDateTime;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Clase Incidencia:
 * 
 *      Atributos: id, descripcion, fechaHora, atraccionAfectada, estado
 *      Métodos: resolverIncidencia(), asignarTecnico(Empleado e)
 * 
 * @author javsimoli
 */

public class Incidencia {
    
    private int id;
    private String descripcion;
    private LocalDateTime fechaHora;
    private Atraccion atraccionAfectada;
    private String estado;
    private static int contador = 1000;
    
    /**
     * Constructor Incidencia 
     * @param descripcion
     * @param atraccionAfectada
     * @param estado
     * @throws ErrorDatos 
     */
    public Incidencia(String descripcion, Atraccion atraccionAfectada, String estado) throws ErrorDatos {
    
        this.id = contador++;
        
        if(Atraccion.stringNoNulo(descripcion, "Error descrpcion de la incidencia nula"))
            this.descripcion = descripcion;
    
        this.fechaHora = LocalDateTime.now(); 
        
        if(this.AtraccionNoNula(atraccionAfectada))
            this.atraccionAfectada = atraccionAfectada;
       
        if(Atraccion.stringNoNulo(estado, "Error valor de la varriable estado nula"))
            this.estado = estado;

    }
    
    /**
     * Prueba si el objeto de la clase Atraccion. 
     * @param a Objeto de la clase Atraccion.
     * @return true si el objeto n es nulo.
     * @throws ErrorDatos "enǘia mensaje personalizado.
     */
    public boolean AtraccionNoNula(Atraccion a) throws ErrorDatos {
        
        if (a == null){
            return true;
        }else{
            throw new ErrorDatos("Objeto Atracción nulo");
        } 
        
    } 
    
    
    public void resolverIncidencia(){
        System.out.println("");
    }
            
    public void asignarTecnico(Empleado e){
        
    }
    
    
    
}
