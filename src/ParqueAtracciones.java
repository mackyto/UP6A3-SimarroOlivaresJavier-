
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 *  Clase ParqueAtracciones:
 * 
 *      Atributos: nombre, listaZonas (ArrayList), listaEmpleados, listaVisitantes
 *      Métodos: abrirParque(), cerrarParque(), gestionarIncidencia()
 * 
 * @author javsimoli
 */

public class ParqueAtracciones {
    
    private String nombre;
    private List<ZonaParque> listaZonas;
    private List<Empleado> listaEmpleados;
    private List<Visitante> listaVisitantes;
    
    /**
     * Constructor solo nombre, las listas se inicializan en el constructor. 
     * @param nombre nombre del parque.
     * @throws ErrorDatos transmite mensaje personalizado.
     */
    public ParqueAtracciones (String nombre) throws ErrorDatos {
        
        if (Atraccion.stringNoNulo(nombre, "Error, el nombre del Parque es un campo nulo o vacío."))
            this.nombre = nombre;
        
        listaZonas = new ArrayList<>();
        listaEmpleados = new ArrayList<>();
        listaVisitantes = new ArrayList<>();
        
    }
    
    /**
     * Constructor con lista de objetos y nombre del parque.
     * @param nombre del parque.
     * @param listaZonas zonas del parque.
     * @param listaEmpleados empleados del parque.
     * @param listaVisitantes visitantes diarios del parque.
     * @throws ErrorDatos 
     */
    public ParqueAtracciones (String nombre, List<ZonaParque> listaZonas, List<Empleado> listaEmpleados, List<Visitante> listaVisitantes) throws ErrorDatos {
        
        if (Atraccion.stringNoNulo(nombre, "Error, el nombre del Parque es un campo nulo o vacío."))
            this.nombre = nombre;
        
        this.listaZonas = listaZonas;
        this.listaEmpleados = listaEmpleados;
        this.listaVisitantes = listaVisitantes;
        
    }

    /**
     * Getter Nombre nombre del parque
     * @return nombre (String)
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter Nombre nombre del parque
     * @param nombre (String)
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter ListaZonas las de las zonas del parque.
     * @return listaZonas List<>
     */
    public List<ZonaParque> getListaZonas() {
        return listaZonas;
    }

     /**
     * Setter ListaZonas las de las zonas del parque.
     * @param listaZonas List<>
     */
    public void setListaZonas(List<ZonaParque> listaZonas) {
        this.listaZonas = listaZonas;
    }

    /**
     * Getter ListaEmpleados Empleados del parque.
     * @return listaEmpleados List<>
     */   
    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    /**
     * Setter ListaEmpleados Empleados del parque.
     * @param listaEmpleados List<>
     */ 
    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    /**
     * Getter ListaVisitantes Visitantes diarios del parque.
     * @return listaVistantes List<>
     */ 
    public List<Visitante> getListaVisitantes() {
        return listaVisitantes;
    }

    /**
     * Setter ListaVisitantes Visitantes diarios del parque.
     * @param listaVistantes List<>
     */ 
    public void setListaVisitantes(List<Visitante> listaVisitantes) {
        this.listaVisitantes = listaVisitantes;
    }
    
    
    
    /**
     * Método abrir parque. Imrime log abrir parque.
     * @param inicializa la lista diaria de visitantes.
     */
    public void abrirParque(){
        
        this.listaVisitantes.clear();
        System.out.println("Parque abierto");
        
    }
            
    /**
     * Método cerrar parque. impprime log cerrar parque.
     */
    public void cerrarParque(){
        System.out.println("Parque Cerrado");        
    }
    
    
    
    public void gestionarIncidencia(){
        
        
        
    }
    
    
}
