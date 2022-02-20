/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adivinarnumeros;


import java.util.Collections;
import java.util.HashSet;
import java.util.TreeMap;

/**
 *Clase que almacena a los jugadores y le otorga una posición en el ranking 
 * @author Christian Novo Sacramento
 */
public class Ranking {
    
    private HashSet<Jugador> jugadores;
    private TreeMap<Integer, String> listaJugadores;
    
    /**
     * Constructor por defecto que genera el ranking
     */
    public Ranking () {
        listaJugadores = new TreeMap<>(Collections.reverseOrder()); //Genera el TreeMap en orden inverso
        jugadores = new HashSet<>();
    }
    
    /**
     * Método que añade el jugador al ranking (Historial)
     * @param jugador jugador de la partida
     */
    public void anyadirJugador (Jugador jugador) {
        
        this.jugadores.add(jugador);
    }
    
    /**
     * Método que mete los jugadores en el ranking ordenados por partidas ganadas
     * 
     */
    public void ordenarRanking () {
        
        for (Jugador jugadore : jugadores) {
            Integer partidasGanadas = jugadore.getPartidasGanadas();
            String alias = jugadore.getAlias();
            this.listaJugadores.put(partidasGanadas, alias);
        }
    }
    
    /**
     * Se crean los Getters y Setters
     * @return 
     */

    public TreeMap<Integer, String> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(TreeMap<Integer, String> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }
}