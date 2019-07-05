package com.sopra.java.patterns.model.bussines;

import java.util.ArrayList;
import java.util.List;

import com.sopra.java.patterns.Factory;
import com.sopra.java.patterns.model.dao.IMultipleDao;
import com.sopra.java.patterns.model.entities.LineaDeLog;

public class GestionLogs {
	private IMultipleDao<LineaDeLog, Integer> miDaoDeLogs= Factory.getDaoDeLog();
	
	public List<LineaDeLog> getLog() {
		List<LineaDeLog> logs = new ArrayList<>();
		logs=new ArrayList<LineaDeLog>(miDaoDeLogs.list());
		return logs;
	}
}
