package ar.edu.unju.fi.ejercicio07.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio07.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese nombre del Empeado: ");
		String nombreEmpleado = entrada.nextLine();
		System.out.println("Ingrese legajo: ");
		int legajo = entrada.nextInt();
		System.out.println("Ingrese Salario: ");
		double salario = entrada.nextDouble();
		Empleado empleado = new Empleado(nombreEmpleado, legajo, salario);
		empleado.mostrarDatos();
		empleado.aumento();
		empleado.mostrarDatos();
		
		
	}

}
