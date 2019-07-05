package com.sopra.spring.ejemplo02spring.ej02;

import java.io.Serializable;

public class Chorizo implements Serializable {
	private String marca;
	
	@Override
	public String toString() {
		return "Chorizo [marca=" + marca + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
