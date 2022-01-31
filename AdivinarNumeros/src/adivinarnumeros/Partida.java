/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adivinarnumeros;

import java.util.Random;

/**
 *
 * @author Christian Novo Sacramento
 */
public class Partida {
    
    private int numeroSecreto;
    private int dificultad;
    private String jugador;
    
    
    /**
     * 
     * @param dificultad grado de dificultad de la partida elegida por el jugador
     * @param jugador persona que juega la partida
     */
    Partida (int dificultad, String jugador) {
        
        this.dificultad = dificultad;
        this.jugador = jugador;
    }
    
    /**
     * Método que sirve para generar un número aleatorio en función de la dificultad
     * @return devuelve el número aleatorio llamado número secreto
     */
    public int generarAleatorio() {
        
        Random rnd = new Random();
        switch (dificultad) {
            //dificulad 1 = fácil
            case 1:
                numeroSecreto = rnd.nextInt(10);
                break;
            //dificultad 2 = media
            case 2:
                numeroSecreto = rnd.nextInt(100);
                break;
            //dificultad 3 = díficil
            case 3:
                numeroSecreto = rnd.nextInt(1000);
                break;
            //dificultad 4 = Leyenda
            case 4:
                numeroSecreto = rnd.nextInt(10000);
                break;                
        }
        
        return numeroSecreto;
    }
}
