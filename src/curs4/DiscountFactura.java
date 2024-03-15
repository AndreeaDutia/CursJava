package curs4;

import java.util.Scanner;

/*
 * Program care aplica discount unei facturi
 * Daca factura este mai mare decat 100 aplica un dsicount de 10%
 * Daca factura este mai mica decat 100 aplica un discount de 5%
 * Printam rezultatul
 */

public class DiscountFactura {
	int valoareFactura;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti valoarea facturii: ");
		valoareFactura= scan.nextInt();
		scan.close();
	}
	
	public void calculator() {
		askTheUser();
		if(valoareFactura > 100) {
			System.out.println("Valoare factura dupa aplicare discount: " + (valoareFactura - (0.10 * valoareFactura)));
			} else {
			System.out.println("Valoare factura dupa aplicare discount: " + (valoareFactura - (0.05 * valoareFactura)));
		} 
		
		String print = valoareFactura > 100 ? ("Valoare factura dupa aplicare discount: " + (valoareFactura - (0.10 * valoareFactura))) : ("Valoare factura dupa aplicare discount: " + (valoareFactura - (0.05 * valoareFactura)));
		System.out.println(print);
		}
	
	
	}
