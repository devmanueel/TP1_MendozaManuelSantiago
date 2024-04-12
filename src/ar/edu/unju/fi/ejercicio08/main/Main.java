package ar.edu.unju.fi.ejercicio08.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio08.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leerScanner = new Scanner(System.in);
		CalculadoraEspecial calculadoraEspecial=new CalculadoraEspecial();
		
		System.out.println("ingrese el valor de n");
		int n = leerScanner.nextInt(); 
		calculadoraEspecial.setN(n);
		int sumatoria = calculadoraEspecial.calcularSumatoria();
		int productoria = calculadoraEspecial.calcularProductoria();
		System.out.println("Resultado Sumatoria: "+sumatoria+"\nResultado Productoria: "+productoria);
		
		leerScanner.close();
	}

}
