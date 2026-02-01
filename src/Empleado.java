
import java.time.LocalDate;
import java.time.LocalTime;

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
     * Constructor Empledao con todos los parametros y comprobación.
     * @param dni String documento nacionl de identidad del empleado. String
     * @param nombre nombre del empleado. String
     * @param puesto nomre del puesto de trabajo. String
     * @param antiguedad numero entero de años de antiguedad. int
     * @throws ErrorDatos... Creación especifica de un falo de 
     */
    public Empleado (String dni, String nombre, String puesto, int antiguedad) throws ErrorDatos{
    
        if (Atraccion.stringNoNulo(dni, "DNI del Empleado nulo o vacío")){
            dni = dni.toUpperCase();
            if (this.matchDNI(dni, "Formato inválido del DNI"))
                this.dni = dni;
        }
    
        if (Atraccion.stringNoNulo(nombre, "Nombre del Empleado nulo o vacío"))
            this.nombre = nombre;
        
        if (Atraccion.stringNoNulo(puesto, "Puesto del Empleado nulo o vacío"))
            this.puesto = puesto;
        
        if (Atraccion.enteroPositivo(antiguedad, "Valor negativo en antiguedad del Empleado"))
            this.antiguedad = antiguedad;        
    
    }

    /**
     * Getter dni String numero dni
     * @return String en formato DNI
     */
    public String getDni() {
        return dni;
    }

    /**
     * Setter dni con verificación de datos
     * @param dni numero dni con letra mayuscula o minuscula ya que se convierte a mayusculas.
     */
    public void setDni(String dni) throws ErrorDatos {
        if (Atraccion.stringNoNulo(dni, "DNI del Empleado nulo o vacío")){
            dni = dni.toUpperCase();
            if (this.matchDNI(dni, "Formato inválido del DNI"))
                this.dni = dni;
        }
    }

    /**
     * Getter nombre nombre, del empleado.
     * @return String con el nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter nombre
     * @param nombre String con el nombre del empleado. 
     */
    public void setNombre(String nombre) throws ErrorDatos {
        if (Atraccion.stringNoNulo(nombre, "Nombre del Empleado nulo o vacío"))
            this.nombre = nombre;
    }

    /**
     * Getter puesto
     * @return String con el nombre del puesto de trabajo del empleado.
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Setter puesto String 
     * @param puesto String nombre del puesto de trabajo.
     */
    public void setPuesto(String puesto) throws ErrorDatos {
        if (Atraccion.stringNoNulo(puesto, "Puesto del Empleado nulo o vacío"))
            this.puesto = puesto;
    }

    /**
     * Getter antiguedad  
     * @return antiguedad devuelve un entero con la antiguedad en el parque del empleado.
     */
    public int getAntiguedad() {
        return antiguedad;
    }

    /**
     * Setter antiguedad 
     * @param antiguedad int, modifica la antiguadad de un empleado
     */
    public void setAntiguedad(int antiguedad) throws ErrorDatos {
        if (Atraccion.enteroPositivo(antiguedad, "Valor negativo en antiguedad del Empleado"))
            this.antiguedad = antiguedad; 
    }
    
    /** 
     * Añade un año a la antiguedad, no tiene parametros de entrada ni de salida.
     */
    public void antiguedadNextYear(){
        this.antiguedad++;
    }   
    
    
    /**
     * 
     * @param dni String con el formato de DNI
     * @param mensaje Mensaje personalizado en caso de error de formato.
     * @return booleana true, si el formato se ajusta a los requisitos del dni
     * @throws ErrorDatos enviando mensaje personalizado
     */
    public static boolean matchDNI(String dni, String mensaje) throws ErrorDatos{
        if (dni.matches("[0-9]{8}[A-Z]")){
            return true;
        }else{throw new ErrorDatos(mensaje);}
    }
            
    /**
     * Imprime log de fecha y hora de inicialización de jornada.
     * no tiene parametros de entrada ni de salida.
     */
    public void ficharEntrada(){
        
        System.out.println(String.format("El empleado %s.\nCon DNI: %s a comenzado su jornada %s.\nA las %s", this.nombre, this.dni, LocalDate.now(), LocalTime.now()));
        
    }
    
    /**
     * Imprime log de fecha y hora de finalización de jornada.
     * no tiene parametros de entrada ni de salida.
     */
    public void ficharSalida(){
        
        System.out.println(String.format("El empleado %s.\nCon DNI: %s a terminado su jornada %s.\nA las %s", this.nombre, this.dni, LocalDate.now(), LocalTime.now()));
        
    }


    /**
     * Asigna una atraccon (nombre) al puesto del trabajador.
     * @param atracion 
     */
    public void asignarAtraccion(Atraccion atracion){
        
        this.puesto = atracion.getNombre();
        
    }
    
            
}
