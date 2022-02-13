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
    public Proyecto(){
        
        this.anotaciones = new HashMap<>();
    }
    
    /**
     * Contructor del proyecto que añade el hashmap vacío
     * @param nombre obtiene el nombre del proyecto
     * @param descripcion obtiene la descripción del proyecto
     */
    public Proyecto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.anotaciones = new HashMap<>();
    }
    /**
     * Método que sirve para añadir las anotaciones al proyecto
     * @param anotacion clave para buscar la anotación
     * @param anotaciones objeto anotación
     */
    public void anyadirAnotacion(String anotacion, Anotacion anotaciones) {
        
        this.anotaciones.put(anotacion, anotaciones);
    } 
    
    @Override
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
