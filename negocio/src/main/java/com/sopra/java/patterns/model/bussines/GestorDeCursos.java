package com.sopra.java.patterns.model.bussines;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sopra.java.patterns.model.entities.Alumno;
import com.sopra.java.patterns.model.entities.Aula;
import com.sopra.java.patterns.model.entities.Profesor;
import com.sopra.java.patterns.model.entities.Puesto;

public class GestorDeCursos {
	private GestionAulas gestorDeAulas;
	private GestionLogs gestorDeLogs;
	private GestionPersonas gestorDePersonas;
	public GestorDeCursos() {
		gestorDeAulas = new GestionAulas();
		gestorDeLogs = new GestionLogs();
		gestorDePersonas = new GestionPersonas();
	}
	public void crearCurso(String nombre, Boolean proyector, Boolean pizarra
			,Map<String, String> alumnos, String nombreProfesor, String dniProfesor) throws Exception {
		gestorDeAulas.crearAula(nombre, proyector, pizarra, alumnos.size());
		gestorDePersonas.crearProfesor(dniProfesor, nombreProfesor);
		Collection<Alumno> alumnosGuardados=almacenarAlumnos(alumnos);
		List<Aula> aulas=gestorDeAulas.dameAulas(Arrays.asList(nombre));
		
		if(aulas.size()==1) {
			Aula aula= aulas.get(0);
			Iterator<Alumno> recorrerAlumnos= alumnosGuardados.iterator();
			Iterator<Puesto> recorrerPuestos = aula.getPuestos().iterator();
			while(recorrerAlumnos.hasNext()&& recorrerPuestos.hasNext()) {
				Puesto puesto= recorrerPuestos.next();
				puesto.setPersona(recorrerAlumnos.next());
			}
			Set<Profesor> listaProfesores= gestorDePersonas.listaProfesores();
			Profesor profesorQueBusco = new Profesor(null,dniProfesor);
			for(Profesor profe: listaProfesores) {
				if(profe.equals(profesorQueBusco)) {
					aula.getPuestoProfesor().setPersona(profe);
				}
			}
			
		}else {
			throw new Exception("No hay aulas");
		}
	}
	private Collection<Alumno> almacenarAlumnos(Map<String, String> alumnos) {
		for(String dni: alumnos.keySet()) {
			gestorDePersonas.crearAlumno(dni, alumnos.get(dni));
		}
		Set<Alumno> listaAlumnos = gestorDePersonas.listaAlumno();
		Collection<Alumno> misAlumnos = new HashSet<Alumno>();
		for(Alumno alumno:listaAlumnos) {
			if(alumnos.containsKey(alumno.getDni())) {
				misAlumnos.add(alumno);
			}
		}
		return misAlumnos;
	}
}
