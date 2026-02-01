/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Clase Visitante:
 * 
 *      Atributos: dni, nombre, edad, altura
 *      Métodos: comprarEntrada(), montarAtraccion(Atraccion a)
 * 
 * @author javsimoli
 */

public class Visitante {
    
    private String dni;
    private String nombre;
    private int edad;
    private double altura;

    private static int codigo = 1; 
    
    /** 
     * Constructor con todos los parámetros.
     * @param dni (String) dni del visitante.
     * @param nombre (String) nombre del visitante.
     * @param edad (int) edad del visitante.
     * @param altura (double) la altura del visitante es negativa.
     * @throws ErrorDatos mensaje personalizado porr inconsistencia de datos.
     */
    public Visitante(String dni, String nombre, int edad, double altura) throws ErrorDatos {
        
        if (Atraccion.stringNoNulo(dni, "Errror el dni del visitante es nulo") && 
            Empleado.matchDNI(dni, "Error el dni del visitante no tiene formato correcto")){
            
            this.dni = dni;
        }
    
        if (Atraccion.stringNoNulo(nombre, "Error, el nombre del visitante es un campo nulo")){
            this.nombre = nombre;
        }
            
        if (Atraccion.enteroPositivo(edad, "Error, la edad del visitante es un número negativo")){
            this.edad = edad;
        }
        
        if (Atraccion.decimalPositivo(altura, "Error la altura del visitante es un número negativo")){
            this.altura = altura;
        }
        
    }

    
    /**
     * Getter dni
     * @return dni (String) dni del visitante
     */
    public String getDni() {
        return dni;
    }

    /**
     * Setter dni 
     * @param dni (String) 
     * @throws ErrorDatos mensaja peresonalizado. 
     */
    public void setDni(String dni) throws ErrorDatos {
        if (Atraccion.stringNoNulo(dni, "Errror el dni del visitante es nulo") && 
            Empleado.matchDNI(dni, "Error el dni del visitante no tiene formato correcto")){
            
            this.dni = dni;
        }
    }

    /**
     * Getter nombre (String) nombre.
     * @return nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter nombre (String).
     * @param nombre (String) nombre Visitante.
     * @throws ErrorDatos  mensaja peresonalizado 
     */
    public void setNombre(String nombre) throws ErrorDatos {
        if (Atraccion.stringNoNulo(nombre, "Error, el nombre del visitante es un campo nulo")){
            this.nombre = nombre;
        }
    }

    /**
     * Getter edad (int) edad del visitantew
     * @return edad (int)
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Setter edad (int) 
     * @param edad (int) 
     * @throws ErrorDatos mensaja peresonalizado 
     */
    public void setEdad(int edad) throws ErrorDatos {
        if (Atraccion.enteroPositivo(edad, "Error, la edad del visitante es un número negativo")){
            this.edad = edad;
        }
    }

    /**
     * Getter altura (double) altura del visitante en metros.
     * @return altura (double)
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Setter altura (double) altura en metros del visitante.
     * @param altura (double)
     * @throws ErrorDatos 
     */
    public void setAltura(double altura) throws ErrorDatos {
        if (Atraccion.decimalPositivo(altura, "Error la altura del visitante es un número negativo")){
            this.altura = altura;
        }
    }
    
    
    
    public void comprarEntrada(){
    
    //    Ticket  entrada = new Ticket(String.format("%d", this.codigo++), null, 2.35, "normal");
    
    }
    
    
            
    public void montarAtraccion(Atraccion a){
    
    
    
    }
    
    
    
    
    
}
