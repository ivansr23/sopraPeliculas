package com.sopra.peliculas.model.bussines;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sopra.peliculas.dao.IPeliculasDAO;
import com.sopra.peliculas.model.entities.Pelicula;

@Service
public class GestorPeliculas {
	@Autowired
	private IPeliculasDAO miDaoDePeliculas;
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
	
	public void deletePelicula(List<String> identificadores) {
		Pelicula pelicula;
		for(String identificador: identificadores) {
			pelicula = miDaoDePeliculas.readById(identificador);
			miDaoDePeliculas.delete(pelicula);
		}
	}
}
