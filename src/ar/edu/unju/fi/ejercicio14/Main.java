package ar.edu.unju.fi.ejercicio14;

import java.time.Year;
import java.util.Iterator;
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
            	
        } while (tamañoArray <= 3 || tamañoArray >= 10); // vuelve a pedir en caso de que el valor sea incorrecto
        
        int[] arreglo = new int[tamañoArray];

        // ingreso de valores para cada posición del arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese un número entero para la posición " + i + ": ");
            arreglo[i] = leerScanner.nextInt();
        }
        
        // Mostrar avlores de arreglo
        System.out.println("Valores de cada posición del arreglo:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Posición " + i + ": " + arreglo[i]);
        }

        // calcula la suma de todos los elementos del arreglo
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        System.out.println("Suma de todos los valores del arreglo es: " + suma);
        
        leerScanner.close();
	}

}
