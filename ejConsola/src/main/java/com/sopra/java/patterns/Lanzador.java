package com.sopra.java.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sopra.java.patterns.model.bussines.GestionAulas;
import com.sopra.java.patterns.model.bussines.GestionLogs;
import com.sopra.java.patterns.model.entities.Aula;
import com.sopra.java.patterns.model.entities.LineaDeLog;

public class Lanzador {
	public static void main(String[] args) {
		
		GestionAulas gestionAulas = new GestionAulas();
		gestionAulas.crearAula("Kepler", true, true, 16);
		List<Aula> aulas = gestionAulas.dameAulas(Arrays.asList("Kepler"));
		System.out.println(aulas);
		GestionLogs gestionLogs = new GestionLogs();
		ArrayList<LineaDeLog> logs= (ArrayList<LineaDeLog>) gestionLogs.getLog();
		for (int i = 0; i < logs.size(); i++) {
			LineaDeLog log= logs.get(i);
			System.out.println(log.getMensaje());
		}
	}
}
