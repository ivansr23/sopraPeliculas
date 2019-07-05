package com.sopra.java.patterns.model.entities;

public class Alumno extends Persona {

	public Alumno(String nombre, String dni) {
		super(nombre, dni);
	}

	@Override
	public String identificador() {
		return "Alumno: "+this.getDni() + " "+ this.getNombre();
	}

}
