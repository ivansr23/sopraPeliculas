package com.sopra.spring.ejemplo02spring.ej03;

public class Cubata {
	private Licor licor;
	private Double volumen;
	
	@Override
	public String toString() {
		return "Cubata de" + licor + ", volumen de" + volumen + "cl";
	}
	public Licor getLicor() {
		return licor;
	}
	public void setLicor(Licor licor) {
		this.licor = licor;
	}
	public Double getVolumen() {
		return volumen;
	}
	public void setVolumen(Double volumen) {
		this.volumen = volumen;
	}
	

}
