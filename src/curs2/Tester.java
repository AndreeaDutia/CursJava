package curs2;

public class Tester {
	
	
	String nume = "Ion";
	int varsta = 33;
	
	public void afiseazaDetaliiTester () {
		
		System.out.println("Numele testerului este " + nume + " si are varsta " + varsta);
		
	}
	
	//constructor
	public Tester () {
		
	}
	
	public Tester (String name, int age) {
		nume = name;
		varsta = age;
	}

}
