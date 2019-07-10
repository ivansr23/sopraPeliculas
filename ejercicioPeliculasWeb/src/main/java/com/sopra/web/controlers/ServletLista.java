package com.sopra.web.controlers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.sopra.peliculas.dao.PeliculasDAOImpl;
import com.sopra.peliculas.model.bussines.GestorPeliculas;

/**
 * Servlet implementation class MyLittleServlet
 */
@WebServlet({ "/morcilla", "/pimiento", "/ketchup" })
public class ServletLista extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static GestorPeliculas gestionDePeliculas = new GestorPeliculas();
	public static PeliculasDAOImpl peliculasDao;
	private static ApplicationContext context;

	@Override
	public void init() throws ServletException {
		this.context = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletLista() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Auto-generated method stub
		HttpSession session = request.getSession();

		gestionDePeliculas = context.getBean(GestorPeliculas.class);
		request.setAttribute("listaDePeliculas", "Lista de pelicula ->" + gestionDePeliculas.listaPeliculas() + "\n");
		getServletContext().getRequestDispatcher("/WEB-INF/jsps/listapeliculas.jsp").forward(request, response);

	}

}
