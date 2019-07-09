package com.sopra.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sopra.spring.config.SpringConfiguration;
import com.sopra.spring.model.dao.ExpedienteDao;
import com.sopra.spring.model.entities.Expediente;

public class LanzadorJavaConfig {
	private static ApplicationContext context;
	
	static {
		context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	}
	public static void main(String[] args) {
		ExpedienteDao dao = context.getBean("dao",ExpedienteDao.class);
		Expediente expediente = context.getBean(Expediente.class);
		expediente.getExamen().setNombre("Cristinaaar");
		expediente.getExamen().setNota(7);
		dao.addExpediente(expediente);
		System.out.println(dao.getExpedientes());
	}

}
