package org.javaP.com;

public class SingletonPattern {

	//Cunst as private
	//write a public static method, that has return type of object of this singleton class
	//This is called lazy initialization
	private static SingletonPattern singleInstance = null;
	
	private SingletonPattern() {
		
	}
	
	
	public static SingletonPattern  getInstance() {
		if(singleInstance == null) {
			singleInstance = new SingletonPattern();
		}
		return singleInstance;
	}
	
	public static void main(String[] args) {
		SingletonPattern x1 = SingletonPattern.getInstance();
		SingletonPattern x2 = SingletonPattern.getInstance();
	}
}
