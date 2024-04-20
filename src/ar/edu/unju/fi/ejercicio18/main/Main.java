package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;



public class Main {

	public static void main(String[] args) {

		ArrayList<Pais> listadoPaises = new ArrayList<Pais>();
        ArrayList<DestinoTuristico> listadoDestinos = new ArrayList<DestinoTuristico>();

        // Precarga de países
        listadoPaises.add(new Pais(1, "Argentina"));
        listadoPaises.add(new Pais(2, "Brasil"));
        listadoPaises.add(new Pais(3, "Chile"));
        listadoPaises.add(new Pais(4, "Bolivia"));
        listadoPaises.add(new Pais(5, "Colombia"));
        listadoPaises.add(new Pais(6, "Ecuador"));
        listadoPaises.add(new Pais(7, "Peru"));
        listadoPaises.add(new Pais(8, "Uruguay"));
        listadoPaises.add(new Pais(9, "Venezuela"));

        Scanner leerScanner = new Scanner(System.in);
        
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1 – Alta de destino turístico");
            System.out.println("2 – Mostrar todos los destinos turísticos");
            System.out.println("3 – Modificar el país de un destino turístico");
            System.out.println("4 – Limpiar el ArrayList de destinos turísticos");
            System.out.println("5 – Eliminar un destino turístico");
            System.out.println("6 – Mostrar los destinos turísticos ordenados por nombre");
            System.out.println("7 – Mostrar todos los países");
            System.out.println("8 – Mostrar los destinos turísticos que pertenecen a un país");
            System.out.println("9 – Salir");
            System.out.print("Ingrese una opción: ");

            System.out.print("Ingrese su opción: ");
            opcion = leerScanner.nextInt();

            try {
                switch (opcion) {
                    case 1:
                    	altaDestinoTuristico(listadoDestinos, listadoPaises, leerScanner);
                        break;
                    case 2:
                    	mostrarDestinos(listadoDestinos);
                        break;
                    case 3:
                        modificarPais(listadoDestinos, listadoPaises, leerScanner);
                        break;
                    case 4:
                    	listadoDestinos.clear();
                        System.out.println("ArrayList de destinos turísticos limpiado.");
                        break;
                    case 5:
                        eliminarDestino(listadoDestinos, leerScanner);
                        break;
                    case 6:
                        mostrarDestinosOrdenados(listadoDestinos);
                        break;
                    case 7:
                        mostrarPaises(listadoPaises);
                        break;
                    case 8:
                        mostrarDestinosPorPais(listadoDestinos, leerScanner);
                        break;
                    case 9:
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente de nuevo.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                leerScanner.nextLine();
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error: " + e.getMessage());
            }
        } while (opcion != 9);
    
        leerScanner.close();
    }

    private static void altaDestinoTuristico(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises, Scanner scanner) {
    	        System.out.println("Ingrese el código del destino turístico:");
    	        int codigo = scanner.nextInt();
    	        scanner.nextLine(); 
    	        System.out.println("Ingrese el nombre del destino turístico:");
    	        String nombre = scanner.nextLine();
    	        System.out.println("Ingrese el precio del destino turístico:");
    	        double precio = scanner.nextDouble();
    	        scanner.nextLine(); 
    	        System.out.println("Ingrese el código del país:");
    	        int codigoPais = scanner.nextInt();
    	        Pais pais = new Pais();
    	        pais = null;
    	        for (Pais p : paises) {
    	            if (p.getCodigo() == codigoPais) {
    	                pais = p;
    	                break;
    	            }
    	        }
				//Después del bucle, comprueba si la variable pais sigue siendo null, lo que significa que no se encontró 
				//ningún país con el código especificado.
    	        if (pais == null) {
    	            System.out.println("El país no existe.");
    	            return;
    	        }
    	        System.out.println("Ingrese la cantidad de días:");
    	        int cantidadDias = scanner.nextInt();
    	        DestinoTuristico destino = new DestinoTuristico(codigo, nombre, precio, pais, cantidadDias);
    	        
    	        destinos.add(destino);
    	        System.out.println("Destino turístico agregado con éxito.");
    	  }
    

    private static void mostrarDestinos(ArrayList<DestinoTuristico> destinos) {
    	if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para mostrar.");
        } else {
            for (DestinoTuristico destino : destinos) {
                System.out.println(destino);
            }
        }
    }

    private static void modificarPais(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises, Scanner scanner) {
    	if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para modificar.");
            return;
        }

        System.out.println("Ingrese el código del destino turístico que desea modificar:");
        int codigoDestino = scanner.nextInt();
        scanner.nextLine();

        DestinoTuristico destinoModificar = null;
        for (DestinoTuristico destino : destinos) {
            if (destino.getCodigo() == codigoDestino) {
                destinoModificar = destino;
                break;
            }
        }

        if (destinoModificar == null) {
            System.out.println("El destino turístico no existe.");
            return;
        }

        System.out.println("Ingrese el nuevo código de país:");
        int nuevoCodigoPais = scanner.nextInt();
        Pais nuevoPais = null;
        for (Pais pais : paises) {
            if (pais.getCodigo() == nuevoCodigoPais) {
                nuevoPais = pais;
                break;
            }
        }

        if (nuevoPais == null) {
            System.out.println("El nuevo país no existe.");
            return;
        }

        destinoModificar.setPais(nuevoPais);
        System.out.println("País modificado correctamente para el destino turístico.");
    }

    private static void eliminarDestino(ArrayList<DestinoTuristico> destinos, Scanner scanner) {
    	if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para eliminar.");
            return;
        }

        System.out.println("Ingrese el código del destino turístico que desea eliminar:");
        int codigoDestino = scanner.nextInt();
        Iterator<DestinoTuristico> iter = destinos.iterator();
        while (iter.hasNext()) {
            DestinoTuristico destino = iter.next();
            if (destino.getCodigo() == codigoDestino) {
                iter.remove();
                System.out.println("Destino turístico eliminado correctamente.");
                return;
            }
        }
        System.out.println("El destino turístico no existe.");
    }

    private static void mostrarDestinosOrdenados(ArrayList<DestinoTuristico> destinos) {
    	if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para mostrar.");
            return;
        }

        Collections.sort(destinos, Comparator.comparing(DestinoTuristico::getNombre));
        

        System.out.println("Destinos turísticos ordenados por nombre:");
        for (DestinoTuristico destino : destinos) {
            System.out.println(destino);
        }
    }

    private static void mostrarPaises(ArrayList<Pais> paises) {
    	 if (paises.isEmpty()) {
             System.out.println("No hay países para mostrar.");
         } else {
             System.out.println("Listado de países:");
             for (Pais pais : paises) {
                 System.out.println(pais);
             }
         }
    }

    private static void mostrarDestinosPorPais(ArrayList<DestinoTuristico> destinos, Scanner scanner) {
    	 System.out.println("Ingrese el código del país:");
         int codigoPais = scanner.nextInt();

         boolean encontrado = false;
         System.out.println("Destinos turísticos para el país con código " + codigoPais + ":");
         for (DestinoTuristico destino : destinos) {
             if (destino.getPais().getCodigo() == codigoPais) {
                 System.out.println(destino);
                 encontrado = true;
             }
         }
         if (!encontrado) {
             System.out.println("No se encontraron destinos turísticos para el país con código " + codigoPais);
         }
    }
        
		
      
	
}