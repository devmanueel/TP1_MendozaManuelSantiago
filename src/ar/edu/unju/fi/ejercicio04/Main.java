package ar.edu.unju.fi.ejercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Ingrese un numero entre 0 y 10 para calcular su factorial: ");
        int numero = scanner.nextInt(); 

        if (numero < 0 || numero > 10) {
            System.out.println("El número a ingresar debe estar em el rango de [0, 10].");
        } else {
            int factorial = 1;
            int cont = 1;

            while (cont <= numero) {
            	factorial = factorial * cont;
                cont++;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    
	}

}
