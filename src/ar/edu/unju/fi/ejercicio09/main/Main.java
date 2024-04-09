package ar.edu.unju.fi.ejercicio09.main;

import ar.edu.unju.fi.ejercicio09.model.Producto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del producto 1:");
        Producto producto1 = new Producto();
        System.out.println("Nombre del Producto");
        producto1.setNombre(scanner.nextLine());
        System.out.println("Codigo del Producto");
        producto1.setCodigo(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Precio del Producto");
        producto1.setPrecio(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Descuento del Producto");
        producto1.setDescuento(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Ingrese los datos del producto 2:");
        Producto producto2 = new Producto();
        System.out.println("Nombre del Producto");
        producto2.setNombre(scanner.nextLine());
        System.out.println("Codigo del Producto");
        producto2.setCodigo(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Precio del Producto");
        producto2.setPrecio(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Descuento del Producto");
        producto2.setDescuento(scanner.nextInt());
        scanner.nextLine(); 

        System.out.println("Ingrese los datos del producto 3:");
        Producto producto3 = new Producto();
        System.out.println("Nombre del Producto");
        producto3.setNombre(scanner.nextLine());
        System.out.println("Codigo del Producto");
        producto3.setCodigo(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Precio del Producto");
        producto3.setPrecio(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Descuento del Producto");
        producto3.setDescuento(scanner.nextInt());
        scanner.nextLine(); 

        System.out.printf("%nProducto 1:%n");
        System.out.printf("Nombre: %s%n", producto1.getNombre());
        System.out.printf("Código: %d%n", producto1.getCodigo());
        System.out.printf("Precio: %.2f%n", producto1.getPrecio());
        System.out.printf("Descuento: %d%%%n", producto1.getDescuento());
        System.out.printf("Precio con descuento: %.2f%n", producto1.calcularDescuento());

        System.out.printf("%nProducto 2:%n");
        System.out.printf("Nombre: %s%n", producto2.getNombre());
        System.out.printf("Código: %d%n", producto2.getCodigo());
        System.out.printf("Precio: %.2f%n", producto2.getPrecio());
        System.out.printf("Descuento: %d%%%n", producto2.getDescuento());
        System.out.printf("Precio con descuento: %.2f%n", producto2.calcularDescuento());

        System.out.printf("%nProducto 3:%n");
        System.out.printf("Nombre: %s%n", producto3.getNombre());
        System.out.printf("Código: %d%n", producto3.getCodigo());
        System.out.printf("Precio: %.2f%n", producto3.getPrecio());
        System.out.printf("Descuento: %d%%%n", producto3.getDescuento());
        System.out.printf("Precio con descuento: %.2f%n", producto3.calcularDescuento());
	}

}
