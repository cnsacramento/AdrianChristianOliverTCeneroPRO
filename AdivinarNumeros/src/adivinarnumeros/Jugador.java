/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adivinarnumeros;

import java.util.ArrayList;

/**
 *
 * @author regalado y Christian Novo
 */
public class Jugador {
    
    private String alias;
    private int experiencia;
    private int nivel;
    private int partidasJugadas ;
    private int partidasGanadas;
    private int partidasPerdidas;
    private ArrayList partidas = new ArrayList();
    
    /**
     * Constructor por defecto
     */
    public Jugador () {}
    
    /**
     * Constructor para el alias
     * @param alias 
     */
    public Jugador(String alias){    
        this.alias = alias;
        experiencia = 0;
        nivel = 1;    
    }
    
    /**
     * Método que Incrementa las partidas ganadas, pérdidas y jugadas
     * @param estado 
     */
    public void estadisticaPartida (boolean estado) {
        
        if (estado) {
            partidasGanadas++;
        }else {
            partidasPerdidas++;
        }
        partidasJugadas = partidasGanadas + partidasPerdidas;
    }
    
    /**
     * Método que agrega una partida al historial del jugador
     * @param partida agrega la partida al historial
     */
    public void anyadirPartida(Partida partida) {
        this.partidas.add(partida);
    }
    
    public void subirNivel(){
        nivel += 1;
    }
    
    public void setExperiencia(int experiencia){
        this.experiencia += experiencia;
    }
    
    /**
     * Método que contiene todos los datos del jugador
     * @return 
     */
    @Override
    public String toString(){
        return "Alias: " + alias 
                + "\nPartidas Jugadas: " + partidasJugadas
                + "\nPartidas Ganadas: " + partidasGanadas
                + "\nPartidas Pérdidas: " + partidasPerdidas;        
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList getPartidas() {
        return partidas;
    }

    public void setPartidas(ArrayList partidas) {
        this.partidas = partidas;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }
}
