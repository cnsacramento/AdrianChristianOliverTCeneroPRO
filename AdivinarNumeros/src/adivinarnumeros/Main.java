/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinarnumeros;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Christian Novo Sacramento 1ºDAM
 */
public class Main {
    
     public static void main(String[] args) {
        
         //Se declaran las variables
        Scanner sc = new Scanner(System.in);
        Partida partida;
        Jugador jugador = new Jugador();
        Ranking ranking = new Ranking();
        int dificultad; 
        boolean continuar = true;
        int opcion;
        int numeroUsuario, numeroSecreto;
        String proximidad;
        String alias;
        
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("+ JUEGO DE ADIVINAR NÚMEROS +");
        System.out.println("+++++++++++++++++++++++++++++");
        while(continuar) {
            try {
                 System.out.println("\n==========================");
            System.out.println("||         MENÚ          =");
            System.out.println("==========================");
            System.out.println("|| 1. Nuevo Jugador     ||");
            System.out.println("|| 2. Jugar Partida     ||");
            System.out.println("|| 3. Ver historial     ||");
            System.out.println("|| 4. Ver ranking       ||");
            System.out.println("|| 5. Salir del juego   ||");
            System.out.println("==========================");
            System.out.printf("Opción: ");
            opcion = sc.nextInt();sc.nextLine();
            while (opcion < 1 || opcion > 5) { //Corrige la opción
                System.out.println("ERROR!!! (Debe seleccionar un número del 1 al 5)");
                System.out.printf("Opción: ");
                opcion = sc.nextInt();sc.nextLine();
            }

            switch (opcion) {
                case 1: 
                    System.out.println("¿Qué alias deseas ponerte?");
                    alias = sc.nextLine();
                    jugador = new Jugador(alias);
                    System.out.println("Jugador " + alias + " creado !!!!");
                    break;
                case 2: 
                    ranking.anyadirJugador(jugador);
                    partida = new Partida();
                    System.out.println("\n===========================");
                    System.out.println("|| NIVELES DE DIFICULTAD ||");
                    System.out.println("===========================");
                    System.out.println("|| 1. Fácil              ||");
                    System.out.println("|| 2. Medio              ||");
                    System.out.println("|| 3. Díficil            ||");
                    System.out.println("|| 4. Leyenda            ||");
                    System.out.println("===========================");
                    System.out.printf("Díficultad: ");
                    dificultad = sc.nextInt();
                    while (dificultad < 1 || dificultad > 4) { //Corrige la dificultad
                        System.out.println("Nivel no disponible."
                                + "(Seleccione un nivel del 1 al 4)");
                        System.out.printf("Dificultad: ");
                        dificultad = sc.nextInt();
                    }
                    //Añadir el número de partida
                    numeroSecreto = partida.generarSecreto(dificultad);
                    System.out.println("Número secreto generado. ¿Qué número crees que sea?");
                    while (partida.getNumeroIntentos() > 0) {
                        System.out.println("Intentos restantes:  " + partida.getNumeroIntentos());
                        System.out.printf("Número: ");
                        numeroUsuario = sc.nextInt();
                        proximidad = partida.proximidadNumeros(numeroSecreto, numeroUsuario);
                        System.out.println(proximidad);
                    }
                    jugador.estadisticaPartida(partida.getEstado());
                    jugador.anyadirPartida(partida);
                    break;
                case 3: 
                    System.out.println("Estadísticas: ");
                    System.out.println(jugador);
                    //Por si se quiere mostrar 1 a 1 cada partida
                    if ( !jugador.getPartidas().isEmpty() ) {
                        System.out.println("\nListado de partidas jugadas:");
                        for (int i = 0; i < jugador.getPartidas().size(); i++) {
                            System.out.print("Partida " + (i+1) + ": ");
                            System.out.println(jugador.getPartidas().get(i));
                        }
                    } 
                    break;
                case 4: 
                    ranking.ordenarRanking(); //Llama al método para que meta a los jugadores en el ranking
                    System.out.println("El ranking de los 10 mejores jugadores");
                    int posicion = 1;
                    Integer partidasGanadas;
                    String nombre;
                    for (Map.Entry<Integer, String> listaJugador : ranking.getListaJugadores().entrySet()) {
                        partidasGanadas = listaJugador.getKey();
                        nombre = listaJugador.getValue();
                        System.out.println(posicion + " Jugador: " + nombre + " Partidas ganadas: " +  partidasGanadas);
                        posicion++;
                    }
                    break;
                case 5: 
                    continuar = true;
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. Número desconocido"); sc.nextLine();
            }
        }
    }
}
