
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

    private static Scanner kl = new Scanner(System.in);
    
    public static void main (String[] args){
        
        try{
        
            ParqueAtracciones parque= InicirParque.InicirParque();
            
            int selecion = imprimirMenu(parque);
            
            do{
            
            switch (selecion){
                
                case 1:  System.out.println("Opcion no implementada");break;
                                
                case 2:
                    
                    int opcion =  imprimirMenuIncidencia();
                    switch (opcion){
                        
                        case 1: ParqueAtracciones.gestionarIncidencia(parque);break;
                        
                        case 2: System.out.println("Opcion no implementada");break;

                        case 3: System.out.println("Opcion no implementada");break;
                                
                    }
                    ;break;
                                
                case 3:  System.out.println("Opcion no implementada");break;
                                
                case 4:  System.out.println("Opcion no implementada");break;
                                
                case 5: System.out.println("Opcion no implementada");break;
                                
                case 6: System.out.println("Opcion no implementada");break;
                                
                
            }
            
            }while (selecion != 7);
            
        }catch (ErrorDatos er){
            System.err.println(er.getMessage());
                
        
        } catch (Exception e) {
            System.err.println(e.getMessage());

        } finally {
            // Cerrar el scanner solo al final del programa
            if (kl != null) {
                kl.close();
            }
        }
        
        
    }
    
    public static int imprimirMenu (ParqueAtracciones parque) throws ErrorDatos {
        


        System.out.println("Menu Principal: " + parque.getNombre());
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("1 - Sección Atracciones");
        System.out.println();
        System.out.println("2 - Sección Incidencias");
        System.out.println();
        System.out.println("3 - Sección Zonas");
        System.out.println();
        System.out.println("4 - Sección Empleados");        
        System.out.println();
        System.out.println("5 - Sección Visitantes");
        System.out.println();
        System.out.println("6 - Sección Tickets");
        System.out.println();
        System.out.println("7 - Salir");
        System.out.println();
        
        int seleccion;
        try {
            seleccion = Integer.parseInt(kl.nextLine());
            if (seleccion < 1 || seleccion > 7) {
                throw new ErrorDatos("Selección del menú principal errónea");
            }
        } catch (NumberFormatException e) {
            throw new ErrorDatos("Debe ingresar un número válido");
        }
        
        return seleccion;    
        
    }

        public static int imprimirMenuIncidencia () throws ErrorDatos {
        
        Scanner kl = new Scanner(System.in);
        
        System.out.println("Menu Incidencias: ");
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("1 - Añadir Incidencia");
        System.out.println();
        System.out.println("2 - Listar Incidencias");
        System.out.println();
        System.out.println("3 - Resolver Incidencia");
        System.out.println();
  
        int seleccion;
        try {
            seleccion = Integer.parseInt(kl.nextLine());
            if (seleccion < 1 || seleccion > 7) {
                throw new ErrorDatos("Selección del menú principal errónea");
            }
        } catch (NumberFormatException e) {
            throw new ErrorDatos("Debe ingresar un número válido");
        }
        
        return seleccion;
    }
    
    
    
}
