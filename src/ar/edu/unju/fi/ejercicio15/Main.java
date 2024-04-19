package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leerScanner = new Scanner(System.in);
		//ingreso de valores entre 3 y 10
        int tamañoArray;
        do {
            System.out.print("Ingrese un número entero entre 3 y 10: ");
            tamañoArray = leerScanner.nextInt();
            //comnica que ingreso un valor invorrecto 
            if (tamañoArray < 3 || tamañoArray > 10) {
                System.out.println("Valor ingresado fuera del rango permitido. Por favor, intente nuevamente.");
            }
            	
        } while (tamañoArray < 3 || tamañoArray > 10); // vuelve a pedir en caso de que el valor sea incorrecto
        
        String [] arregloNombres = new String[tamañoArray];

        // ingreso de valores para cada posición del arreglo
        for (int i = 0; i < arregloNombres.length; i++) {
            System.out.print("Ingrese un Nombre para la posición " + (i+1) + ": ");
            arregloNombres[i] = leerScanner.next();
        }
        
        // Mostrar avlores de arreglo
        System.out.println("Valores de cada posición del arreglo:");
        for (int i = 0; i < arregloNombres.length; i++) {
            System.out.println("Posición " + (i+1) + ": " + arregloNombres[i]);
        }
        
     // muestra el contenido del array pero comenzando con la última posición del array
        System.out.println("\n *************Nombres desde el final del array: *************");
        for (int i = arregloNombres.length - 1; i >= 0; i--) {
            System.out.println(arregloNombres[i]);
        }
        
        leerScanner.close();

	}

}
