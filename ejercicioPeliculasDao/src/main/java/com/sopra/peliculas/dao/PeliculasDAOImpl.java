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

	public Map<String, Pelicula> getMiMapDePeliculas() {
		return miMapDePeliculas;
	}

	public void setMiMapDePeliculas(Map<String, Pelicula> miMapDePeliculas) {
		this.miMapDePeliculas = miMapDePeliculas;
	}

	@Override
	public void create(Pelicula pelicula) {
		miMapDePeliculas.putIfAbsent(pelicula.getIdentificador(), pelicula);

	}

	@Override
	public Pelicula update(Pelicula pelicula) {
		miMapDePeliculas.replace(pelicula.getIdentificador(), pelicula);
		return pelicula;
	}

	@Override
	public void delete(Pelicula pelicula) {
		miMapDePeliculas.remove(pelicula.getIdentificador());

	}

	@Override
	public Collection<Pelicula> read() {
		return miMapDePeliculas.values();
	}

	@Override
	public Pelicula readById(String id) {
		if (miMapDePeliculas.containsKey(id)) {
			return miMapDePeliculas.get(id);
		}
		return null;
	}

}
