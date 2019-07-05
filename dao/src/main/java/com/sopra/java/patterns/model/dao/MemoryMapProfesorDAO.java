package com.sopra.java.patterns.model.dao;

import java.util.Collection;
import java.util.Map;

import com.sopra.java.patterns.model.entities.Persona;

public class MemoryMapProfesorDAO implements IDao<Persona>{
	private Map<String, Persona> miMapDePersona;
	
	public MemoryMapProfesorDAO(Map<String, Persona> miMapDePersona) {
		super();
		this.miMapDePersona = miMapDePersona;
	}

	@Override
	public void insert(Persona elemento) {
		miMapDePersona.putIfAbsent(elemento.getDni(), elemento);
		
	}

	@Override
	public Persona update(Persona elemento) {
		miMapDePersona.replace(elemento.getDni(), elemento);
		return elemento;
	}

	@Override
	public void delete(Persona elemento) {
		miMapDePersona.remove(elemento.getDni());
		
	}

	@Override
	public Collection<Persona> list() {
		return miMapDePersona.values();
	}

	@Override
	public Persona searchByName(Persona elemento) {
		if(miMapDePersona.containsKey(elemento.getDni())) {
			return miMapDePersona.get(elemento.getDni());
		}
		return null;
	}

}
