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
    
    public static int partidaAleatorio(int dificultad) {
        
        Random rnd = new Random();
        int numeroSecreto = 0;
        switch (dificultad) {
            //dificulad 1 = fácil
            case 1:
                numeroSecreto = rnd.nextInt(10) + 1;
                break;
            //dificultad 2 = media
            case 2:
                numeroSecreto = rnd.nextInt(100) + 1;
                break;
            //dificultad 3 = díficil
            case 3:
                numeroSecreto = rnd.nextInt(1000) + 1;
                break;
            //dificultad 4 = Leyenda
            case 4:
                numeroSecreto = rnd.nextInt(10000) + 1;
                break;
        }
        return numeroSecreto;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("|| JUEGO DE ADIVINAR NÚMEROS ||");
        System.out.println("===============================");

        String continuar = ""; //Sirve para salir del bucle
        int opcion = 0; //Sirve para elegir una opción del menu
        int dificultad = 0; //Selecciona el nivel de dificultad
        String alias = "";
        int numeroSecreto = 0;
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
            System.out.printf("Opción: ");
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
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("************************************");
                    System.out.println("* ¿Qué nivel de dificultad deseas? *");
                    System.out.println("* 1. Fácil\t\t\t   * \n" 
                            + "* 2. Medio\t\t\t   * \n" 
                            + "* 3. Díficil\t\t\t   * \n"
                            + "* 4. Leyenda\t\t\t   * ");
                    System.out.println("************************************");
                    System.out.printf("Dificultad: ");
                    dificultad = sc.nextInt();
                    sc.nextLine();
                    while (dificultad < 1 || dificultad > 4) { //Corrige si la dificultad está mal indicada
                        System.out.println("ERROR!!! (Debe seleccionar una dificultad del 1 al 4)");
                        dificultad = sc.nextInt();
                        sc.nextLine();
                    }
                    numeroSecreto = partidaAleatorio(dificultad); //Se genera el número aleatorio
                    System.out.println("El número secreto es: " + numeroSecreto); //Sólo para pruebas
                    int intentos = 0, numeroPropuesto;
                    if (dificultad == 1) {
                        intentos = 3;
                        while(intentos > 0) {
                            
                            System.out.println("Te quedan " + intentos + " intentos.\n");
                            System.out.printf("Escribe un número entre 1 y 10: ");
                            numeroPropuesto = sc.nextInt();sc.nextLine();
                            if (numeroPropuesto == numeroSecreto) {
                                System.out.println("¡¡¡ENHORABUENA!!! Has acertado el número");
                                intentos = 0;
                            }else { 
                                System.out.println( (numeroSecreto < numeroPropuesto) 
                                        ? "El número secreto es menor a " + numeroPropuesto 
                                        : "El número secreto es mayor a " + numeroPropuesto );
                                intentos--; 
                                if (intentos == 0) {
                                System.out.println("¡Has pérdido! El número era: " + numeroSecreto + "\n");
                                }
                            }
                        }
                    }else if (dificultad == 2) {
                        intentos = 5;
                        while(intentos > 0) {
                            System.out.println("Te quedan " + intentos + " intentos\n");
                            System.out.printf("Escribe un número entre 1 y 100: ");
                            numeroPropuesto = sc.nextInt();sc.nextLine();
                            if (numeroPropuesto == numeroSecreto) {
                                System.out.println("¡¡¡ENHORABUENA!!! Has acertado el número");
                                intentos = 0;
                            }else { 
                                System.out.println( (numeroSecreto < numeroPropuesto) 
                                        ? "El número secreto es menor a " + numeroPropuesto 
                                        : "El número secreto es mayor a " + numeroPropuesto );
                                intentos--; 
                                if (intentos == 0) {
                                System.out.println("¡Has pérdido! El número era: " + numeroSecreto);
                                }
                            }
                        }
                    }else if (dificultad == 3) {
                        intentos = 7;
                        while(intentos > 0) {
                            System.out.println("Te quedan " + intentos + " intentos\n");
                            System.out.printf("Escribe un número entre 1 y 1000: ");
                            numeroPropuesto = sc.nextInt();sc.nextLine();
                            if (numeroPropuesto == numeroSecreto) {
                                System.out.println("¡¡¡ENHORABUENA!!! Has acertado el número");
                                intentos = 0;
                            }else { 
                                System.out.println( (numeroSecreto < numeroPropuesto) 
                                        ? "El número secreto es menor a " + numeroPropuesto 
                                        : "El número secreto es mayor a " + numeroPropuesto );
                                intentos--; 
                                if (intentos == 0) {
                                System.out.println("¡Has pérdido! El número era: " + numeroSecreto);
                                }
                            }
                        }
                    }else if (dificultad == 4) {
                        intentos = 10;
                        while(intentos > 0) {
                            System.out.println("Te quedan " + intentos + " intentos\n");
                            System.out.printf("Escribe un número entre 1 y 10000: ");
                            numeroPropuesto = sc.nextInt();sc.nextLine();
                            if (numeroPropuesto == numeroSecreto) {
                                System.out.println("¡¡¡ENHORABUENA!!! Has acertado el número");
                                intentos = 0;
                            }else { 
                                System.out.println( (numeroSecreto < numeroPropuesto) 
                                        ? "El número secreto es menor a " + numeroPropuesto 
                                        : "El número secreto es mayor a " + numeroPropuesto );
                                intentos--; 
                                if (intentos == 0) {
                                System.out.println("¡Has pérdido! El número era: " + numeroSecreto);
                                }
                            }
                        }
                    }
                    break;
                case 3:

                    break;
                case 4:
                    break;
            }

            System.out.println("\n¿Desea continuar? S/N"); //Se crea la salida o continuación del menú
            System.out.printf("Elección: ");
            continuar = sc.nextLine().toLowerCase();

            while (!continuar.equals("s") && !continuar.equals("n")) { //En caso de no pulsar S/N manda error
                System.out.println("ERROR!!! (Debe introducir \"S\" o \"N\") ");
                System.out.printf("Elección: ");
                continuar = sc.nextLine().toLowerCase();
            }
        }
    }
}
