/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adivinarnumeros;

/**
 *
 * @author regalado
 */
public class Jugador {
    
    private String alias;
    // La clase Historial aún no ha sido creada y hay que plantearla y diseñarla antes de implementarla en la clase Jugador.
    // Historial historial;
    private int experiencia;
    private int nivel;
    
    Jugador(String alias){    
        this.alias = alias;
        experiencia = 0;
        nivel = 1;    
    }
    
    public void subirNivel(){
        nivel += 1;
    }
    
    public void setExperiencia(int experiencia){
        this.experiencia += experiencia;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + alias + "\nNivel: " + nivel + "\nExperiencia: " + experiencia + "\nExperiencia para el siguiente nivel:";        
    }
    
}
