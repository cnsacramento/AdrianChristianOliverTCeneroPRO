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
    
    public GestorProyectos(){} //Constructor sin parámetros

    public GestorProyectos(HashMap<String, Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
    

    public HashMap<String, Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(HashMap<String, Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
}
