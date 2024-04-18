package ar.edu.unju.fi.ejercicio17.main;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Jugador> jugadores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        int option;

        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Alta de jugador");
            System.out.println("2. Mostrar los datos del jugador");
            System.out.println("3. Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4. Modificar los datos de un jugador");
            System.out.println("5. Eliminar un jugador");
            System.out.println("6. Mostrar la cantidad total de jugadores que tiene el ArrayList");
            System.out.println("7. Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opción: ");

            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese una opción válida.");
                scanner.nextLine(); 
                option = -1;
                continue;
            }

            switch (option) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    scanner.nextLine(); 
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingrese la fecha de nacimiento (dd/MM/yyyy): ");
                    LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine(), formatter);
                    System.out.print("Ingrese la nacionalidad: ");
                    String nacionalidad = scanner.nextLine();
                    System.out.print("Ingrese la estatura (en metros): ");
                    double estatura = scanner.nextDouble();
                    System.out.print("Ingrese el peso (en kilogramos): ");
                    double peso = scanner.nextDouble();
                    System.out.print("Ingrese la posición (delantero, medio, defensa, arquero): ");
                    scanner.nextLine(); 
                    String posicion = scanner.nextLine();

                    Jugador newJugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
                    jugadores.add(newJugador);

                    System.out.println("El jugador fue dado de alta exitosamente.");
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del jugador: ");
                    scanner.nextLine(); 
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el apellido del jugador: ");
                    apellido = scanner.nextLine();

                    for (Jugador jugador : jugadores) {
                        if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                            System.out.println(jugador);
                            break;
                        }
                    }

                    break;  

                case 3:
                    Collections.sort(jugadores, Comparator.comparing(jugador -> jugador.getApellido()));
                    for (Jugador jugador : jugadores) {
                        System.out.println(jugador);
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el nombre del jugador: ");
                    scanner.nextLine(); 
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el apellido del jugador: ");
                    apellido = scanner.nextLine();

                    for (Jugador jugador : jugadores) {
                        if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                            System.out.print("Ingrese el nuevo nombre: ");
                            jugador.setNombre(scanner.nextLine());
                            System.out.print("Ingrese el nuevo apellido: ");
                            jugador.setApellido(scanner.nextLine());
                            System.out.print("Ingrese la nueva fecha de nacimiento (dd/MM/yyyy): ");
                            jugador.setFechaNacimiento(LocalDate.parse(scanner.nextLine(), formatter));
                            System.out.print("Ingrese la nueva nacionalidad: ");
                            jugador.setNacionalidad(scanner.nextLine());
                            System.out.print("Ingrese la nueva estatura (en metros): ");
                            jugador.setEstatura(scanner.nextDouble());
                            System.out.print("Ingrese el nuevo peso (en kilogramos): ");
                            jugador.setPeso(scanner.nextDouble());
                            System.out.print("Ingrese la nueva posición (delantero, medio, defensa, arquero): ");
                            scanner.nextLine(); 
                            jugador.setPosicion(scanner.nextLine());

                            System.out.println("Los datos del jugador fueron modificados exitosamente.");
                            break;
                        }
                    }

                    break;

                case 5:
                    System.out.print("Ingrese el nombre del jugador: ");
                    scanner.nextLine(); // Clear the buffer
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el apellido del jugador: ");
                    apellido = scanner.nextLine();

                    Iterator<Jugador> iterator = jugadores.iterator();
                    while (iterator.hasNext()) {
                        Jugador jugador = iterator.next();
                        if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                            iterator.remove();
                            System.out.println("El jugador fue eliminado exitosamente.");
                            break;
                        }
                    }

                    break;

                case 6:
                    System.out.println("La cantidad total de jugadores es: "+ jugadores.size());
                    break;

                case 7:
                	System.out.println("Ingrese la nacionalidad: ");                	
                	scanner.nextLine();

                	nacionalidad = scanner.nextLine().trim(); 
                	int count = 0;

                	for (Jugador jugador : jugadores) {
                	    if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                	        count++;
                	    }
                	}

                	System.out.println("La cantidad de jugadores que pertenecen a la nacionalidad " + nacionalidad + " es: " + count);

                	break;

                case 8:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Error: Ingrese una opción válida.");
            }
        } while (option != 8);

        scanner.close();
	}
	
}
