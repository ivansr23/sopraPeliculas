package com.sopra.web.controlers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sopra.web.model.entities.Drogas;

@Controller
@Scope("request")
public class ControladorDeDrogas {
	@Autowired
	private Drogas droja;

	@RequestMapping("home")
	public ModelAndView verFormulario() {
		return new ModelAndView("formularioSpringMVC");
	}

	@RequestMapping("muestramelon")
	public ModelAndView muestramelon(@RequestParam("nombre") String nombre, @RequestParam("tipo") String tipo,
			HttpServletRequest request) {
		System.out.println(nombre);
		System.out.println(request.getParameter("nombre"));
		this.droja.setNombre(nombre);
		this.droja.setTipo(tipo);
		ModelAndView modelAndView = new ModelAndView("muestraDroja");
		modelAndView.addObject("droja", this.droja);
		return modelAndView;
	}
}
