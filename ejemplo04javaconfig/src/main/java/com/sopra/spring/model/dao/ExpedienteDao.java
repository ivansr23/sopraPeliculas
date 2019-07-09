package com.sopra.spring.model.dao;

import java.util.List;

import com.sopra.spring.model.entities.Expediente;

public class ExpedienteDao {
	private List<Expediente> expedientes;
	
	
	@Override
	public String toString() {
		return "ExpedienteDao [expedientes=" + expedientes + "]";
	}

	public List<Expediente> getExpedientes() {
		return expedientes;
	}

	public void setExpedientes(List<Expediente> expedientes) {
		this.expedientes = expedientes;
	}

	public boolean addExpediente(Expediente expediente) {
		return expedientes.add(expediente);
	}
	
	public List<Expediente> list(){
		return expedientes;
	}
	
}
