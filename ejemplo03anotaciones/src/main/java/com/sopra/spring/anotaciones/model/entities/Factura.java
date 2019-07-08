package com.sopra.spring.anotaciones.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component(value="facturilla")
@Scope(value="prototype")
public class Factura implements Serializable{
	private String codigoFactura;
	private BigDecimal valorTotal;
	
	@Override
	public String toString() {
		return "Factura [codigoFactura=" + codigoFactura + ", valorTotal=" + valorTotal + "]";
	}
	public String getCodigoFactura() {
		return codigoFactura;
	}
	public void setCodigoFactura(String codigoFactura) {
		this.codigoFactura = codigoFactura;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
