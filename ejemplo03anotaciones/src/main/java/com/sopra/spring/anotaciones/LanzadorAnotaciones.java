package com.sopra.spring.anotaciones;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sopra.spring.anotaciones.model.bussines.GestionFacuturas;
import com.sopra.spring.anotaciones.model.entities.Factura;

public class LanzadorAnotaciones {
	private static ApplicationContext context;
	static {
		context = new ClassPathXmlApplicationContext("bean.xml");
	}
	public static void main(String[] args) {
		Factura factura = context.getBean(Factura.class);
		factura.setCodigoFactura("kalsmdlkmaB12");
		factura.setValorTotal(new BigDecimal(1000));
		GestionFacuturas gestor = context.getBean(GestionFacuturas.class);
		gestor.guardarFactura(factura);
		System.out.println(gestor.dameFacturas());
	}

}
