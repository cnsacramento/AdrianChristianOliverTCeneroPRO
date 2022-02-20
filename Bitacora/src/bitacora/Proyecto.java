/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bitacora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Christian Novo Sacramento
 */
public class Proyecto {
    
    private String nombre;
    private String descripcion;
    private HashMap<String,Anotacion> anotaciones;
    //New Feature
    private ArrayList<Map.Entry<String,Anotacion>> anotacionesOrdenadas;
    private Date fecha;
    
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
        this.fecha = new Date();
    }
    /**
     * Método que sirve para añadir las anotaciones al proyecto
     * @param anotacion clave para buscar la anotación
     * @param anotaciones objeto anotación
     */
    public void anyadirAnotacion(String anotacion, Anotacion anotaciones) {
        
        this.anotaciones.put(anotacion, anotaciones);
    } 
    
    /**
     * Método que ordena las anotaciones por fecha
     * @return ArrayList ordenado por fecha
     */
    public ArrayList ordenarAnotaciones () {
        
        anotacionesOrdenadas = new ArrayList<>(anotaciones.entrySet());
        Collections.sort( anotacionesOrdenadas, new Comparator<Map.Entry<String,Anotacion>>() {
            @Override
            public int compare(Map.Entry<String, Anotacion> a1, Map.Entry<String, Anotacion> a2) {
                return a1.getValue().getFecha().compareTo(a2.getValue().getFecha());
            }
        });
        return anotacionesOrdenadas;
    }
    
    @Override
    public String toString() {
        return "El nombre del proyecto es: " + nombre 
                +"\nY su descripción es: " + descripcion
                + "\n Creado: " + fecha;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Map.Entry<String, Anotacion>> getAnotacionesOrdenadas() {
        return anotacionesOrdenadas;
    }

    public void setAnotacionesOrdenadas(ArrayList<Map.Entry<String, Anotacion>> anotacionesOrdenadas) {
        this.anotacionesOrdenadas = anotacionesOrdenadas;
    }
    
    
}
