package com.sopra.java.patterns.model.entities;

import java.util.Collection;

public class Aula {
	private Collection<Puesto> puestos;
	private Puesto puestoProfesor;
	private String NombreAula;
	private Boolean proyector;
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((NombreAula == null) ? 0 : NombreAula.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aula other = (Aula) obj;
		if (NombreAula == null) {
			if (other.NombreAula != null)
				return false;
		} else if (!NombreAula.equals(other.NombreAula))
			return false;
		return true;
	}

	public Collection<Puesto> getPuestos() {
		return puestos;
	}
	public void setPuestos(Collection<Puesto> puestos) {
		this.puestos = puestos;
	}
	
	public Puesto getPuestoProfesor() {
		return puestoProfesor;
	}
	public void setPuestoProfesor(Puesto puestoProfesor) {
		this.puestoProfesor = puestoProfesor;
	}
	public String getNombreAula() {
		return NombreAula;
	}
	public void setNombreAula(String nombreAula) {
		NombreAula = nombreAula;
	}
	public Boolean getProyector() {
		return proyector;
	}
	public void setProyector(Boolean proyector) {
		this.proyector = proyector;
	}
	public Boolean getPizarra() {
		return pizarra;
	}
	public void setPizarra(Boolean pizarra) {
		this.pizarra = pizarra;
	}
	private Boolean pizarra;
	
	
}
