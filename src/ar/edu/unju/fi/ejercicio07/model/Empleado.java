package ar.edu.unju.fi.ejercicio07.model;

public class Empleado {
    private String nombre;
    private int legajo;
    private double salario;

    public static final double SALARIO_MINIMO = 210_000.00;
    public static final double AUMENTO_MEritos = 20_000.00;

    public Empleado(String nombre, int legajo, double salario) {
        this.nombre = nombre;
        this.legajo = legajo;
        if (salario >= SALARIO_MINIMO) {
            this.salario = salario;
        } else {
            this.salario = SALARIO_MINIMO;
        }
    }

    public void mostrarDatos() {
        System.out.printf("Nombre del empleado: %s%n", nombre);
        System.out.printf("Legajo: %d%n", legajo);
        System.out.printf("Salario $: %.2f%n", salario);
    }

    public void darAumento() {
        salario += AUMENTO_MEritos;
    }
}

