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
public class GestorProyectos {
    
    private HashMap<String,Proyecto> proyectos;
    
    /**
     * Constructor que crean un hasmap vacío
     */
    public GestorProyectos(){
        this.proyectos = new HashMap<>();
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


    public HashMap<String, Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(HashMap<String, Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
}
