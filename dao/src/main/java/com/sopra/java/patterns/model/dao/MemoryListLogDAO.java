package com.sopra.java.patterns.model.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sopra.java.patterns.model.entities.LineaDeLog;

public class MemoryListLogDAO implements IMultipleDao<LineaDeLog, Integer> {
	private List<LineaDeLog> almacenDeLogs;
	public MemoryListLogDAO(List<LineaDeLog> almacenDeLogs) {
		super();
		this.almacenDeLogs = almacenDeLogs;
	}

	@Override
	public void insert(LineaDeLog elemento) {
		
		if(!almacenDeLogs.contains(elemento)) {
			
			almacenDeLogs.add(elemento);
			
		}
		
	}

	@Override
	public LineaDeLog update(LineaDeLog elemento) {
		if(almacenDeLogs.contains(elemento)) {
			int posicion = almacenDeLogs.indexOf(elemento);
			almacenDeLogs.add(posicion,elemento);
			return elemento;
		}
		return null;
	}

	@Override
	public void delete(LineaDeLog elemento) {
		almacenDeLogs.remove(elemento);
	}

	@Override
	public Collection<LineaDeLog> list() {
		return almacenDeLogs;
	}

	@Override
	public List<LineaDeLog> searchByName(String name) {
		List <LineaDeLog> listaDeLogs = new ArrayList<>();
		for(LineaDeLog lineaActual : almacenDeLogs) {
			if(lineaActual.getNombre().equals(name)) {
				listaDeLogs.add(lineaActual);
			}
		}
		return listaDeLogs;
	}

	@Override
	public LineaDeLog searchById(Integer id) {
		LineaDeLog log = null;
		for(int i = 0; i<almacenDeLogs.size()|| log==null ; i++) {
			if(almacenDeLogs.get(i).getId().equals(id)) {
				log= almacenDeLogs.get(i);
			}
		}
		return log;
	}

	

}
