package com.sopra.web.controlers;

import java.util.HashMap;

import com.sopra.peliculas.dao.PeliculasDAOImpl;
import com.sopra.peliculas.model.entities.Pelicula;

public class Factory {
	private static PeliculasDAOImpl miMapDePeliculas;

	private Factory() {

	}

	public static PeliculasDAOImpl getDaoDeAula() {
		if (miMapDePeliculas == null) {
			miMapDePeliculas = new PeliculasDAOImpl();
			miMapDePeliculas.setMiMapDePeliculas(new HashMap<String, Pelicula>());
		}
		return miMapDePeliculas;
	}

}
