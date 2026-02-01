
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
    
    public Ticket (String codigo, LocalDate fecha, double precio, String tipoEntrada) {
        
        if (Atraccion.stringNoNulo(codigo, "El código de Ticketno es un campo nulo"))
    
    
    
    }
    
    public double aplicarDescuento(){
        
        
    }
            
    public double calcularIVA(){
        
    }
    
}
