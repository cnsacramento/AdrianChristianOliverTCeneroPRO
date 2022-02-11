/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitacora;

import java.util.HashMap;
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
        Proyecto proyecto = null;
        Anotacion anotacion = null;
        String cabecera, cuerpo;
        HashMap<String,Anotacion> proyectoAnotaciones = new HashMap<String,Anotacion>();
        String nombreAnotacion;
        String nombreProyecto, descripcionProyecto;
        
        System.out.println("////////////////////////");
        System.out.println("// BITÁCORA PROYECTOS //");
        System.out.println("////////////////////////");
        
        while (continuar) {
            System.out.println("=========================");
            System.out.println("||        MENÚ         ||");
            System.out.println("=========================");
            System.out.println("|| 1. Crear proyecto   ||");
            System.out.println("|| 2. Crear anotación  ||");
            System.out.println("|| 3. Buscar anotación ||");
            System.out.println("|| 4. Mostrar proyect  ||");
            System.out.println("|| 5. Salir            ||");
            System.out.println("========================");
            System.out.printf("Opción: ");
            opcion = sc.nextInt(); sc.nextLine();
            while (opcion < 1 || opcion > 5) { //Corrige la opción
                System.out.println("Upss, debe seleccionar un número del 1 al 5");
                System.out.printf("Nueva Opción: ");
                opcion = sc.nextInt();sc.nextLine();
            }
            if (opcion == 5) { //Finaliza el programa
                continuar = false;
            }
            switch (opcion) {
                case 1: 
                    System.out.printf("Nombre del Proyecto: ");
                    nombreProyecto = sc.nextLine();
                    System.out.println("Descripción del Proyecto: ");
                    descripcionProyecto = sc.nextLine();
                    proyecto = new Proyecto(nombreProyecto,descripcionProyecto, proyectoAnotaciones);
                    //HashMap x = proyecto.getAnotaciones();
                    break;
                case 2: 
                    System.out.printf("Cabecera: ");
                    cabecera = sc.nextLine();
                    System.out.println("Cuerpo: ");
                    cuerpo = sc.nextLine();
                    anotacion = new Anotacion(cabecera,cuerpo);
                    proyectoAnotaciones.put(cabecera, anotacion);
                    break;
                case 3: 
                    System.out.println("¿Nombre de la anotación a buscar?");
                    nombreAnotacion = sc.nextLine();
                    System.out.println(proyectoAnotaciones.get(nombreAnotacion));
                    break;
                case 4: 
                    System.out.println("Mostrar proyecto: ");
                    System.out.println(proyecto);
            }
        }
    }
}
