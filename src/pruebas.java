
import java.util.Scanner;

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
        
        Scanner kl = new Scanner(System.in);
        
        ParqueAtracciones parque = InicirParque.InicirParque();
        
        ParqueAtracciones.imprimirNombreAtracciones(parque.getListaZonas());
        
        Empleado.imprimirEmpleados(parque);
        
        Empleado.imprimirNombreEmpleados(parque);        
        
        System.out.println("Selecciona Empleado: ");
        int opcion = 2; //kl.nextInt();
        
        Empleado emple = Empleado.seleccionarEmpleado(parque, opcion);
        
        Empleado.ImprimirDatosEmpleado(emple);
     
        System.out.println(parque.getListaZonas().get(1).getListaAtracciones().get(2).getNombre());
        
        System.out.println(parque.getListaEmpleados().get(0).getNombre());
        
    }
    
    
    

    
}
