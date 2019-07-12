package com.sopra.peliculas.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sopra.peliculas.model.AlmacenDePeliculas;
import com.sopra.peliculas.model.entities.Pelicula;

@Configuration
public class PeliculasConfiguration {

	@Bean
	public CommandLineRunner inciarBaseDeDatos(AlmacenDePeliculas almacen) {
		return args -> {
			String[] listaDeCategorias = { "1", "2" };
			almacen.save(new Pelicula("holaa", "yo", "nada", listaDeCategorias));
			almacen.save(new Pelicula("holaa1", "yo", "nada", listaDeCategorias));
			almacen.save(new Pelicula("holaa2", "yo", "nada", listaDeCategorias));

		};
	}
}
