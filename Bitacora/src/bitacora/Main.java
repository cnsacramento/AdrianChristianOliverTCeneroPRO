/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitacora;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

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
        //Todas las variables utilizadas
        boolean continuar = true;
        int opcion;
        GestorProyectos gestorProyectos = null;
        Proyecto proyecto = null;
        Anotacion anotacion = null;
        String cabecera, cuerpo;
        HashMap<String,Anotacion> proyectoAnotaciones = new HashMap<String,Anotacion>();
        String nombreAnotacion;
        String nombreProyecto, descripcionProyecto;
        HashMap<String,Proyecto> proyectos = new HashMap<String,Proyecto>();
        
        System.out.println("////////////////////////");
        System.out.println("// BITÁCORA PROYECTOS //");
        System.out.println("////////////////////////");
        
        while (continuar) {
            System.out.println("=========================");
            System.out.println("||        MENÚ         ||");
            System.out.println("=========================");
            System.out.println("|| 1. Crear proyecto   ||");
            System.out.println("|| 2. Crear anotación  ||");
            System.out.println("|| 3. Consultar datos  ||");
            System.out.println("|| 4. Salir            ||");
            System.out.println("========================");
            System.out.printf("Opción: ");
            opcion = sc.nextInt(); sc.nextLine();
            while (opcion < 1 || opcion > 4) { //Corrige la opción
                System.out.println("Upss, debe seleccionar un número del 1 al 5");
                System.out.printf("Nueva Opción: ");
                opcion = sc.nextInt();sc.nextLine();
            }
            if (opcion == 4) { //Finaliza el programa
                continuar = false;
            }
            switch (opcion) {
                case 1: 
                    System.out.printf("Nombre del Proyecto: ");
                    nombreProyecto = sc.nextLine();
                    System.out.println("Descripción del Proyecto: ");
                    descripcionProyecto = sc.nextLine();
                    proyecto = new Proyecto(nombreProyecto,descripcionProyecto, proyectoAnotaciones);
                    proyectos.put(nombreProyecto, proyecto);
                    gestorProyectos = new GestorProyectos(proyectos);
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
                    System.out.println("---------------------");
                    System.out.println("- CONSULTA DE DATOS -");
                    System.out.println("---------------------");
                    System.out.println("Listado de Proyectos: ");
                    System.out.println("----------------------");
                    HashMap listadoProyectos = gestorProyectos.getProyectos();
                    Set<String> claves = listadoProyectos.keySet();
                    for (String clave : claves) { //Recorre el hasmap en busca de las claves
                        System.out.println( "-" + clave );
                    }
                    System.out.println("\n¿Qué proyecto quieres ver?");
                    nombreProyecto = sc.nextLine();
                    System.out.println(listadoProyectos.get(nombreProyecto));
                    
                    System.out.println("\n" + "Listado de Anotaciones del proyecto " + nombreProyecto);
                    HashMap listadoAnotaciones = proyecto.getAnotaciones();
                    
                    claves = listadoAnotaciones.keySet();
                    for (String clave : claves) { 
                        System.out.println("-" + clave);
                    }
                    System.out.println("\n¿Qué anotación deseas ver?");
                    nombreAnotacion = sc.nextLine();
                    System.out.println( "\n" + listadoAnotaciones.get(nombreAnotacion) + "\n" );
                    break;
            }
        }
    }
}
