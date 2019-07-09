package com.sopra.spring.model.entities;

public class Expediente {
	private Examen examen;
	
	@Override
	public String toString() {
		return "Expediente [examen=" + examen + "]";
	}

	public Examen getExamen() {
		return examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}
	
}
