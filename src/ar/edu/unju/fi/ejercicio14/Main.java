package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.print("Ingrese un numero entero que este dentro del rango [3, 10]: ");
			numero = scanner.nextInt();
		
			if( numero < 3 || numero > 10 )
			{
				System.out.println("El numero ingresado no esta dentro del rango solicitado, Por favor ingrese de vuelta el numero");
			}
		
		}while(numero <= 2 || numero >= 11);
		
		int[] array = new int[numero];
		
		System.out.println("Ingrese los numeros para el array de " +numero+ " posiciones: ");
		for(int i = 0; i < numero; i++)
		{
			array[i] = scanner.nextInt();
		}
		
		int suma = 0;
		for(int i = 0; i < numero; i++)
		{
			suma += array[i];
		}
		
		System.out.print("Los valores del array son: \n");
		
		for(int i=0; i<numero; i++)
		{
			System.out.println("Posicion: " +i +"     Valor: "+array[i]);
		}
		
		System.out.print("La suma de los valores del array es: "+suma);
		
	}

}
