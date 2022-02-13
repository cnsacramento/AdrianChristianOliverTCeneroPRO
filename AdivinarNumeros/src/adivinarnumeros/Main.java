/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinarnumeros;

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
        Partida partida = new Partida();
        int dificultad; 
        boolean continuar = true;
        int opcion = 0;
        int numeroUsuario, numeroSecreto;
        String proximidad;
        
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("+ JUEGO DE ADIVINAR NÚMEROS +");
        System.out.println("+++++++++++++++++++++++++++++");
        
        while(continuar) { 
            
            System.out.println("\n==========================");
            System.out.println("||         MENÚ          =");
            System.out.println("==========================");
            System.out.println("|| 1. Jugar Partida     ||");
            System.out.println("|| 2. Salir del juego   ||");
            System.out.println("==========================");
            System.out.printf("Opción: ");
            opcion = sc.nextInt();
            while (opcion < 1 || opcion > 2) { //Corrige la opción
                System.out.println("ERROR!!! (Debe seleccionar un número del 1 al 2)");
                System.out.printf("Opción: ");
                opcion = sc.nextInt();
            }
                        
            switch (opcion) {
                case 1: 
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
                        System.out.println("Nivel no disponible. "
                                + "(Seleccione un nivel del 1 al 4)");
                        System.out.printf("Dificultad: ");
                        dificultad = sc.nextInt();
                    }
                    //Añadir el número de partida
                    numeroSecreto = partida.generarSecreto(dificultad);
                    System.out.println("Número secreto generado. ¿Qué número crees que sea?");
                    System.out.println(numeroSecreto);
                    
                    while (partida.getNumeroIntentos() > 0) {
                        System.out.println("Intentos restantes:  " + partida.getNumeroIntentos());
                        System.out.printf("Número: ");
                        numeroUsuario = sc.nextInt();
                        proximidad = partida.proximidadNumeros(numeroSecreto, numeroUsuario);
                        System.out.println(proximidad);
                    }
                    break;
                case 2: 
                    continuar = false;
                    break;
            }
        }        
    }
}
