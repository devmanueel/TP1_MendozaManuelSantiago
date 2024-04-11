package ar.edu.unju.fi.ejercicio06.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio06.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// primer objeto
		Persona per1 = new Persona();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese DNI: ");
		long dni = scanner.nextLong();
		per1.setDni(dni);
		
		System.out.println("Ingrese el Nombre: ");
		String nombre = scanner.next();
		per1.setNombre(nombre);
		
		System.out.println("Ingrese su fecha de nacimiento en formato YYYY-MM-DD:: ");
		String fechaNacimiento = scanner.next();
		LocalDate fechaNacimientoConver = LocalDate.parse(fechaNacimiento);
		per1.setFechaNacimiento(fechaNacimientoConver);
		
		System.out.println("Ingrese Provincia: ");
		String provincia = scanner.next();
		per1.setProvincia(provincia);
		
		//muestra de datos de la primer persona
		int edadPersona1= per1.calcularEdad(fechaNacimientoConver);
		boolean esMayorEdad = per1.mayorEdad(edadPersona1);
		per1.mostrarDatos(edadPersona1, esMayorEdad);
		//segundo objeto
		
		System.out.println("*****************************************");
		System.out.println("Ingrese DNI: ");
		long dni2 = scanner.nextLong();
		
		System.out.println("Ingrese el Nombre: ");
		String nombre2 = scanner.next();
		
		System.out.println("Ingrese su fecha de nacimiento en formato YYYY-MM-DD:: ");
		String fechaNacimiento2 = scanner.next();
		LocalDate fechaNacimientoConver2 = LocalDate.parse(fechaNacimiento2);
		
		System.out.println("Ingrese Provincia: ");
		String provincia2 = scanner.next();
		
		Persona per2 = new Persona(dni2, nombre2, fechaNacimientoConver2, provincia2);
		//muestra de datos de la primer persona
		int edadPersona2= per2.calcularEdad(fechaNacimientoConver2);
		boolean esMayorEdad2 = per2.mayorEdad(edadPersona2);
		per2.mostrarDatos(edadPersona2, esMayorEdad2);
		
		
		//tercer objeto
		System.out.println("*****************************************");
		System.out.println("Ingrese DNI: ");
		long dni3 = scanner.nextLong();
		
		System.out.println("Ingrese el Nombre: ");
		String nombre3 = scanner.next();
		
		System.out.println("Ingrese su fecha de nacimiento en formato YYYY-MM-DD:: ");
		String fechaNacimiento3 = scanner.next();
		LocalDate fechaNacimientoConver3 = LocalDate.parse(fechaNacimiento3);
		
		Persona per3 = new Persona(dni3, nombre3, fechaNacimientoConver3);
		//muestra de datos de la primer persona
		int edadPersona3= per3.calcularEdad(fechaNacimientoConver3);
		boolean esMayorEdad3 = per3.mayorEdad(edadPersona3);
		per3.mostrarDatos(edadPersona3, esMayorEdad3);
		
		
		scanner.close();
	}

}
