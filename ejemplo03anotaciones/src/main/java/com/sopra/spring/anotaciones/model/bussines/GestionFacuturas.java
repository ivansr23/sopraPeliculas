package com.sopra.spring.anotaciones.model.bussines;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sopra.spring.anotaciones.model.dao.FacturasDao;
import com.sopra.spring.anotaciones.model.entities.Factura;

public class GestionFacuturas {
	@Autowired
	private FacturasDao facturasDao;
	
	public boolean guardarFactura(Factura factura) {
		return facturasDao.addFactura(factura);
	}
	public List<Factura> dameFacturas(){
		return facturasDao.getListaDeFacturas();
	}
	public FacturasDao getFacturasDao() {
		return facturasDao;
	}

	public void setFacturasDao(FacturasDao facturasDao) {
		this.facturasDao = facturasDao;
	}
	
}
