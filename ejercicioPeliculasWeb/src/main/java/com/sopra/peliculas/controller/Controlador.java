package com.sopra.peliculas.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sopra.peliculas.model.bussines.GestorPeliculas;
import com.sopra.peliculas.model.entities.Pelicula;

@Controller
@Scope("request")
public class Controlador {
	@Autowired
	public GestorPeliculas gestionDePeliculas;
	// public PeliculasDAOImpl peliculasDao;
	// private ApplicationContext context;
	@Autowired
	private Pelicula pelicula;

	@RequestMapping("home")
	public ModelAndView verFormulario() {
		return new ModelAndView("formularioPelicula");
	}

	@RequestMapping("muestramePeli")
	public ModelAndView muestramelon(@RequestParam("titulo") String titulo, @RequestParam("director") String director,
			@RequestParam("sipnosis") String sipnosis, @RequestParam("categorias") String categorias,
			HttpServletRequest request) {
		// gestionDePeliculas = context.getBean(GestorPeliculas.class);
		String[] listaDeCategorias = categorias.split(",");
		this.pelicula.setTitulo(titulo);
		this.pelicula.setDirector(director);
		this.pelicula.setSipnosis(sipnosis);
		this.pelicula.setListaDeCategorias(listaDeCategorias);
		this.pelicula.setIdentificador(titulo + "(" + 2019 + ")");
		List<Pelicula> peliculas = new ArrayList<Pelicula>();
		peliculas.add(pelicula);
		gestionDePeliculas.altaPeliculas(peliculas);
		ModelAndView modelAndView = new ModelAndView("Pelicula");
		modelAndView.addObject("Pelicula", this.pelicula);
		return modelAndView;
	}

	@RequestMapping("/muestrameLista")
	public ModelAndView muestrameLista() {
		// gestionDePeliculas = context.getBean(GestorPeliculas.class);
		ModelAndView modelAndView = new ModelAndView("listapeliculas");
		modelAndView.addObject("listaPeliculas", gestionDePeliculas.listaPeliculas());
		return modelAndView;
	}
}
