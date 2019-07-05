package com.sopra.java.patterns;

public class MiSingleton {
	private static MiSingleton instance;
	private MiSingleton() {
		
	}
	public static MiSingleton getInstance(){
		if(instance==null) {
			instance=new MiSingleton();
		}
		return instance;
	}
}
