package com.sopra.peliculas.model.entities;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;





public class Pelicula {
	

	private String identificador;
	private String titulo;
	private String director;
	private String sipnosis;
	private String[] listaDeCategorias;
	public Pelicula() {
		super();
	}
	public Pelicula(String titulo, String director, String sipnosis, String[] listaDeCategorias) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.sipnosis = sipnosis;
		this.listaDeCategorias = listaDeCategorias;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificador == null) ? 0 : identificador.hashCode());
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
		Pelicula other = (Pelicula) obj;
		if (identificador == null) {
			if (other.identificador != null)
				return false;
		} else if (!identificador.equals(other.identificador))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pelicula [identificador=" + identificador + ", titulo=" + titulo + ", director=" + director
				+ ", sipnosis=" + sipnosis + ", listaDeCategorias=" + Arrays.toString(listaDeCategorias) + "]\n";
	}

	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String id) {
		this.identificador = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getSipnosis() {
		return sipnosis;
	}
	public void setSipnosis(String sipnosis) {
		this.sipnosis = sipnosis;
	}
	public String[] getListaDeCategorias() {
		return listaDeCategorias;
	}
	public void setListaDeCategorias(String[] listaDeCategorias) {
		this.listaDeCategorias = listaDeCategorias;
	}
	
	
}
