package com.sopra.spring.ejemplo02spring.ej03;

public class Licor {
	private String nombre;
	private String graduacion;
	
	@Override
	public String toString() {
		return "Nombre " + nombre + ", grados del alcohol" + graduacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGraduacion() {
		return graduacion;
	}

	public void setGraduacion(String graduacion) {
		this.graduacion = graduacion;
	}
	
	
}
