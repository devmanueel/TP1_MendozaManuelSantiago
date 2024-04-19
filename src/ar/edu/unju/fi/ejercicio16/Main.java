package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leeScanner = new Scanner(System.in);
		
		String [] arregloNombres = new String[5];
		
		System.out.println("Ingrese 5 Nombres: ");
		
		for (int i = 0; i < arregloNombres.length; i++) {
			System.out.println("Nombre "+ (i + 1)+" : ");
			arregloNombres[i] = leeScanner.nextLine();
			if (!arregloNombres[i].matches("^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]+$")) { //valida que se ingrese solo nombre que incluyen espacios
				System.out.println("El nombre Contiene caracteres invalidos Vuelva a Ingresar los valores");
				i--; //en caso de salir error reduce el indice para que el el siguiente recorrido vuelva al valor donde dio error
			}
			
		}
		
		 // Muestra los valores del arreglo
        System.out.println("Valores guardados en el arreglo:");
        int indice = 0;
        while (indice < arregloNombres.length) {
            System.out.println(arregloNombres[indice]);
            indice++;
        }
        
     // Muestra el tamaño del arreglo
        System.out.println("Tamaño del arreglo: " + arregloNombres.length);
        
        byte indiceEliminar;
        do {
            System.out.print("Ingrese el índice del elemento a eliminar (0-4): ");
            indiceEliminar = leeScanner.nextByte();
        } while (indiceEliminar < 0 || indiceEliminar >= arregloNombres.length);
        
        
     // Eliminar el elemento del arreglo
        for (int i = (int) indiceEliminar; i < arregloNombres.length - 1; i++) {
        	arregloNombres[i] = arregloNombres[i + 1];
        }
        arregloNombres[arregloNombres.length - 1] = ""; // Asignar espacio en blanco al último elemento asegura la eleminacion

        // Mostrar el arreglo actualizado
        System.out.println("Arreglo después de eliminar el elemento:");
        for (String nombre : arregloNombres) {   	
            System.out.println(nombre);
        }
        
        
        leeScanner.close();
	}

}
