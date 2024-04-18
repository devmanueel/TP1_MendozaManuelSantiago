package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      
        int[] enteros = new int[8];
        
        // ingreso de valores
        for (int i = 0; i < enteros.length; i++) {
            System.out.print("Ingrese un numero entero para la posición " + i + ": ");
            enteros[i] = leer.nextInt();
        } 
        // Mostrar valores
        System.out.println("******** Elementos del arreglo ***************");
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Índice: " + i + ", Valor: " + enteros[i]);
        }
        leer.close();
	}

}
