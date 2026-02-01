
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Clase Ticket:
 *
 *      Atributos: codigo, fecha, precio, tipoEntrada
 *      Métodos: aplicarDescuento(), calcularIVA()
 * 
 * @author javsimoli
 */

public class Ticket {
    
    private String codigo;
    private LocalDate fecha; 
    private double precio;
    private String tipoEntrada;
    private static final double DESCUENTO = 15.00;
    private static final double IVA = 21.00;
    
    /**
     * Constructor ticket Con todos los parametros.
     * @param codigo Código de impresión del ticket, único diario.
     * @param fecha fecha de hoy o futuro en caso de ser nula la fecha de hoy.
     * @param precio precio en € del ticket.
     * @param tipoEntrada tipo o publico de la entrada
     * @throws ErrorDatos  en caso de error de parametros salta al principio y muestra error.
     */
    public Ticket (String codigo, LocalDate fecha, double precio, String tipoEntrada) throws ErrorDatos {
        
        if (Atraccion.stringNoNulo(codigo, "El código de Ticket es nulo")){
            this.codigo = codigo;
        }
        
        if (fecha != null) {
            this.fecha = fecha;
        } else {
            this.fecha = LocalDate.now();
        }
        
        if (Atraccion.decimalPositivo(precio, "El precio del ticket es un número negativo")){
            this.precio = precio;
        }
        
        if (Atraccion.stringNoNulo(tipoEntrada, "El tipo de entrada es nulo")){
            this.tipoEntrada = tipoEntrada;
        }
    
    }

    
    
    /**
     * Getter codigo, código del ticket.
     * @return String (código del ticket).
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Setter codigo Extrae el código del ticket.
     * @param codigo debe ser un String.
     * @throws ErrorDatos envia mensaje personalizado.
     */
    public void setCodigo(String codigo) throws ErrorDatos {
        if (Atraccion.stringNoNulo(codigo, "El código de Ticket es nulo")){
            this.codigo = codigo;
        }
    }

    /**
     * Getter fecha fecha del ticket.
     * @return fecha en formato o tipo datetime.
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Setter fecha del ticket.
     * @param fecha tipo LocalDate.
     */
    public void setFecha(LocalDate fecha) {
        if (fecha != null) {
            this.fecha = fecha;
        } else {
            this.fecha = LocalDate.now();
        }
    }

    
    /**
     * Getter para obtener el precio del ticket en €
     * @return pecio en euros tipo double.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Setter precio en euros.
     * @param precio tipo double.
     * @throws ErrorDatos Imprime mensaje personalizado
     */
    public void setPrecio(double precio) throws ErrorDatos {
        if (Atraccion.decimalPositivo(precio, "El precio del ticket es un número negativo")){
            this.precio = precio;
        }
    }

    /**
     * Getter tipoEntrada String para indicar el tipo de ticket
     * @return String tipo de entrada
     */
    public String getTipoEntrada() {
        return tipoEntrada;
    }

    /**
     * Setter tipoEntrada actualiza el tipo de entrada
     * @param tipoEntrada String
     * @throws ErrorDatos 
     */
    public void setTipoEntrada(String tipoEntrada) throws ErrorDatos {
        if (Atraccion.stringNoNulo(tipoEntrada, "El tipo de entrada es nulo")){
            this.tipoEntrada = tipoEntrada;
        }
    }
    
    
    
    
    
    
    
    
    
    /**
     * aplica un descuento del 15%
     * @return 
     */
    
    public double aplicarDescuento(){
        
        return this.precio * (100 - DESCUENTO) / 100;
        
    }
    
    
    /**
     * suma el iva l valor de la entrada
     * @return 
     */        
    public double calcularIVA(){
        
        return this.precio + precio * IVA / 100;
        
    }
    
}
