package com.sopra.spring.ejemplo10restjpa.model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sopra.spring.ejemplo10restjpa.model.entities.Arma;

public interface AlmacenDeArmas extends JpaRepository<Arma, Integer> {

}
