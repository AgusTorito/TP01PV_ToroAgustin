package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("Ingrese un número entero que este en el rango [5, 10]: ");
        	num = scanner.nextInt();

        	if (num < 5 || num > 10) {
            	System.out.println("El número ingresado debe estar dentro del rango [5, 10], ingrese de vuelta el numero: ");
        	}
		}while(num <= 4 || num >= 11);
        
        String[] personas = new String[num];
        
        for (int i = 0; i < personas.length; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            personas[i] = scanner.next();
        }
       
        System.out.println("\nValores del array comenzando por el índice 0:");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("posición " + i + ": " + personas[i]);
        }
        
        System.out.println("\nContenido del array comenzando por la última posición:");
        for (int i = personas.length - 1; i >= 0; i--) {
            System.out.println("posición " + i + ": " + personas[i]);
        }
	}

}
