package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int k=1;
		Pizza pizza = new Pizza();
		
		while(k<=3) {
			int diametro=ingresarDiametro(entrada);
			boolean ingrediente=ingresarIngrediente(entrada);
			pizza.setDiametro(diametro);
			pizza.setIngredientesEspeciales(ingrediente);
			pizza.calcularPrecio();
			pizza.calcularArea();
			System.out.println("\n** Pizza " + k + " ** \n" + pizza + "\n");
			k++;
		}
		entrada.close();
	}

	private static int ingresarDiametro(Scanner entrada) {
		boolean band=false;
		int dia=0;
		while(band==false) {
			System.out.println("Ingrese diametro (valores permitidos 20-30-40):");
			dia = entrada.nextInt();
			band = dia==20 || dia==30 || dia==40;
			if (band==false) {
				System.out.println("ERROR en el ingreso de datos");
			}
		}
		return dia;
	}

	private static boolean ingresarIngrediente(Scanner entrada) {
		boolean band=false, ing=false;
		while(band==false) {
			System.out.println("¿Desea ingredientes especiales?: (SI/NO)");
			String especial = entrada.next();
			if (especial.equalsIgnoreCase("si")) {
				band = true;
				ing = true;
			}
			else {
				if (especial.equalsIgnoreCase("no")) {
					band = true;
					ing = false;
				}
				else {
					System.out.println("ERROR en el ingreso de datos");
				}
			}
		}
		return ing;
	}

}
