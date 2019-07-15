package com.sopra.peliculas.ejerciciopeliculasmvcresttemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.sopra.peliculas.model.entities.Pelicula;

@Controller
public class MiControlador {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("pelicula", new Pelicula());
		return "pelicula";

	}

	@RequestMapping("/listadoDePeliculas")
	public String listadoDePeliculas(Model model) {
		String urlDelServicio = "http://mi-config-peliculas/peliculas";
		ResponseEntity<List<Pelicula>> respuestaDelServidor = restTemplate.exchange(urlDelServicio, HttpMethod.GET,
				null, new ParameterizedTypeReference<List<Pelicula>>() {
				});
		List<Pelicula> peliculas = respuestaDelServidor.getBody();
		model.addAttribute("peliculas", peliculas);
		return "peliculas";
	}

	@RequestMapping("/peliculas")
	public String altaPelicula(@RequestParam("titulo") String titulo, @RequestParam("director") String director,
			@RequestParam("sipnosis") String sipnosis, Model model) {
		String urlDelServicio = "http://mi-config-peliculas/peliculas";
		String[] listaDeCategorias = { "1", "2" };
		Pelicula pelicula = new Pelicula(titulo, director, sipnosis, listaDeCategorias);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Pelicula> entidadAEnviar = new HttpEntity<Pelicula>(pelicula, headers);
		ResponseEntity<Pelicula> entity = restTemplate.exchange(urlDelServicio, HttpMethod.POST, entidadAEnviar,
				Pelicula.class);
		Pelicula peliculaGuardada = entity.getBody();
		model.addAttribute("pelicula", peliculaGuardada);
		return "pelicula";
	}
}
