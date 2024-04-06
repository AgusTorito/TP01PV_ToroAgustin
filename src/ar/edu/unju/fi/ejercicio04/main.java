package ar.edu.unju.fi.ejercicio04;

import java.util.Scanner;

public class main {
		public static void main(String[] args)
		{
			int numero = 0;	    
	        Scanner scanner = new Scanner(System.in);	        
	        while (true) {
	            System.out.println("Ingrese un número entero dentro del rango del 0 a 10:");
	            if (scanner.hasNextInt()) {
	                numero = scanner.nextInt();
	                if (numero >= 0 && numero <= 10) {
	                    break; 
	                } else {
	                    System.out.println("Número fuera del rango permitido, ingrese nuevamente un valor:");
	                }
	            } else {
	                System.out.println("El dato ingresado es incorrecto, vuelva a ingresar un número entero:");
	                scanner.next(); 
	            }
	        }	      
	        int factorial = 1;
	        int i = 1;
	        while (i <= numero) {
	            factorial *= i;
	            i++;
	        }	        
	        System.out.println("El factorial de " + numero + " es: " + factorial);
	        scanner.close();
		}
}
