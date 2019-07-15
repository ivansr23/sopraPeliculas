package com.sopra.peliculas.model.entities;

import java.util.Arrays;

public class Pelicula {

	private Integer id;
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
	public String toString() {
		return "Pelicula [id=" + id + ", titulo=" + titulo + ", director=" + director + ", sipnosis=" + sipnosis
				+ ", listaDeCategorias=" + Arrays.toString(listaDeCategorias) + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
