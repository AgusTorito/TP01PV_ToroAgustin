package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Pais> paises = new ArrayList();
		
		paises.add(new Pais("1" ,"Argentina"));
		paises.add(new Pais("2" ,"Brasil"));
		
		List<DestinoTuristico> destinos = new ArrayList();
		
		
		
		int opcion = 0;
		
		int op=0;
		do {
			op=menu();
			switch(op) {
			case 1:System.out.println("---- Alta del Destino Turistico ---- :");
					
					DestinoTuristico dt = crearDt();
						if(destinos.add(dt)) {
							System.out.println("Destino agregado con exito !");
						}
						else {
							System.out.println("error al agregar destino");
						}
				break;
			case 2:System.out.println("Destinos Turisticos");
					mostrarDestinosT(destinos);
				break;
			case 3:System.out.println("MODIFICAR EL PAIS DE UN DESTINO TURISTICO");
				if(modificarPaisDestino(destinos)) {
					System.out.println("Informacion modificada correctamente");
				}
				else {
					System.out.println("ERROR de modificacion");
				}
				break;
			case 4:System.out.println("Limpiar el ArrayList:");
					destinos.clear();
				break;
			case 5:System.out.println("Eliminacion de un Destino Turistico");
					if(eliminarDestino(destinos)) {
						System.out.println("Se elimino correctamente");
					}
					else {
						System.out.println("ERROR al eliminar");
					}
				break;
			case 6:System.out.println("Destinos Turisticos ordenados por nombres ");
					mostrarOrdenado(destinos);
				break;
			case 7:System.out.println("Paises");
				mostrarPaises(paises);
				break;
			case 8:System.out.println("Los destinos turisticos de un Pais");
					System.out.println("Codigo del Pais ");
					String cod = scanner.nextLine();
					destinosPorPais(destinos,cod);
				break;
			case 9:System.out.println("Saliendo del programa");
				break;
			default: System.out.println("ERROR DE OPCION");
			}
		}while(op != 9);
		
	}
	public static int menu() {
		int op=0;
		System.out.println("\n 1- Alta Destino Turistico ");
		System.out.println(" 2- Mostrar todos los Destinos turisticos ");
		System.out.println(" 3- Modificar el pais de un destino turistico ");
		System.out.println(" 4- Limpiar Arraylist de destino turisticos ");
		System.out.println(" 5- Eliminar un destino turistico ");
		System.out.println(" 6- Mostrar Destinos Turisticos Ordenados ");
		System.out.println(" 7- Mostrar todos los Paises ");
		System.out.println(" 8- Destinos turisticos de un Pais ");
		System.out.println(" 9- Salir del programa");
		op = scanner.nextInt();
		scanner.nextLine();
		return op;
	}
	
	static String codigo() {
		System.out.println("Ingrese el codigo del destino Turistico :");
		return scanner.nextLine();
	}
	static String nombre() {
		System.out.println("Ingrese el nombre del destino Turistico:");
		return scanner.nextLine();
	}
	static Float precio() {
		float p=0;
		try {
			System.out.println("Ingrese el precio: ");
			p = scanner.nextFloat();
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("Dato ingresado incorrecto");
		}
		scanner.nextLine();
		return p;
	}
	static Pais pais() {
		boolean band=false;
		String c,p="";
		do {
			System.out.println("Ingresar el codigo del Pais");
			System.out.println(" 1 - ARGENTINA");
			System.out.println(" 2 - BRASIL");
			 c = scanner.nextLine();
			if(c.equals("1")) {
				p = "argentina ";
			}
			if(c.equals("2")) {
				 p = "brasil ";
			}
			if(c.equals("1") == true || c.equals("2") == true) {
				band=true;
			}
			else {
				System.out.println("ERROR");
			}
		}while(!band);
		
		
		return new Pais(c,p);
	}
	static int dias() {
		int d=0;
		try {
			System.out.println("Ingresar los dias");
			d = scanner.nextInt();
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("Ingreso de datos incorrecto");
		}
		scanner.nextLine();
		return d;
	}
	static DestinoTuristico crearDt() {
		return new DestinoTuristico(codigo(),nombre(),precio(),pais(),dias());
	}
	static void mostrarDestinosT(List<DestinoTuristico> destinos) {
		for (DestinoTuristico destinoTuristico : destinos) {
			System.out.println("Destino Turistico: "+destinoTuristico.getNombre());
		}
	}
	
	static boolean modificarPaisDestino (List<DestinoTuristico> destinos) {
		boolean encontrado = false;
		System.out.println("Ingresar el codigo del destino Turistico:");
		String codigo = scanner.nextLine();
			for(int i=0; i< destinos.size(); i++) {
				if(codigo.equals(destinos.get(i).getCodigo())) {
					encontrado = true ;
					destinos.get(i).setPais(pais());
				}
			}
	
		return encontrado;
	}
	static boolean eliminarDestino (List<DestinoTuristico> destinos) {
		boolean encontrado = false;
		System.out.println("Ingresar el codigo del destino Turistico:");
		String codigo = scanner.nextLine();
			for(int i=0; i< destinos.size(); i++) {
				if(codigo.equals(destinos.get(i).getCodigo())) {
					encontrado = true ;
					destinos.remove(i);
				}
			}
		return encontrado;
	}
	static void mostrarOrdenado(List<DestinoTuristico> destinos) { //MUESTRA LOS APELLIDOS ORDENADOS
		Collections.sort(destinos,Comparator.comparing(DestinoTuristico::getNombre));
		for (DestinoTuristico destinoTuristico : destinos) {
			System.out.println("Destino Turistico : "+destinoTuristico.getNombre());
		}
	}
	static void mostrarPaises(List <Pais> paises) {
		for (Pais pais : paises) {
			System.out.println("Pais : "+pais.getNombre()+ " Codigo : "+pais.getCodigo());
		}
	}
	
	static void destinosPorPais(List<DestinoTuristico> destinos,String cod) {
		for(int i=0; i < destinos.size() ; i++) {
			if(cod.equals(destinos.get(i).getPais().getCodigo())) {
			System.out.println("Pais : "+destinos.get(i).getPais().getNombre()+"Destino : "+destinos.get(i).getNombre());
				
			}
		}
	}

}
