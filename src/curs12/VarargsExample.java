package curs12;

public class VarargsExample {

	public static void main(String[] args) {
		printCeva("ALb", "Galben");
		printCeva("unu", "doi", "trei", "patru");
		printCeva("1","2","3","4","5");
		//JavascriptExecutor.executeScript(jsScript , element)
		//JavascriptExecutor.executeScript(jsScript , element, element2)
		
		printAltceva(123,"Bob");//0 argumente variabile
		printAltceva(123,"Bob", 300);//1 argument variabil
		printAltceva(123,"Bob", 300, 200, 4);//n argumente variabile
	}

	
/*	public static void printCeva(String a, String b) {
		System.out.println(a);
		System.out.println(b);
		
	}*/
	
	public static void printCeva(String...values) {
		//metoda accepta o lista de stringuri
		//System.out.println(values[1]);
		for(String element : values) {
			System.out.println(element);
		}
	}
	
	public static void printAltceva(int nmber, String nume, int...numbers) {
		//putem avea o singura lista, trebuie sa fie ultima dintre parametrii
	}
}
