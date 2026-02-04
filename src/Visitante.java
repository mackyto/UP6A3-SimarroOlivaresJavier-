
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
    
    private List<Ticket> entradas;

    private static int codigo = 1; 
    
    /** 
     * Constructor con todos los parámetros.
     * @param dni (String) dni del visitante.
     * @param nombre (String) nombre del visitante.
     * @param edad (int) edad del visitante.
     * @param altura (double) la altura del visitante es negativa.
     * @param entradas (LIST<Tickets>) lista de entradas.
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
        
        entradas = new ArrayList<>();
        
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
    
    
    /**
     * Comprar entrada 
     * @throws ErrorDatos 
     */
    public void comprarEntrada() throws ErrorDatos {
        
    //    String tipoEntrada = "Normal";
    //  if (edad <= 13)
    //        tipoEntrada = "Niño";
    //    if (this.edad > 13  && this.edad <= 22)
    //        tipoEntrada = "Joven";
    //    if (this.edad > 22 && edad < 65 )
    //        tipoEntrada = "Adulto";      
    //    if (edad >= 65)
    //        tipoEntrada = "Jubilado";
    
        if 
    
    
        this.entradas.add(new Ticket(
                String.format("%d", this.codigo++),
                null,
                2.35,
                tipoEntrada));
    
    }
    
    
    /**
     * Verifica si el visitante a subido o no a la atracción imprimiendo un log
     * @param a clase Atraccion donde el visitante pretende subir
     * @throws ErrorDatos 
     */       
    public void montarAtraccion(Atraccion a) throws ErrorDatos {
   
        boolean bandera = false;
        
        if (a instanceof CarruselInfantil){
            CarruselInfantil ci = (CarruselInfantil) a;
            if (this.edad <= ci.getEdadMaxima())
                bandera = true;
        }else if (a instanceof MontañaRusa){
            MontañaRusa adulto = (MontañaRusa) a;
            if (this.altura <= adulto.getAlturaMaxima())
                bandera = true;
        }else{
            throw new ErrorDatos("Error, el visitante excede los requisitos de la atracción.");
        } 

        if (bandera)
            System.out.printf("\nEl visitante %s con (DNI:%s) a subido a la atracción %s a las %s\n\n", this.nombre, this.dni, a.getNombre(), LocalDateTime.now());
        
    }
    
    
}
