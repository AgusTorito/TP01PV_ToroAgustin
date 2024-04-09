package ar.edu.unju.fi.ejercicio07.main;

import ar.edu.unju.fi.ejercicio07.model.Empleado;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el legajo del empleado: ");
        int legajo = scanner.nextInt();

        System.out.print("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();

        Empleado empleado = new Empleado(nombre, legajo, salario);
        empleado.mostrarDatos();

        empleado.darAumento();
        System.out.println("Se le ha otorgado un aumento al empleado.");
        empleado.mostrarDatos();
    }
}
