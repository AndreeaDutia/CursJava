package curs3;

import java.util.Scanner;

/*
 * Program care verfica daca un nr este par sau impar
 * Daca nr este par, atunci printeaza "Number is even!"
 * Daca nr este impar, atunci printeaza "Number is odd!"
 * Numarul il citim de la tastatura.
 */

class CheckOddOrEven {

	int numar;
	
	public void askTheUserForANumber () {
		
		System.out.println("Please enter a numer:");
		Scanner scan = new Scanner(System.in);
		numar = scan.nextInt();
	}
	
	public void checkNumberIsOddOrEven () {
		if ( numar % 2 == 0 ) {
			System.out.println("Number is even!");
			
		} else {
			System.out.println("Number is odd!");
		}
	}
	
	
	
}
