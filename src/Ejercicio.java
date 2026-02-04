
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * throws ErrorDatos
 * @author macky
 */
public class Ejercicio  {
    
    
    public static void main (String[] args){
        
        try{
        
            ParqueAtracciones parque= InicirParque.InicirParque();
            
            int selecion = imprimirMenu(parque);
            
            
        }catch (ErrorDatos er){
            System.err.println(er.getMessage());
        }catch (Exception e){
            System.err.println(e.getMessage());
            
        }
        
        
    }
    
    public static int imprimirMenu (ParqueAtracciones parque) throws ErrorDatos {
        
        Scanner kl = new Scanner(System.in);
        
        System.out.println("Menu Principal: " + parque.getNombre());
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("1 - Sección Atracciones");
        System.out.println();
        System.out.println("2 - Sección Zonas");
        System.out.println();
        System.out.println("3 - Sección Empleados");        
        System.out.println();
        System.out.println("4 - Sección Visitantes");
        System.out.println();
        System.out.println("5 - Sección Incidencias");
    
        int selecion = kl.nextInt();
        if (selecion < 1 || selecion > 5 ){
            throw new ErrorDatos("Selección del menú principal erronea");}
        
        return selecion;
        
    }
    
}
