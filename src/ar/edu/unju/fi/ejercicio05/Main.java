package ar.edu.unju.fi.ejercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leerScanner = new Scanner(System.in);		
		
		System.out.println("Ingrese un numero: ");
		
		int numero = leerScanner.nextInt();
		int produc=0;
		
		if(numero>=1 && numero<=9) {
				for (int i=0;i<=10;i++) {
				produc=numero*i;
				System.out.println(numero+" x "+ i +" = "+produc);
			}
		}else {
			System.out.println("ingrese numeros entre 1 y 9 ");
		}
		
	}

}
