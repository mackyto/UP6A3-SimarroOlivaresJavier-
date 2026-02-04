
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Clase ZonaParque:
 *
 *      Atributos: nombre, listaAtracciones (ArrayList)
 *      Métodos: añadirAtraccion(), eliminarAtraccion(), obtenerAtracciones()
 * 
 * @author javsimoli
 */

public class ZonaParque {
    
    private String nombre;
    private List<Atraccion> listaAtracciones;
    
    /**
     * Constructor con el parametro lista de atracciones
     * @param nombre nombre de la zona del parque.
     * @param listaAtracciones 
     */
    public ZonaParque (String nombre, List<Atraccion> listaAtracciones) throws ErrorDatos {
        
        if (Atraccion.stringNoNulo(nombre, "Error el nombre de la zona del parque es un parametro nulo o vacío"))
            this.nombre = nombre;
        this.listaAtracciones = listaAtracciones;
        
    }
    
    /**
     * Constructor con solo el nombre e instancia una lista
     * @param nombre nombre de la zona del parque.
     */
    public ZonaParque (String nombre) throws ErrorDatos{
        
        if (Atraccion.stringNoNulo(nombre, "Error el nombre de la zona del parque es un parametro nulo o vacío"))
            this.nombre = nombre;
        this.listaAtracciones = new ArrayList<>();
        
    }

    /**
     * Getter nombre (String) de la zona parque.
     * @return nombre (String) de la zona parque.
     */
    public String getNombre() {
        return nombre;
    }

     /**
     * Setter nombre (String) de la zona parque.
     * @param nombre (String) de la zona parque.
     */
    public void setNombre(String nombre) throws ErrorDatos {
        if (Atraccion.stringNoNulo(nombre, "Error el nombre de la zona del parque es un parametro nulo o vacío"))
            this.nombre = nombre;
    }

    /**
     * Getter Listy<> extrae la lista
     * @return listaAtracciones 
     */
    public List<Atraccion> getListaAtracciones() {
        return listaAtracciones;
    }

    /**
     * Setter listaAtracciones
     * @param listaAtracciones ArrrayList<> 
     */
    public void setListaAtracciones(List<Atraccion> listaAtracciones) {
        this.listaAtracciones = listaAtracciones;
    }
    
    
    
    
    
    /**
     * Añadir un objeto de la clase Atraccion a la lista de objetos
     * @param atraccion Objreto clase Atraccion.
     */
    public void añadirAtraccion(Atraccion atraccion){
        
        this.listaAtracciones.add(atraccion);
        
    }
    
    /**
     * Elimina una atracción de la lista con objeto Atraccion
     * @param atraccion bjeto clase Atraccion
     * @throws ErrorDatos Reenvio de excepcion con mensaje personalizado
     */
    public void eliminarAtraccion(Atraccion atraccion) throws ErrorDatos {
        
        for (Atraccion puntero: this.listaAtracciones){
            if (puntero == atraccion){
                this.listaAtracciones.remove(atraccion);
            }else{
                throw new ErrorDatos("El objeto no esta en la lista");
            }

        }
        
    }
            
    /**
     * Obten una atraccion de la lista con el nombre solicitado.
     * @param nombre nombre (String) de la atraccion solicitada.
     * @return un objeto de la clase Atraccion.
     * @throws ErrorDatos Reenvio de excepcion con mensaje personalizado
     */        
    public Atraccion obtenerAtracciones(String nombre) throws ErrorDatos {
        
        for (Atraccion puntero: this.listaAtracciones){
            if ( puntero.getNombre() == nombre){
                return puntero;
            }else{
                throw new ErrorDatos("El objeto no esta en la lista");
            }

        }
        
        return null;
        
    }        



}
