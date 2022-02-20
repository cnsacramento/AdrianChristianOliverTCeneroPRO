/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bitacora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Christian Novo Sacramento
 */
public class GestorProyectos {
    
    private HashMap<String,Proyecto> proyectos;
    private ArrayList<Map.Entry<String,Proyecto>> proyectoOrdenados; 
     
    /**
     * Constructor que crean un hasmap vacío
     */
    public GestorProyectos(){
        this.proyectos = new HashMap<>();
        this.proyectoOrdenados = new ArrayList<>(proyectos.entrySet());
    } 

    public GestorProyectos(HashMap<String, Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
    /**
     * Método que sirve para añadir proyectos
     * @param nombre forma la clave del hasmap de proyectos
     * @param proyecto recibe el objeto proyecto
     */
    public void anyadirProyecto(String nombre, Proyecto proyecto) {
        this.proyectos.put(nombre, proyecto);
    }
    
    /**
     * Método que ordena los proyectos por fechas
     */
    public ArrayList ordenarProyectos () {
        proyectoOrdenados = new ArrayList<>(proyectos.entrySet());
        Collections.sort(proyectoOrdenados,new Comparator<Map.Entry<String, Proyecto>>() {
            @Override
            public int compare(Map.Entry<String, Proyecto> pro1, Map.Entry<String, Proyecto> pro2) {
                return pro1.getValue().getFecha().compareTo(pro2.getValue().getFecha());
            }
        });
        
        return proyectoOrdenados;
    }

    public ArrayList<Map.Entry<String, Proyecto>> getProyectoOrdenados() {
        return proyectoOrdenados;
    }

    public void setProyectoOrdenados(ArrayList<Map.Entry<String, Proyecto>> proyectoOrdenados) {
        this.proyectoOrdenados = proyectoOrdenados;
    }

    public HashMap<String, Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(HashMap<String, Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
}
