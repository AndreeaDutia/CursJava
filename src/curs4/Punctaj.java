package curs4;

import java.util.Scanner;

/*
 Scriem un program care intreaba utilizatorul un punctaj.
u Daca utilizatorul introduce o valoare mai mare sau egala cu 90 ii atribuim FB
u Daca utilizatorul introduce o valoare mai mare sau egala cu 80 ii atribuim B
u Daca utilizatorul introduce o valoare mai mica decat 80 ii atribuim S
u Daca a luat calificativ FB printam : “Ai primit : FoarteBine”
u Daca a luat calificativ FB printam : “Ai primit : Bine”
u Daca a luat calificativ FB printam : “Ai primit : Suficient”
 */

public class Punctaj {
	int Punctaj;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti punctajul: ");
		Punctaj= scan.nextInt();
		scan.close();
	}
	
	public void calculatorPunctaj() {
		askTheUser();
		if(Punctaj >= 90) {
			System.out.println("Ai primit : FoarteBine");
		} else if (Punctaj >= 80) {
			System.out.println("Ai primit : Bine");
		} else if (Punctaj < 80 && Punctaj > 0 ) {
			System.out.println("Ai primit : Suficient");
		} else {
			System.out.println("Punctaj invalid");
		} 
		String print = Punctaj >= 90 ? "Ai primit : FoarteBine" : Punctaj >= 80 ? "Ai primit : Bine" : (Punctaj < 80 && Punctaj > 0) ? "Ai primit : Suficient" : "Punctaj invalid" ;
		System.out.println(print);
	
}}
