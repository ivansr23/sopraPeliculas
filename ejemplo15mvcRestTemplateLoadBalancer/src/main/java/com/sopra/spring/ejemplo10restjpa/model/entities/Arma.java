
package com.sopra.spring.ejemplo10restjpa.model.entities;

public class Arma {

	private Integer id;
	private String nombre;
	private String calibre;

	public Arma() {
		super();
	}

	public Arma(String calibre, String nombre) {
		super();
		this.calibre = calibre;
		this.nombre = nombre;
	}

	public String getCalibre() {
		return calibre;
	}

	public void setCalibre(String calibre) {
		this.calibre = calibre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
