package ar.edu.unju.fi.ejercicio12.model;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
	private String nombre;
    private Calendar fechaNacimiento;

    public Persona(String nombre, int year, int month, int day) {
        this.nombre = nombre;
        this.fechaNacimiento = new GregorianCalendar(year, month - 1, day);
    }

    public int getEdad() {
        Calendar fechaActual = new GregorianCalendar();
        int diffYear = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
            diffYear--;
        }
        return diffYear;
    }

    public String getSignoZodiaco() {
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1;
        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
        if (mes == 1 && dia >= 20 || mes == 2 && dia <= 18) {
            return "Acuario";
        } else if (mes == 2 && dia >= 19 || mes == 3 && dia <= 20) {
            return "Piscis";
        } else if (mes == 3 && dia >= 21 || mes == 4 && dia <= 19) {
            return "Aries";
        } else if (mes == 4 && dia >= 20 || mes == 5 && dia <= 20) {
            return "Tauro";
        } else if (mes == 5 && dia >= 21 || mes == 6 && dia <= 20) {
            return "Géminis";
        } else if (mes == 6 && dia >= 21 || mes == 7 && dia <= 22) {
            return "Cáncer";
        } else if (mes == 7 && dia >= 23 || mes == 8 && dia <= 22) {
            return "Leo";
        } else if (mes == 8 && dia >= 23 || mes == 9 && dia <= 22) {
            return "Virgo";
        } else if (mes == 9 && dia >= 23 || mes == 10 && dia <= 22) {
            return "Libra";
        } else if (mes == 10 && dia >= 23 || mes == 11 && dia <= 21) {
            return "Escorpio";
        } else if (mes == 11 && dia >= 22 || mes == 12 && dia <= 21) {
            return "Sagitario";
        } else {
            return "Capricornio";
        }
    }

    public String getEstacionAnio() {
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1;
        if (mes > 12 || mes <= 2) {
            return "Verano";
        } else if (mes >= 3 && mes <= 5) {
            return "Otoño";
        } else if (mes >= 6 && mes <= 9) {
            return "Invierno";
        } else {
            return "Primavera";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }
}
