/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bitacora;

import java.util.HashMap;

/**
 *
 * @author Christian Novo Sacramento
 */
public class Proyecto {
    
    private String nombre;
    private String descripcion;
    private HashMap<String,Anotacion> anotaciones;
    
    /**
     * Contructor vacío del Proyecto
     */
    public Proyecto(){}
    
    public Proyecto(String nombre, String descripcion, HashMap anotaciones) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.anotaciones = anotaciones;
    }
    
    public String toString() {
        return "El nombre del proyecto es: " + nombre 
                +"\nY su descripción es: " + descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public HashMap<String, Anotacion> getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(HashMap<String, Anotacion> anotaciones) {
        this.anotaciones = anotaciones;
    }
}
