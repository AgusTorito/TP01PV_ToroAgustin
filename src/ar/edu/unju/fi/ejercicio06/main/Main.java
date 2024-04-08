package ar.edu.unju.fi.ejercicio06.main;

import ar.edu.unju.fi.ejercicio06.model.Persona;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dia/mes/año");
        Persona persona1 = new Persona();
        Persona persona2;
        Persona persona3;

        System.out.println("Ingrese los datos de la primera persona:");
        persona1.mostrarDatos();

        System.out.println("Ingrese los datos de la segunda persona:");
        System.out.print("DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Fecha de nacimiento (dia/mes/año): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine(), formatter);
        System.out.print("Provincia: ");
        String provincia = scanner.nextLine();

        persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);
        persona2.mostrarDatos();

        System.out.println("Ingrese los datos de la tercera persona:");
        System.out.print("DNI: ");
        dni = scanner.nextLine();
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Fecha de nacimiento (dia/mes/año): ");
        fechaNacimiento = LocalDate.parse(scanner.nextLine(), formatter);

        persona3 = new Persona(dni, nombre, fechaNacimiento);
        persona3.mostrarDatos();
    }
}