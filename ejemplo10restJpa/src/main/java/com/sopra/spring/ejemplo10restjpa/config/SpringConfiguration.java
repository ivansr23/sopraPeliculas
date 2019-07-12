package com.sopra.spring.ejemplo10restjpa.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sopra.spring.ejemplo10restjpa.model.AlmacenDeArmas;
import com.sopra.spring.ejemplo10restjpa.model.entities.Arma;

@Configuration
public class SpringConfiguration {

	@Bean
	public CommandLineRunner inciarBaseDeDatos(AlmacenDeArmas almacen) {
		return args -> {
			almacen.save(new Arma("AK-47", "22"));
			almacen.save(new Arma("Desert Eagle", "44"));
			almacen.save(new Arma("Magnum", "De chocolate"));
		};
	}
}
