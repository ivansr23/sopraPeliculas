package com.sopra.java.patterns.model.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.sopra.java.patterns.model.entities.Persona;

public class MemoryMapPersonaDAO implements IMultipleDao<Persona, String>{
	private Map<String, Persona> miMapDePersona;
	
	public MemoryMapPersonaDAO(Map<String, Persona> miMapDePersona) {
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
	public List<Persona> searchByName(String name) {
		List<Persona> lista = new ArrayList<>();
		for(Persona persona : miMapDePersona.values()) {
			if(persona.getNombre().equals(name)) {
				lista.add(persona);
			}
		}
		return null;
	}

	@Override
	public Persona searchById(String id) {
		return miMapDePersona.get(id);
	}

}
