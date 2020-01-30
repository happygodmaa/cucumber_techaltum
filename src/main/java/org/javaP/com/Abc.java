package org.javaP.com;

public class Abc {

	public static Abc obj = null;
	
	private Abc() {
		
	}
	
	public static Abc getInstance() {
		if(obj == null) {
			//Create object
			obj = new Abc();
		}
		return obj;
	}
	
	
	public static void main(String[] args) {
		Abc x1 = Abc.getInstance();
		Abc x2 = Abc.getInstance();
	}
}
