package ar.edu.unju.fi.ejercicio09.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio09.model.Producto;

public class Main {

	public static void main(String[] args) {
		// Se aplico El patrón de diseño Singleton mensionado en la clase 11/04/24
		
	Scanner leerScanner = new Scanner(System.in);	
	Producto producto;
	
	for(int i=1;i<=3;i++) {
		
		producto=new Producto();
		System.out.println("***************************************");
		System.out.println("Ingrese los datos del producto °N "+i);
		System.out.println("ingrese Nombre del Producto: ");
		String nom=leerScanner.nextLine();
		producto.setNombre(nom);
		System.out.println("ingrese Codigo del Producto: ");
		int cod=leerScanner.nextInt();
		producto.setCodigo(cod);
		System.out.println("ingrese Precio del Producto: ");
		double precio=leerScanner.nextDouble();
		producto.setPrecio(precio);
		System.out.println("Ingrese el descuento Entre 0 y 50 porciento: ");
		int descuento=leerScanner.nextInt();
		producto.setDescuento(descuento);
		leerScanner.nextLine();
		//metodo para motrar datos e ahorar el exeso de codigo
		mostrarDatos(producto);
		}
	
	leerScanner.close();
	}
	private static void mostrarDatos(Producto producto) {
		System.out.println("Nombre Producto: "+producto.getNombre());
		System.out.println("Codigo de Producto: "+producto.getCodigo());
		System.out.println("Precio: $"+producto.getPrecio());
		System.out.println("Descuento: "+producto.getDescuento()+"%");
		System.out.println("Precio Con Descuento: $"+producto.calcularDescuento());
	}
	
}
