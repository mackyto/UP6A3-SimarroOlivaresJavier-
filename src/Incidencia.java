
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
    private boolean resuelto;
    private Empleado empleado;
    private static int contador = 1000;
    
    
    
    /**
     * Constructor Incidencia 
     * @param descripcion
     * @param atraccionAfectada Atraccion  a la que se va a añadir la incidencia
     * @param estado
     * @throws ErrorDatos 
     */
    public Incidencia(String descripcion, Atraccion atraccionAfectada, String estado, Empleado empleado) throws ErrorDatos {
    
        this.id = contador++;
        
        if(Atraccion.stringNoNulo(descripcion, "Error descripcion de la incidencia nula"))
            this.descripcion = descripcion;
    
        this.fechaHora = LocalDateTime.now(); 
        
        if(this.AtraccionNoNula(atraccionAfectada))
            this.atraccionAfectada = atraccionAfectada;
       
        if(Atraccion.stringNoNulo(estado, "Error valor de la variable estado nula"))
            this.estado = estado;

        this.resuelto = false;
        
        this.empleado = empleado;
       
        atraccionAfectada.añadirIncidencia(this);
                
    }

    /**
     * Getter ID dentificador de la incidencia normalmente se auto rellena.
     * @return id int
     */
    public int getId() {
        return id;
    }

    /**
     * Setter ID dentificador de la incidencia normalmente se auto rellena.
     * @param id int
     * @throws ErrorDatos 
     */
    public void setId(int id) throws ErrorDatos {
        if (Atraccion.enteroPositivo(id, "Error, la identificacon no puede ser negativa"))
        this.id = id;
    }

    /**
     * Getter descripcion String.
     * @return String campo de texto con la descrpcón de la incidencia.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter descripcon Texto explicatiivo de la incidencia.
     * @param descripcion String.
     * @throws ErrorDatos.
     */
    public void setDescripcion(String descripcion) throws ErrorDatos {
        if(Atraccion.stringNoNulo(descripcion, "Error descrpcion de la incidencia nula"))
            this.descripcion = descripcion;
    }

    /**
     * Getter FechaHora de la incidencia.
     * @return LocalDateTime.
     */
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    /**
     * Setter fechahora.
     * @param fechaHora LocalDateTime. 
     */
    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    /**
     * Getter Atraccion Afectada devuelve objeto Atracción que ha sufrido la incidencia.
     * @return atraccionAfectada objeto clase Atraccion.
     */
    public Atraccion getAtraccionAfectada() {
        return atraccionAfectada;
    }

    /**
     * Setter atrraccionAfectado objeto Atraccion. 
     * @param atraccionAfectada objeto de la clase. 
     * @throws ErrorDatos 
     */
    public void setAtraccionAfectada(Atraccion atraccionAfectada) throws ErrorDatos {
        if(this.AtraccionNoNula(atraccionAfectada))
            this.atraccionAfectada = atraccionAfectada;
    }

    /**
     * Getter estado String con el estado actual de la incidencia.
     * @return estado String.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Setter estado String del ultimo estado de la incidencia.
     * @param estado Strring.
     * @throws ErrorDatos gestion de datos mensaje personalizado.
     */
    public void setEstado(String estado) throws ErrorDatos {
        if(Atraccion.stringNoNulo(estado, "Error valor de la varriable estado nula"))
            this.estado = estado;
    }

    /**
     * Getter resuelto revisa la resolución de la incidencia.
     * @return resuelto (boolean)
     */
    public boolean isResuelto() {
        return resuelto;
    }

    /**
     * Setter Actualiza la resolución de la incidencia.
     * @param resuelto (boolean)
     */
    public void setResuelto(boolean resuelto) {
        this.resuelto = resuelto;
    }

    /**
     * Getter Empleado revisa el tecnico assignado.
     * @return empleado objeto Empleado.
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Setter empleado reasigna empleado a la incidencia
     * @param empleado objeto empleado 
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    
    /**
     * Prueba si el objeto de la clase Atraccion. 
     * @param a Objeto de la clase Atraccion.
     * @return true si el objeto n es nulo.
     * @throws ErrorDatos "enǘia mensaje personalizado.
     */
    public boolean AtraccionNoNula(Atraccion a) throws ErrorDatos {
        
        if (a != null){
            return true;
        }else{
            throw new ErrorDatos("Objeto Atracción nulo");
        } 
        
    } 


    /**
     * Método resolver incidencia
     * cambia el estado a resuelto, el estado a resuelto e imprime log
     */
    public void resolverIncidencia(){

        this.resuelto = true;
        this.estado = "Resuelto";
        System.out.println("La incidencia esta resuelta");
    
    }

    /**
     * Metodo asignar método 
     * @param e objeto Empleado.
     */
    public void asignarTecnico(Empleado e){
        this.empleado = e;
    }

}
