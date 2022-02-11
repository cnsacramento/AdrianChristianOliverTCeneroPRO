/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitacora;

import java.util.Scanner;

/**
 *
 * @author Christian Novo Sacramento
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int opcion;
        System.out.println("////////////////////////");
        System.out.println("// BITÁCORA PROYECTOS //");
        System.out.println("////////////////////////");
        
        while (continuar) {
            System.out.println("========================");
            System.out.println("||        MENÚ        ||");
            System.out.println("========================");
            System.out.println("|| 1. Crear proyecto  ||");
            System.out.println("|| 2. Crear anotación ||");
            System.out.println("|| 3. Salir           ||");
            System.out.println("========================");
            System.out.printf("Opción: ");
            opcion = sc.nextInt();
            while (opcion < 1 || opcion > 3) { //Corrige la opción
                System.out.println("Upss, debe seleccionar 1, 2 o 3");
                System.out.printf("Nueva Opción: ");
                opcion = sc.nextInt();
            }
            if (opcion == 3) { //Finaliza el programa
                continuar = false;
            }
            switch (opcion) {
                case 1: break;
                case 2: break;
            }
        }
    }
}
