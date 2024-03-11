package curs3;

import java.util.Scanner;

/*
 * program care intreaba utilizatorul ce zi este astazi.
 * Daca introduce zero – printam "Te rog sa introduci un numar mai mare ca 0"
 * Daca introduce 1 – printam "Astazi este luni"
 * Daca introuce 2 – Printam "Astazi este marti"
 * si tot asa pana duminica
 * Daca introduce un numar mai mare ca 7 printam : "Saptamana are doar 7 zile te rog sa introduci un numar valid"
 */

public class Zile {

	int zi;
	
public void askTheUserForAZi() {
	Scanner scan = new Scanner(System.in);	
	
		System.out.println("Introdu un numar de la 1 la 7: ");
		zi = scan.nextInt();
		
		scan.close();
	}
	
public void checkZi() {
	askTheUserForAZi();
	if (zi == 0) {
		System.out.println("Te rog sa introduci un numar mai mare ca 0");
	}  else if (zi == 1 ) {
		System.out.println("Astazi este luni");
	} else if (zi == 2) {
		System.out.println("Astazi este marti");
	} else if (zi == 3) {
		System.out.println("Astazi este miercuri");
	} else if (zi == 4) {
		System.out.println("Astazi este joi");
	} else if (zi == 5) {
		System.out.println("Astazi este vineri");
	} else if (zi == 6) {
		System.out.println("Astazi este sambata");
	} else if (zi == 7) {
		System.out.println("Astazi este duminica");
	} 	else {
		System.out.println("Saptamana are doar 7 zile te rog sa introduci un numar valid");
	}
	
}
}
	
		
	

