package ar.edu.unju.fi.ejercicio05;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese un número entero dentro del rango del 1 a 9:");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero >= 1 && numero <= 9) {
                    break;
                } else {
                    System.out.println("Número fuera del rango permitido, ingrese nuevamente el valor:");
                }
            } else {
                System.out.println("El dato ingresado es incorrecto, ingrese un número entero:");
                scanner.next(); 
            }
        }
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();
	}

}
