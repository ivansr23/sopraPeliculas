package com.sopra.peliculas.dao;

import java.util.Collection;

import com.sopra.peliculas.model.entities.Pelicula;

public interface IPeliculasDAO {
	void create(Pelicula pelicula);
	
	Pelicula update(Pelicula pelicula);

	void delete(Pelicula pelicula);

	Collection<Pelicula> read();
	
	Pelicula readById(Integer id);

}
