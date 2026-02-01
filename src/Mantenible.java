/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * Interfaz Mantenible:
 *
 *      Métodos: revisarSeguridad(), registrarIncidencia(String incidencia)
 * 
 * @author javsimoli
 */

public interface Mantenible {
    
    /**
     * Método revisarIntegridad
     */
    public void revisarSeguridad();
    
    /**
     * Método registrarIncidencia.
     */
    public void registrarIncidencia(String incidencia);
    
}
