package curs4;

public class StaticVsNonStatic {
	
	static String nume; //variabila de clasa
	String prenume; //variabila de instanta

	public static void main(String[] args) {
		
		StaticVsNonStatic person1 = new StaticVsNonStatic();
		person1.nume = "Popescu";
		person1.prenume = "Ion";
		System.out.println("Person1 : " + StaticVsNonStatic.nume + " " + person1.prenume);

		StaticVsNonStatic person2 = new StaticVsNonStatic();
		person2.nume = "Ionescu";
		person2.prenume = "Oana";
		System.out.println("Person1 : " + nume + " " + person2.prenume);
		
		StaticVsNonStatic person3 = new StaticVsNonStatic();
		person3.nume = "John";
		person3.prenume = "Doe";
		System.out.println("Person1 : " + nume + " " + person3.prenume);
		
		System.out.println("----------------------------------------------");
		
		System.out.println("Person1 : " + StaticVsNonStatic.nume + " " + person1.prenume);
		System.out.println("Person1 : " + nume + " " + person2.prenume);
		System.out.println("Person1 : " + nume + " " + person3.prenume);
	}

}
