package com.sopra.web.controlers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Servlet implementation class EjemplServletSpring
 */
@WebServlet("/probando")
public class EjemploServletSpring extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationContext context;

	@Override
	public void init() throws ServletException {
		this.context = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
	}

	/**
	 * @throws IOException
	 * @throws ServletException
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("objsingleton", context.getBean("objetoSingleton"));
		request.setAttribute("objprototype", context.getBean("objetoPrototype"));
		request.setAttribute("objrequest", context.getBean("objetoRequest"));
		request.setAttribute("obsession", context.getBean("obsession"));
		getServletContext().getRequestDispatcher("/WEB-INF/jsps/saludo.jsp").forward(request, response);
		;
	}

}
