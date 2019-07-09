package com.sopra.peliculas.dao;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.sopra.peliculas.model.entities.Pelicula;
@Repository
public class PeliculasDAOImpl implements IPeliculasDAO {
	@Autowired
	@Qualifier("peliculas")
	private Map<String, Pelicula> miMapDePeliculas;
	
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
