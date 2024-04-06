package ar.edu.unju.fi.ejercicio03;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
       
        int numero = 0;   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");

        if (scanner.hasNextInt()) {           
            numero = scanner.nextInt();          
            if (numero % 2 != 0) {               
                int resultado = numero * 2;
                System.out.println("El número ingresado es impar, entonces su doble es: " + resultado);
            } else {               
                int resultado = numero * 3;
                System.out.println("El número ingresado es par, entonces su triple es: " + resultado);
            }
        } else {
            
            System.out.println("El dato ingresado es incorrecto, ingrese un número entero.");
        }        
        scanner.close();
    }
}


