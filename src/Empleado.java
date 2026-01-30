/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Clase Empleado:
 * 
 *      Atributos: dni, nombre, puesto, antiguedad
 *      Métodos: ficharEntrada(), ficharSalida(), asignarAtraccion(Atraccion a)
 * 
 * @author javsimoli
 */

public class Empleado {
    
    private String dni;
    private String nombre;
    private String puesto;
    private int antiguedad;
    
    /**
     * Constructor Empledao con todos los parametros
     * @param dni String documento nacionl de identidad del empleado.
     * @param nombre nombre del empleado
     * @param puesto
     * @param antiguedad
     * @throws ErrorDatos... Creación especifica de un falo de 
     */
    public Empleado (String dni, String nombre, String puesto, int antiguedad) throws ErrorDatos{
    
        if (Atraccion.stringNoNulo(dni, "DNI del Empleado nulo o vacío") && )
            this.dni = dni;
    
        if (Atraccion.stringNoNulo(nombre, "Nombre del Empleado nulo o vacío"))
            this.nombre = nombre;
        
        if (Atraccion.stringNoNulo(puesto, "Puesto del Empleado nulo o vacío"))
            this.nombre = nombre;
        
        if (Atraccion.enteroPositivo(antiguedad, "Valor negativo en antiguedad del Empleado"))
            this.antiguedad = antiguedad;        
    
    }

    /**
     * 0
     * @return String 
     */
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    public static boolean matchDNI(String dni, String mensaje)
            
    
    
    
    
    
    
            
}
