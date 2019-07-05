package com.sopra.java.patterns.model.dao;


import java.util.Collection;
import java.util.Set;

import com.sopra.java.patterns.model.entities.Aula;

public class MemorySetDAO implements IDao<Aula>{

	private Set<Aula> miSet;
	
	@Override
	public void insert(Aula aula) {
		miSet.add(aula);
		
	}

	@Override
	public Aula update(Aula aula) {
		if (miSet.remove(aula)) {
			miSet.add(aula);
			return aula;
		}
		return null;
	}

	@Override
	public void delete(Aula aula) {
		miSet.remove(aula);
		
	}

	@Override
	public Collection<Aula> list() {
		return miSet;
	}

	@Override
	public Aula searchByName(Aula aula) {
		if(miSet.contains(aula)) {
			for(Aula aulaActual: miSet) {
				if(aulaActual.equals(aula)){
					return aulaActual;
				}
			}
		}
		return null;
	}
	

}
