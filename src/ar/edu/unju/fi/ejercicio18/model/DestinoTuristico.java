package ar.edu.unju.fi.ejercicio18.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class DestinoTuristico {
	private String codigo;
	private String nombre;
	private float precio;
	private Pais pais;
	private int dias;
	
	public DestinoTuristico() {
		// TODO Auto-generated constructor stub
	}

	public DestinoTuristico(String codigo, String nombre, float precio, Pais pais, int dias) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.pais = pais;
		this.dias = dias;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}
	
	
	
}