/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitacora;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Christian Novo Sacramento
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Todas las variables utilizadas
        boolean continuar = true;
        int opcion;
        GestorProyectos gestorProyectos = new GestorProyectos();
        Proyecto proyecto = new Proyecto();
        String cabecera, cuerpo;
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
            System.out.println("|| 3. Consultar datos  ||");
            System.out.println("|| 4. Salir            ||");
            System.out.println("=========================");
            try {
                System.out.printf("Opción: ");
                opcion = sc.nextInt(); sc.nextLine();
                while (opcion < 1 || opcion > 4) { //Corrige la opción
                    System.out.println("Upss, debe seleccionar un número del 1 al 4");
                    System.out.printf("Nueva Opción: ");
                    opcion = sc.nextInt();sc.nextLine();
                }
                
                switch (opcion) {
                    case 1: 
                        System.out.printf("Nombre del Proyecto: ");
                        nombreProyecto = sc.nextLine();
                        System.out.println("Descripción del Proyecto: ");
                        descripcionProyecto = sc.nextLine();
                        proyecto = new Proyecto(nombreProyecto,descripcionProyecto);
                        gestorProyectos.anyadirProyecto(nombreProyecto, proyecto);
                        gestorProyectos.ordenarProyectos();//Ordena los proyectos así solo lo hace una vez
                        break;
                    case 2: 
                        System.out.printf("Cabecera: ");
                        cabecera = sc.nextLine();
                        System.out.println("Cuerpo: ");
                        cuerpo = sc.nextLine();
                        Anotacion anotacion = new Anotacion(cabecera,cuerpo);
                        proyecto.anyadirAnotacion(cabecera, anotacion);
                        proyecto.ordenarAnotaciones();
                        break;
                    case 3:
                        System.out.println("---------------------");
                        System.out.println("- CONSULTA DE DATOS -");
                        System.out.println("---------------------");
                        System.out.println("Listado de Proyectos: ");
                        System.out.println("----------------------");
                        //New Feature
                        //gestorProyectos.ordenarProyectos(); //llama al método para ordenarlos //Hecho arriba
                        for ( Map.Entry<String, Proyecto> claves : gestorProyectos.getProyectoOrdenados() ){
                            System.out.println(claves.getKey());
                        }
                        //@Deprecade
                        /*
                        Set<String> claves = gestorProyectos.getProyectos().keySet();
                        for (String clave : claves) { //Recorre el hasmap de proyectos en busca de las claves
                            System.out.println( "-" + clave );
                        }
                        */
                        System.out.println("\n¿Qué proyecto quieres ver?");
                        nombreProyecto = sc.nextLine();
                        System.out.println( gestorProyectos.getProyectos().get(nombreProyecto));

                        System.out.println("------------------------------------------------------------");
                        System.out.println("Listado de Anotaciones del proyecto " + nombreProyecto);
                        System.out.println("------------------------------------------------------------");
                        for (Map.Entry<String,Anotacion> claves : proyecto.getAnotacionesOrdenadas()) {
                            System.out.println(claves.getKey());
                        }
                        
                        //Recorre el listado de anotaciones en busca de las claves
                        /* @ Deprecated
                        claves = gestorProyectos.getProyectos().get(nombreProyecto).getAnotaciones().keySet();
                        for (String clave : claves) { 
                            System.out.println("-" + clave);
                        }
                        */
                        System.out.println("\n¿Qué anotación deseas ver?");
                        nombreAnotacion = sc.nextLine();
                        System.out.println( "\n" + gestorProyectos.getProyectos().get(nombreProyecto).getAnotaciones().get(nombreAnotacion)+ "\n" );
                        break;
                    case 4: 
                        continuar = false;
                }
            }catch (InputMismatchException e) {
                System.out.println("Error!!! " + "( No se ha introducido un número )"); 
                continuar = true;sc.nextLine(); //Limpia el buffer
            }
        }
    }
}
