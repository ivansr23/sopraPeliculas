package com.sopra.spring.ejemplo02spring.ej01;

public class BarDeCopas {
	private String nombre;
	private String calidadDeLaBebida;
	
	@Override
	public String toString() {
		return "BarDeCopas [nombre=" + nombre + ", calidadDeLaBebida=" + calidadDeLaBebida + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calidadDeLaBebida == null) ? 0 : calidadDeLaBebida.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		BarDeCopas other = (BarDeCopas) obj;
		if (calidadDeLaBebida == null) {
			if (other.calidadDeLaBebida != null)
				return false;
		} else if (!calidadDeLaBebida.equals(other.calidadDeLaBebida))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCalidadDeLaBebida() {
		return calidadDeLaBebida;
	}
	public void setCalidadDeLaBebida(String calidadDeLaBebida) {
		this.calidadDeLaBebida = calidadDeLaBebida;
	}
}
