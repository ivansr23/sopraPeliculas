package com.sopra.peliculas.model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sopra.peliculas.model.entities.Pelicula;

public interface AlmacenDePeliculas extends JpaRepository<Pelicula, Integer> {

}
