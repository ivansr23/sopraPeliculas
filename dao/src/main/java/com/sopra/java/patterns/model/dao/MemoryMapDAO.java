package com.sopra.java.patterns.model.dao;
import java.util.Collection;
import java.util.Map;

import com.sopra.java.patterns.model.entities.Aula;


public class MemoryMapDAO implements IDao<Aula> {
	private Map<String, Aula> miMapDeAulas;
	
	public MemoryMapDAO(Map<String, Aula> miMapDeAulas) {
		super();
		this.miMapDeAulas = miMapDeAulas;
	}

	@Override
	public void insert(Aula aula) {
		miMapDeAulas.putIfAbsent(aula.getNombreAula(), aula);

	}

	@Override
	public Aula update(Aula aula) {
		miMapDeAulas.replace(aula.getNombreAula(), aula);
		return aula;
	}

	@Override
	public void delete(Aula aula) {
		miMapDeAulas.remove(aula.getNombreAula());
	}

	@Override
	public Collection<Aula> list() {
		
		return miMapDeAulas.values();
	}

	@Override
	public Aula searchByName(Aula aula) {
		
		if(miMapDeAulas.containsKey(aula.getNombreAula())) {
			return miMapDeAulas.get(aula.getNombreAula());
		}
		return null;
	}
}
