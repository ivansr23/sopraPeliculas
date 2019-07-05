package com.sopra.java.patterns.model.bussines;

import java.util.HashSet;
import java.util.Set;

import com.sopra.java.patterns.Factory;
import com.sopra.java.patterns.model.dao.IMultipleDao;
import com.sopra.java.patterns.model.entities.Alumno;
import com.sopra.java.patterns.model.entities.Persona;
import com.sopra.java.patterns.model.entities.Profesor;

public class GestionPersonas {
	private IMultipleDao<Persona, String> miDaoDePersona;
	public GestionPersonas() {
		this.miDaoDePersona=Factory.getDaoDePersona();
	}
	public void crearAlumno(String dni, String nombre) {
		miDaoDePersona.insert(new Alumno(nombre,dni));
	}
	public void crearProfesor(String dni, String nombre) {
		miDaoDePersona.insert(new Profesor(nombre,dni));
	}
	public Set<Persona> listarPersonas(){
		return new HashSet<Persona>(miDaoDePersona.list());
	}
	public Set<Profesor> listaProfesores(){
		Set<Profesor> profesores = new HashSet<>();
		for(Persona persona: miDaoDePersona.list()) {
			if(persona instanceof Profesor) {
				Profesor profesor = (Profesor) persona;
				profesores.add(profesor);
			}
		}
		return profesores;
	}
	public Set<Alumno> listaAlumno(){
		Set<Alumno> alumnos = new HashSet<>();
		for(Persona persona: miDaoDePersona.list()) {
			if(persona instanceof Profesor) {
				Alumno alumno = (Alumno) persona;
				alumnos.add(alumno);
			}
		}
		return alumnos;
	}

}
