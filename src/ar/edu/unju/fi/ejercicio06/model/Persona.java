package ar.edu.unju.fi.ejercicio06.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private Long dni;
	private String nombre;
	private LocalDate FechaNacimiento;
	private String provincia;
	
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	 
	
	public Persona(Long dni, String nobmre, LocalDate fechaNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nobmre;
		FechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	
	public Persona(Long dni, String nobmre, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nobmre;
		FechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}
	
	public int calcularEdad(LocalDate fech) {
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fech, fechaActual);
		return periodo.getYears();
	}
	
	public boolean mayorEdad(int edad) {
		boolean bandera;
		if(edad>18) {
			bandera=true;
		}else {
			bandera=false;
		}
		return bandera;
	}

	public void mostrarDatos(int edad, boolean band) {
		if (band == true) {
			System.out.println("DNI: "+this.dni+"\nNombre: "+this.nombre+"\nFecha de nacimiento: "+this.FechaNacimiento
			+"\nProvincia: "+this.provincia+"\nEdad: "+edad+"Años "+"\nLa persona es mayor de edad");
			
		}else {
			System.out.println("DNI: "+this.dni+"\nNombre: "+this.nombre+"\nFecha de nacimiento: "+this.FechaNacimiento
					+"\nProvincia: "+this.provincia+"\nEdad: "+edad+"Años "+"\nLa persona no es mayor de edad");
		}
	}

	
	
	
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
}
