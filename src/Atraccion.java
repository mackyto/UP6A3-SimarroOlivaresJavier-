/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Clase abstracta Atraccion:
 * 
 *      Atributos: nombre, capacidadMaxima, tiempoRecorrido, nivelAdrenalina
 *      Métodos abstractos: calcularPrecio(), realizarMantenimiento()
 *      Métodos concretos: getters/setters, iniciarAtraccion(), detenerAtraccion()
 * 
 * @author javsimoli
 */

public abstract class Atraccion implements Mantenible{

    private String nombre;
    private int capacidadMaxima, tiempoRecorrido, nivelAdrenalina;
    boolean funcionando;
    
    /**
     * Constructro clase abstracta
     * @param nombre Nombre de la atracción.
     * @param capacidadMaxima Número máximo de ocupantes.
     * @param tiempoRecorrido Tiempo delrecorrido en segundos.
     * @param nivelAdrenalina Valor subjetivo de la respuesta personalante la atraccion.
     */
    public Atraccion(String nombre, int capacidadMaxima,int tiempoRecorrido,int nivelAdrenalina) throws ErrorDatos {
        
        if (this.stringNoNulo(nombre))
            this.capacidadMaxima=capacidadMaxima;    
        if (this.enteroPositivo(capacidadMaxima))
            this.capacidadMaxima=capacidadMaxima;
        if (this.enteroPositivo(tiempoRecorrido))
            this.tiempoRecorrido = tiempoRecorrido;
        if (this.enteroPositivo(nivelAdrenalina))
            this.capacidadMaxima=capacidadMaxima;        
    }

    /**
     * Getter nombre
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter nombre
     * @param nombre String.
     * @throws ErrorDatos reenvio de mensaje personalizado.
     */
    public void setNombre(String nombre) throws ErrorDatos {
        if (this.stringNoNulo(nombre))
        this.nombre = nombre;
    }

    /**
     * Getter capacidadMaxima
     * @return int
     */
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /**
     * Setter capacidadMaxima
     * @param capacidadMaxima int.
     * @throws ErrorDatos reenvio de mensaje personalizado.
     */
    public void setCapacidadMaxima(int capacidadMaxima) throws ErrorDatos {
        if (this.enteroPositivo(nivelAdrenalina))
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * Getter tiempRecorrido
     * @return int
     */
    public int getTiempoRecorrido() {
        return tiempoRecorrido;
    }

    /**
     * Setter tiempoRecorrido
     * @param tiempoRecorrido int
     * @throws ErrorDatos reenvio de mensaje personalizado.
     */
    public void setTiempoRecorrido(int tiempoRecorrido) throws ErrorDatos {
        this.tiempoRecorrido = tiempoRecorrido;
    }

    /**
     * Getter nivelAdrenalina.
     * @return int
     */
    public int getNivelAdrenalina() {
        return nivelAdrenalina;
    }

    /**
     * Setter niveladrenalina.
     * @param nivelAdrenalina int
     * @throws ErrorDatos reenvio de mensaje personalizado.
     */
    public void setNivelAdrenalina(int nivelAdrenalina) throws ErrorDatos {
        this.nivelAdrenalina = nivelAdrenalina;
    }
   
    
    public abstract double calculaPrecio();

    public abstract void realizarMantenimiento();

    public void iniciarAtraccion(){
        this.funcionando = true;
    }
    
    public void detenerAtraccion(){    
        this.funcionando = false;
    }
    
    
    /**
     * Comprovación de parametros entero positivo.
     * @param valor Númeroa a ser chequeado.
     * @return boleana true si cumple los requisitos.
     * @throws ErrorDatos Lanza un mensaje de error generico de cadena. 
     */
    public boolean enteroPositivo(int valor) throws ErrorDatos {
        if (valor > 0){
            return true;
        }else{
            throw new ErrorDatos("Valor entero cero o negativo"); 
        }
    }

    /**
     * Comprobación de cadena no nula ni vacía.
     * @param texto cadena de texto a ser verificada. 
     * @return boleana si cumple los requisitos.
     * @throws ErrorDatos Lanza un mensaje de error generico de cadena. 
     */
    public boolean stringNoNulo(String texto) throws ErrorDatos {
        if (texto == null || texto.isEmpty()){
            return true;
        }else{
            throw new ErrorDatos("Valor de cadena nulo o vacío"); 
        }        
    }

}
