package com.sopra.spring.ejemplo15mvcresttemplateloadbalancer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.sopra.spring.ejemplo10restjpa.model.entities.Arma;

@Controller
public class MiControladorChachiGuay {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("arma", new Arma());
		return "arma";

	}

	@RequestMapping("/listadoDeArmas")
	public String listadoDeArmas(Model model) {
		String urlDeAccesoAlServicio = "http://ejemplo10restJpa/armas";
		ResponseEntity<List> respuestaDelServidor = restTemplate.exchange(urlDeAccesoAlServicio, HttpMethod.GET, null,
				List.class);
		List armas = respuestaDelServidor.getBody();
		model.addAttribute("armas", armas);
		return "armas";
	}

	@RequestMapping("/peliculas")
	public String altaPelicula(@RequestParam("nombre") String nombre, @RequestParam("calibre") String calibre,
			Model model) {

		String urlDeAccesoAlServicio = "http://ejemplo10restJpa/peliculas";
		Arma arma = new Arma(calibre, nombre);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Arma> entidadAEnviar = new HttpEntity<Arma>(arma, headers);
		ResponseEntity<Arma> entity = restTemplate.exchange(urlDeAccesoAlServicio, HttpMethod.POST, entidadAEnviar,
				Arma.class);
		Arma armaAlmacenada = entity.getBody();
		model.addAttribute("arma", armaAlmacenada);
		return "arma";
	}

}
