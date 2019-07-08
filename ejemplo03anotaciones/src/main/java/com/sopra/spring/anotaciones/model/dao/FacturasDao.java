package com.sopra.spring.anotaciones.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.sopra.spring.anotaciones.model.entities.Factura;
@Repository
public class FacturasDao {
	@Autowired
	@Qualifier("facturas")
	private List<Factura> listaDeFacturas;
	
	public List<Factura> getListaDeFacturas() {
		return listaDeFacturas;
	}
	public void setListaDeFacturas(List<Factura> listaDeFacturas) {
		this.listaDeFacturas = listaDeFacturas;
	}
	public boolean addFactura(Factura factura) {
		return listaDeFacturas.add(factura);	
	}
	public List<Factura> getFactura(){
		return listaDeFacturas;
	}
}
