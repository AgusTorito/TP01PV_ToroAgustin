package ar.edu.unju.fi.ejercicio06.model;

import java.time.LocalDate;

public class Persona {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String provincia;

    // Constructor por defecto
    public Persona() {
        this.dni = "";
        this.nombre = "";
        this.fechaNacimiento = LocalDate.now();
        this.provincia = "Jujuy";
    }

    // Constructor parametrizado
    public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = provincia;
    }

    // Constructor con dni, nombre y fechaNacimiento
    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = "Jujuy";
    }

    // Getters
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getProvincia() {
        return provincia;
    }

    // Calcular edad
    public int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        int edad = hoy.getYear() - fechaNacimiento.getYear();

        if (hoy.getMonthValue() < fechaNacimiento.getMonthValue() || (hoy.getMonthValue() == fechaNacimiento.getMonthValue() && hoy.getDayOfMonth() < fechaNacimiento.getDayOfMonth())) {
            edad--;
        }

        return edad;
    }

    // Verificar si es mayor de edad
    public boolean esMayorDeEdad() {
        return calcularEdad() > 18;
    }

    // Mostrar datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Provincia: " + provincia);
        System.out.println("Edad: " + calcularEdad());

        if (esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
}