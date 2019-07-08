package com.sopra.peliculas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sopra.peliculas.model.bussines.GestorPeliculas;
import com.sopra.peliculas.model.entities.Pelicula;

public class Consola {
	private static ApplicationContext context;
	static {
		context= new ClassPathXmlApplicationContext("beans.xml");
	}
	public static void main(String[] args) {
		System.out.println("Peliculas creadas");
		String[] categorias= {"Miedo","Accion"};
		
		GestorPeliculas gestionPeliculas =context.getBean("gestorPelicula",GestorPeliculas.class);
		List<Pelicula> peliculas = context.getBean("arraysDePeliculas",ArrayList.class);
		List<Pelicula> peliculasMostrar = context.getBean("arraysDePeliculas",ArrayList.class);
		for (int i = 0; i < 10; i++) {
			Pelicula pelicula= context.getBean("pelicula",Pelicula.class);
			
			pelicula.setTitulo("Batman"+i);
			pelicula.setDirector("Ni idea");
			pelicula.setSipnosis("Murcielago con cara de humano");
			pelicula.setListaDeCategorias(categorias);
			pelicula.setIdentificador(pelicula.getTitulo()+"("+(2008+i)+")");
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
		List<String> identificadores=context.getBean("arraysDeIntegers",ArrayList.class);
		identificadores.add(peliculasMostrar.get(1).getIdentificador());
		identificadores.add(peliculasMostrar.get(2).getIdentificador());
		gestionPeliculas.deletePelicula(identificadores);
		peliculasMostrar=gestionPeliculas.listaPeliculas();
		System.out.println(peliculasMostrar);
		
	}
}
