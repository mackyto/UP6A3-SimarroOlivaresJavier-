
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macky
 */
public class InicirParque {
    
private static String[][] empleados = {
    // {dni, nombre, puesto, antiguedad}
    {"12345678A", "María López García", "Desarrollador Senior", "5"},
    {"87654321B", "Carlos Ruiz Martín", "Analista de Datos", "3"},
    {"11223344C", "Ana Torres Sánchez", "Gerente de Proyecto", "8"},
    {"55667788D", "Pedro Gómez Fernández", "Diseñador UX/UI", "2"},
    {"99887766E", "Laura Díaz Romero", "Administradora de Sistemas", "6"},
    {"33445566F", "Miguel Ángel Castro", "Técnico de Mantenimiento", "4"},
    {"22334455G", "Elena Vargas Paredes", "Supervisora de Operaciones", "9"},
    {"44556677H", "Javier Mendoza Soto", "Coordinador de Seguridad", "7"}
    };
    
    private static String[][] adulto = {
    // {alturaMaxima, longitudRecorrido, nombre, capacidadMaxima, tiempoRecorrido, nivelAdrenalina}
    {"45.5", "1200.75", "Dragón de Fuego", "24", "120", "9"},
    {"32.0", "850.25", "Torbellino Veloz", "32", "95", "7"},
    {"55.8", "1500.50", "Caída del Demonio", "20", "180", "10"},
    {"28.3", "650.80", "Serpiente Silbante", "28", "75", "6"},
    {"40.2", "1100.00", "Relámpago Plateado", "30", "110", "8"}
    };
    
    private static String[][] infantil = {
    // {edadMaxima, numeroFiguras, nombre, capacidadMaxima, tiempoRecorrido, nivelAdrenalina}
    // ( int            int        String        int                int            int
    {"8", "16", "Juego de Caballitos", "25", "150", "1"},
    {"12", "24", "Aventura Encantada", "35", "210", "3"},
    {"10", "20", "Carrousel Mágico", "30", "180", "2"}
    };

    private static String[] zonas = {
    "Zona Aventura Extrema",
    "Zona Familiar Infantil", 
    "Zona Relax y Descanso"
    };

    public static ParqueAtracciones InicirParque () throws ErrorDatos{
        
        
        List<Empleado> personal = new ArrayList<>();
        
        for (int i = 0; i < 8; i++){
            
            personal.add( new Empleado(
                    empleados[i][0],
                    empleados[i][1],
                    empleados[i][2],
                    Integer.parseInt(empleados[i][3]) ) );
            
        }
        
        List<ZonaParque> zona = new ArrayList<>();
        
        for (int i = 0; i > 3; i++){
            
            zona.add( new ZonaParque(zonas[2-i]));
                 
            switch (i) {
                
                case 0:
                    zona.getLast().añadirAtraccion(new CarruselInfantil(
                    Integer.parseInt(infantil[3][0]),
                    Integer.parseInt(infantil[3][1]),
                    infantil[3][2],
                    Integer.parseInt(infantil[3][3]),
                    Integer.parseInt(infantil[3][4]),
                    Integer.parseInt(infantil[3][5])
                    ));break;
                
                case 1:
                    
                    for (int j = 0; j < 2; j++){
                        
                        zona.getLast().añadirAtraccion(new CarruselInfantil(
                        Integer.parseInt(infantil[j][0]),
                        Integer.parseInt(infantil[j][1]),
                        infantil[j][2],
                        Integer.parseInt(infantil[j][3]),
                        Integer.parseInt(infantil[j][4]),
                        Integer.parseInt(infantil[j][5])
                        ));
                                               
                        zona.getLast().añadirAtraccion(new MontañaRusa(
                        Double.parseDouble(adulto[j][0]),
                        Double.parseDouble(adulto[j][1]),
                        adulto[j][2],
                        Integer.parseInt(adulto[j][3]),
                        Integer.parseInt(adulto[j][4]),
                        Integer.parseInt(adulto[j][5])
                        ));}break;
                    
                case 2:
                        
                    for (int j = 2; j < 5; j++){
                           
                        zona.getLast().añadirAtraccion(new MontañaRusa(
                        Double.parseDouble(adulto[j][0]),
                        Double.parseDouble(adulto[j][1]),
                        adulto[j][2],
                        Integer.parseInt(adulto[j][3]),
                        Integer.parseInt(adulto[j][4]),
                        Integer.parseInt(adulto[j][5])
                        ));}break;
   
            }
 
        }
    
        ParqueAtracciones parque = new ParqueAtracciones("Rumbler",zona,personal);
        
        return parque;
        
        
    }    
        
}
