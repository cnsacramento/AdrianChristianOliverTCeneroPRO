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
    
    private String dificultad;
    private boolean estado;
    private int numPartida;
    private int numeroIntentos;
    
    /**
     * Constructor por defecto
     */
    public Partida(){}
    
    /**
     * Método que genera el aleatorio y otorga un número de intentos
     * @param dificultad
     * @return el número aleatorio según dificultad
     */
    public int generarSecreto(int dificultad) {
        
        Random rnd = new Random();
        int numeroSecreto = 0;
        switch (dificultad) {
            //dificulad 1 = fácil
            case 1:
                numeroSecreto = rnd.nextInt(10) + 1;
                this.numeroIntentos = 3;
                this.dificultad = "Fácil";
                break;
            //dificultad 2 = media
            case 2:
                numeroSecreto = rnd.nextInt(100) + 1;
                this.numeroIntentos = 5;
                this.dificultad = "Media";
                break;
            //dificultad 3 = díficil
            case 3:
                numeroSecreto = rnd.nextInt(1000) + 1;
                this.numeroIntentos = 7;
                this.dificultad = "Díficil";
                break;
            //dificultad 4 = Leyenda
            case 4:
                numeroSecreto = rnd.nextInt(10000) + 1;
                this.numeroIntentos = 10;
                this.dificultad = "Leyenda";
                break;
        }
        return numeroSecreto;
    }
    
    /**
     * Método sobre el que se basa la partida, comprobando si se acierta o falla y restando los intentos
     * @param numeroSecreto es decir, el número que se tiene que adivinar
     * @param numeroUsuario el número que el usuario cree que es
     * @return respuesta de si ha acerteado, el número es menor o mayor, y cuando ha pérdido
     */
    public String proximidadNumeros (int numeroSecreto, int numeroUsuario) {

        String respuesta;
        if (numeroSecreto == numeroUsuario) {
            respuesta = "Enhorabuena!!! Has acertado el número secreto.";
            this.numeroIntentos = 0;
            this.estado = true; //Ganada
        }else {
            respuesta = (numeroSecreto < numeroUsuario) 
                    ? "El número secreto es menor a " + numeroUsuario
                    : "El número secreto es mayor a " + numeroUsuario;
            this.numeroIntentos--;
            if(this.numeroIntentos == 0){
                respuesta = "Has pérdido el número secreto era: " + numeroSecreto;
                this.estado = false; //Pérdida
            }
        }
        return respuesta;
     }
    
    /**
     * Método que contiene el estado de la partida actual
     * @return 
     */
    @Override
    public String toString() {
        
        String estadoStr = (estado == true) ? "Ganada" : "Pérdida";
        return "Estado: " + estadoStr + ", " + "Dificultad: " + dificultad;
    }
    
    /**
     * Se crean los getters y setters
     * @return 
     */

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public int getNumPartida() {
        return numPartida;
    }

    public void setNumPartida(int numPartida) {
        this.numPartida = numPartida;
    }
    
    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNumeroIntentos() {
        return numeroIntentos;
    }

    public void setNumeroIntentos(int numeroIntentos) {
        this.numeroIntentos = numeroIntentos;
    }
}
