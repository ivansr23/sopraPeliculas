package com.sopra.java.patterns.model.entities;

public class puesto_alumno {
	
	private boolean ordenador;
	private String nombre;
	
	public puesto_alumno(String nombre, boolean ordenador) {
		this.setNombre(nombre);
		this.setOrdenador(ordenador);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isOrdenador() {
		return ordenador;
	}

	public void setOrdenador(boolean ordenador) {
		this.ordenador = ordenador;
	}
}
