package curs1;

//comentariu pe o singura linie


/*
 * dsada
 * comentariu pe mai multe linii
 */

// Clasele le denumim folosind conventia UpperCamelCase --> ExempluClasa (toate cuvintele incep cu litera mare)
// metode si variabile folosind lowerCamelCase --> exempluVariabila (primul cuvant are litera mica, urmatoarele mare)

public class FirstClass {

	public static void main(String[] args) {
		
		System.out.println("Test");
		
		FirstClass obiect = new FirstClass();
		obiect.greetings();

	}
	
	public void greetings() {
		
		System.out.println("Salut");
		
	}

}
