
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        
        this.listaZonas = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
        this.listaVisitantes = new ArrayList<>();
        
    }
    
    
        /**
     * Constructor con lista de objetos y nombre del parque.
     * @param nombre del parque.
     * @param listaZonas zonas del parque.
     * @param listaEmpleados empleados del parque.
     * @param listaVisitantes se inicializa en el constructor.
     * @throws ErrorDatos 
     */
    public ParqueAtracciones (String nombre, List<ZonaParque> listaZonas, List<Empleado> listaEmpleados) throws ErrorDatos {
        
        if (Atraccion.stringNoNulo(nombre, "Error, el nombre del Parque es un campo nulo o vacío."))
            this.nombre = nombre;
        
        this.listaZonas = listaZonas;
        this.listaEmpleados = listaEmpleados;
        this.listaVisitantes = new ArrayList<>();
        
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
    
    
    /**
     * Crea unba incidencia y la añade a la lista de la atraccion
     * @param parque ParqueAtracciones en donde esta la lista de zonas con lista de atracciones con lista de incidencias.
     * @throws ErrorDatos 
     */
    public static void gestionarIncidencia(ParqueAtracciones parque) throws ErrorDatos{
        
        Scanner kl = new Scanner(System.in);
        
        System.out.println("Describe la incidencia: ");
        // Descripcion de la incidencia primer parametro de entrada
        String descripcion = kl.nextLine();
        Atraccion.stringNoNulo(descripcion, "Descripción de la incidencia nula o vacía");
        
        imprimirNombreAtracciones(parque.listaZonas);
        System.out.println("Selecciona una atracción: ");
        int atraccion = kl.nextInt();
        Atraccion.enteroPositivo(atraccion, "El indice es negativo");
        // Atraccion de la averia o incidencia segundo parametro de entrada
        Atraccion atraccionAfectada = ParqueAtracciones.seleccionarAtraccion(parque.listaZonas, atraccion);

        System.out.println("Selecciona Estado: ");
        // Estado de la averia Resuelto, pendiente, cuarentena... tercer parametro de entrada
        String estado = kl.nextLine();
        Atraccion.stringNoNulo(descripcion, "Estado de la incidencia nulo o vacío");
        
        Empleado.imprimirNombreEmpleados(parque);
        System.out.println("Selecciona Empleado: ");
        int opcion = kl.nextInt();
        // Empleado assignado a la incidencia cuarto parametro de entrada
        Empleado empleado = Empleado.seleccionarEmpleado(parque, opcion);
        
        Incidencia inc = new Incidencia(descripcion, atraccionAfectada, estado, empleado);
        
        
//        Incidencia(String descripcion, Atraccion atraccionAfectada, String estado, Empleado empleado)
        
    }
    
    /**
     * Imprime el nombre de las atracciones por Zona
     * @param lista Lista de ZonaParque parametro de entrada para forzar static metod.
     */
    public static void imprimirNombreAtracciones(List<ZonaParque> lista){
        
        if (lista == null || lista.isEmpty()) {
            System.out.println("No hay zonas en el parque");
            return;
        }
        
        int indice = 1;
        System.out.println("Lista de Atracciones por Zona");
        System.out.println("-----------------------------");
        
        for (ZonaParque zon: lista){
            
            System.out.println("Zona: " + zon.getNombre());
            System.out.println("-----------------------------");
            
            for (Atraccion a: zon.getListaAtracciones()){
                System.out.println((indice++) + " atraccion: " + a.getNombre()); 
            }

            System.out.println("-----------------------------");
            System.out.println();
            System.out.println();            

        }
           
        
    }
    
    
        /**
     * Imprime el nombre de las atracciones por Zona
     * @param lista Lista de ZonaParque parametro de entrada para forzar static metod.
     */
    public static Atraccion seleccionarAtraccion(List<ZonaParque> lista, int indice) throws ErrorDatos {
        
        int i = 1;
        
        for (ZonaParque zon: lista){
            
            for (Atraccion a: zon.getListaAtracciones()){
                if (indice == i++)
                    return a;
            }
    
        }
       
        throw new ErrorDatos("Se ha introducido un indice inválido");
        
    }
    

}
