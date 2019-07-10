package com.sopra.web.controlers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.sopra.peliculas.dao.PeliculasDAOImpl;
import com.sopra.peliculas.model.bussines.GestorPeliculas;
import com.sopra.peliculas.model.entities.Pelicula;

/**
 * Servlet implementation class MiControlador
 */
@WebServlet({ "/saludo", "/misHuevos" })
public class ServletInsertar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static GestorPeliculas gestionDePeliculas;
	public static PeliculasDAOImpl peliculasDao;
	private static ApplicationContext context;

	@Override
	public void init() throws ServletException {
		this.context = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletInsertar() {
		super();
		gestionDePeliculas = new GestorPeliculas();

		// TODO Auto-generated constructor stub
	}

	public GestorPeliculas getGestionPeliculas() {
		return gestionDePeliculas;
	}

	public static void setGestionPeliculas(GestorPeliculas gestionPeliculas) {
		ServletInsertar.gestionDePeliculas = gestionPeliculas;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		gestionDePeliculas = context.getBean(GestorPeliculas.class);
		String titulo = request.getParameter("titulo");
		String director = request.getParameter("director");
		String sipnosis = request.getParameter("sipnosis");
		String categorias = request.getParameter("categorias");
		String[] listaDeCategorias = categorias.split(",");
		Pelicula pelicula = context.getBean(Pelicula.class);
		pelicula.setTitulo(titulo);
		pelicula.setDirector(director);
		pelicula.setSipnosis(sipnosis);
		pelicula.setListaDeCategorias(listaDeCategorias);
		pelicula.setIdentificador(titulo + "(" + 2019 + ")");
		List<Pelicula> peliculas = new ArrayList<Pelicula>();
		peliculas.add(pelicula);
		gestionDePeliculas.altaPeliculas(peliculas);
		System.out.println(gestionDePeliculas.listaPeliculas());
		request.setAttribute("Pelicula", "pelicula ->" + pelicula);
		getServletContext().getRequestDispatcher("/WEB-INF/jsps/insertar.jsp").forward(request, response);
	}

}
