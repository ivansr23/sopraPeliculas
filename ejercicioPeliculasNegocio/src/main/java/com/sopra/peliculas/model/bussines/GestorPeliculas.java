package com.sopra.peliculas.model.bussines;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.sopra.peliculas.dao.Factory;
import com.sopra.peliculas.dao.IPeliculasDAO;
import com.sopra.peliculas.model.entities.Pelicula;

public class GestorPeliculas {
	private IPeliculasDAO miDaoDePeliculas = Factory.getDaoDeAula();
	
	public void altaPeliculas(List<Pelicula> peliculas) {
		for(Pelicula pelicula: peliculas) {
			miDaoDePeliculas.create(pelicula);
		}
				
	}
	public void updatePeliculas(List<Pelicula> peliculas) {
		for(Pelicula pelicula: peliculas) {
			miDaoDePeliculas.update(pelicula);
		}
	}
	public List<Pelicula> listaPeliculas(){
		Collection<Pelicula> read = miDaoDePeliculas.read();
		return new ArrayList<Pelicula>(read);
	}
	
	public void deletePelicula(List<Integer> identificadores) {
		Pelicula pelicula;
		for(Integer identificador: identificadores) {
			pelicula = miDaoDePeliculas.readById(identificador);
			miDaoDePeliculas.delete(pelicula);
		}
	}
}
