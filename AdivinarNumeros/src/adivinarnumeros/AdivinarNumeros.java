/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinarnumeros;

import java.util.Scanner;

/**
 *
 * @author Christian Novo Sacramento 1ºDAM
 */
public class AdivinarNumeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("|| JUEGO DE ADIVINAR NÚMEROS ||");
        System.out.println("===============================");

        String continuar = ""; //Sirve para salir del bucle
        int opcion = 0; //Sirve para elegir una opción del menu
        int dificultad = 0; //Selecciona el nivel de dificultad
        String alias = "";
        while (!continuar.equals("n")) {
            //Se genera el menú con las distintas opciones
            System.out.println("*******************************");
            System.out.println("*            MENÚ             *");
            System.out.println("*******************************");
            System.out.println("* 1. Crear nuevo jugador      *");
            System.out.println("* 2. Jugar Partida            *");
            System.out.println("* 3. Ver el historial jugador *");
            System.out.println("* 4. Ver el ranking jugadores *");
            System.out.println("*******************************");
            opcion = sc.nextInt(); //Recoge la opción seleccionada
            if (opcion < 1 && opcion > 4) { //Entrega error en caso de que no se ponga un número del 1 al 4
                System.out.println("ERROR!!! (Debe seleccionar un número del 1 al 4) ");
                System.out.printf("Opción: ");
                opcion = sc.nextInt();
            }

            switch (opcion) { //Realiza la opción seleccionada
                case 1: 
                    System.out.println("¿Qué alias deseas ponerte?");
                    alias = sc.nextLine();
                    break;
                case 2:
                    System.out.println("¿Qué nivel de dificultad deseas?");
                    System.out.println("1. Fácil\n" + "2. Medio\n" + "3. Díficil\n" 
                            + "4. Leyenda");
                    dificultad = sc.nextInt();
                    while (dificultad < 1 || dificultad > 4) { //Corrige si la dificultad está mal indicada
                        System.out.println("ERROR!!! (Debe seleccionar una dificultad del 1 al 4)");
                        dificultad = sc.nextInt();sc.nextLine();
                    }
                    break;
                case 3: break;
                case 4: break;
            }

            System.out.println("¿Desea continuar? S/N"); //Se crea la salida o continuación del menú
            continuar = sc.nextLine().toLowerCase();
            while (!continuar.equals("s") || !continuar.equals("n")) { //En caso de no pulsar S/N manda error
                System.out.println("ERROR!!! (Debe introducir \"S\" o \"N\") ");
                System.out.printf("Elección: ");
                continuar = sc.nextLine().toLowerCase();
            }

        }
    }

}
