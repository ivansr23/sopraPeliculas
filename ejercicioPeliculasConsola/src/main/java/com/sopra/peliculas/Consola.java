package com.sopra.peliculas;

import java.util.ArrayList;
import java.util.List;

import com.sopra.peliculas.model.bussines.GestorPeliculas;
import com.sopra.peliculas.model.entities.Pelicula;

public class Consola {
	public static void main(String[] args) {
		System.out.println("Peliculas creadas");
		String[] categorias= {"Miedo","Accion"};
		GestorPeliculas gestionPeliculas = new GestorPeliculas();
		List<Pelicula> peliculas = new ArrayList<Pelicula>();
		List<Pelicula> peliculasMostrar = new ArrayList<Pelicula>();
		for (int i = 0; i < 10; i++) {
			Pelicula pelicula= new Pelicula("Batman"+i, "Ni idea", "Murcielago con cara de humano",categorias);
			peliculas.add(pelicula);
		}
		gestionPeliculas.altaPeliculas(peliculas);
		peliculasMostrar=gestionPeliculas.listaPeliculas();
		System.out.println(peliculasMostrar);
		System.out.println("\n");
		System.out.println("Peliculas actualizadas");
		
		peliculasMostrar.get(1).setTitulo("Spiderman");
		peliculasMostrar.get(2).setTitulo("Spiderman2");
		gestionPeliculas.updatePeliculas(peliculasMostrar);
		peliculasMostrar=gestionPeliculas.listaPeliculas();
		System.out.println(peliculasMostrar);
		System.out.println("\n");
		System.out.println("Peliculas Eliminadas");
		List<Integer> identificadores=new ArrayList<Integer>();
		identificadores.add(peliculasMostrar.get(1).getIdentificador());
		identificadores.add(peliculasMostrar.get(2).getIdentificador());
		gestionPeliculas.deletePelicula(identificadores);
		peliculasMostrar=gestionPeliculas.listaPeliculas();
		System.out.println(peliculasMostrar);
		
	}
}
