package com.sopra.peliculas.dao;

import java.util.Collection;
import java.util.Map;
import com.sopra.peliculas.model.entities.Pelicula;

public class PeliculasDAOImpl implements IPeliculasDAO {
	private Map<String, Pelicula> miMapDePeliculas;
	
	public PeliculasDAOImpl(Map<String, Pelicula> miMapDePeliculas) {
		super();
		this.miMapDePeliculas = miMapDePeliculas;
	}

	public void create(Pelicula pelicula) {
		miMapDePeliculas.putIfAbsent(pelicula.getIdentificador(),pelicula);
		
	}

	public Pelicula update(Pelicula pelicula) {
		miMapDePeliculas.replace(pelicula.getIdentificador(), pelicula);
		return pelicula;
	}

	public void delete(Pelicula pelicula) {
		miMapDePeliculas.remove(pelicula.getIdentificador());
		
	}

	public Collection<Pelicula> read() {
		return miMapDePeliculas.values();
	}

	public Pelicula readById(String id) {
		if(miMapDePeliculas.containsKey(id)) {
			return miMapDePeliculas.get(id);
		}
		return null;
	}

}
