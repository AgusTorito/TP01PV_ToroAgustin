package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese un valor para la posición " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("\nÍndice\tValor");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "\t" + array[i]);
        }
	}

}
