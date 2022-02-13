/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bitacora;

import java.util.Date;

/**
 *
 * @author Christian Novo Sacramento
 */
public class Anotacion {
    
    private String cabecera;
    private String cuerpo;
    private Date date;
    
    /**
     * Constructor que otorga valores por defecto
     */
    public Anotacion() {
        cabecera = null;
        cuerpo = null;
    }
    
    /**
     * Contructor que rellena la anotación
     * @param cabecera mensaje descriptivo anotación
     * @param cuerpo informe completo
     */
    public Anotacion(String cabecera, String cuerpo) {
        this.cabecera = cabecera;
        this.cuerpo = cuerpo;
    }
    
    /**
     * Método que devuelve un String al main
     * @return el contenido de la anotación
     */
    public String toString() {
        
        return "\t " + cabecera + "\n" + cuerpo;
    }
}
