/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macky
 */
public class pruebas {
    
    public static void main (String[] args) throws ErrorDatos {
        
        ParqueAtracciones parque = InicirParque.InicirParque();
        
        ParqueAtracciones.imprimirNombreAtracciones(parque.getListaZonas());
        
        
    }
    
    
}
