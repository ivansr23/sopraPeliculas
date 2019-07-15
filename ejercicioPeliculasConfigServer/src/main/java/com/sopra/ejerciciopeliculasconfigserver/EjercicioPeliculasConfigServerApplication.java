package com.sopra.ejerciciopeliculasconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EjercicioPeliculasConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPeliculasConfigServerApplication.class, args);
	}

}
