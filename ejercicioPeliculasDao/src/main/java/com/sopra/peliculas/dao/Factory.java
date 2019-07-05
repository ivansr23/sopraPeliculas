package com.sopra.peliculas.dao;

import java.util.HashMap;
import com.sopra.peliculas.model.entities.Pelicula;

public class Factory {
	private static IPeliculasDAO miMapDePeliculas;
	
	
	public static IPeliculasDAO getDaoDeAula(){
		if(miMapDePeliculas == null) {
			miMapDePeliculas = new PeliculasDAOImpl(new HashMap<Integer, Pelicula>());
		}
		return miMapDePeliculas;
	}
}
