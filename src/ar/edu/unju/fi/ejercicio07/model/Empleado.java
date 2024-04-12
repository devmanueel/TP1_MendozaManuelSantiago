package ar.edu.unju.fi.ejercicio07.model;



public class Empleado {
	private String nombre;
	private int legajo;
	private double salario;
	private final double SALARIO_MINIMO= 210000.00;
	private final double AUMENTO= 20000.00;
	
	
	public Empleado(String nombre, int legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.salario = salario;
		if (salario>=SALARIO_MINIMO) {
			this.salario = salario;
		} else {
			if (salario<=SALARIO_MINIMO) {
				this.salario=SALARIO_MINIMO;
			}
		}	
	}
	
	public void	mostrarDatos() {
			
			System.out.println("Nombre del Empleado: " + nombre);
	        System.out.println("Legajo: " + legajo);
	        System.out.println("Salario: $" + salario);
	        System.out.println("\n");
		}
	
	public void aumento(){
		setSalario(AUMENTO+salario);		
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSALARIO_MINIMO() {
		return SALARIO_MINIMO;
	}

	public double getAUMENTO() {
		return AUMENTO;
	}
	
}
