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
    
    public Anotacion() {
        cabecera = null;
        cuerpo = null;
    }
    
    public Anotacion(String cabecera, String cuerpo) {
        this.cabecera = cabecera;
        this.cuerpo = cuerpo;
    }
}
