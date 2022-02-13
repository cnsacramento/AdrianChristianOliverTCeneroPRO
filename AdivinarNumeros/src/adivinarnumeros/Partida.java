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
    private String estado;
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
    
     public String proximidadNumeros (int numeroSecreto, int numeroUsuario) {
         
         String respuesta;
         if (numeroSecreto == numeroUsuario) {
             respuesta = "Enhorabuena!!! Has acertado el número secreto.";
             this.numeroIntentos = 0;
             this.estado = "Ganada";
         }else {
             respuesta = (numeroSecreto < numeroUsuario) 
                     ? "El número secreto es menor a " + numeroUsuario
                     : "El número secreto es mayor a " + numeroUsuario;
             this.numeroIntentos--;
             if(this.numeroIntentos == 0){
                 respuesta = "Has pérdido el número secreto era: " + numeroSecreto;
                 this.estado = "Pérdida";
             }
         }
         return respuesta;
     }

    @Override
    public String toString() {
        
        return "Estado: " + estado + ", " + "Dificultad: " + dificultad;
    } 

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
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumeroIntentos() {
        return numeroIntentos;
    }

    public void setNumeroIntentos(int numeroIntentos) {
        this.numeroIntentos = numeroIntentos;
    }
}
