package ar.edu.unju.fi.ejercicio12.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (formato dd/mm/yyyy): ");
        String fechaNacimientoStr = scanner.nextLine();
        String[] fechaNacimientoArray = fechaNacimientoStr.split("/");
        int dia = Integer.parseInt(fechaNacimientoArray[0]);
        int mes = Integer.parseInt(fechaNacimientoArray[1]) - 1; // Se resta 1 ya que en Calendar los meses comienzan desde 0
        int anio = Integer.parseInt(fechaNacimientoArray[2]);

        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(anio, mes, dia);
        
        Persona persona = new Persona(nombre, fechaNacimiento);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("\nDatos de la persona:");
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Fecha de nacimiento: "+dateFormat.format(persona.getFechaNacimiento().getTime()));
        System.out.println("Edad: "+persona.calcularEdad()+" años");
        System.out.println("Signo del zodiaco: "+persona.obtenerSignoZodiaco());
        System.out.println("Estacion: "+persona.obtenerEstacion());
        
        scanner.close();
    }
}
