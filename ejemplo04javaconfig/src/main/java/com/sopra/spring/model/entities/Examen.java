package com.sopra.spring.model.entities;

public class Examen {
	private String nombre;
	private Integer nota;
	
	@Override
	public String toString() {
		return "Examen [nombre=" + nombre + ", nota=" + nota + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getNota() {
		return nota;
	}
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	
}
