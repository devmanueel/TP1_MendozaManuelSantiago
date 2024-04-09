package ar.edu.unju.fi.ejercicio03;

import java.util.Scanner;

public class Main {
//Punto 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner leer = new Scanner(System.in);
	
	int num1;
	int resultado;
	System.out.println("ingrese Numero: ");
	num1 = leer.nextInt();
	
	//Determina si un numero es par o impar
	if ( num1 % 2 == 0) {
		resultado = num1 * 3;
		System.out.println("Numero: "+resultado);
	} else {
		resultado = num1 * 2;
		System.out.println("Numero: "+resultado);
	}
	
	}

}
