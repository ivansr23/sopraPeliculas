package com.sopra.spring.ejemplo10restjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ejemplo10restJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo10restJpaApplication.class, args);
	}

}
