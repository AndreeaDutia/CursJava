package curs3;

import java.util.Scanner;

/*
 * Program care verifica punctajul unui test
 * Daca valoare intre 0 si 65, atunci printeaza "Ai picat. Mai incearca"
 * Daca valoare >= 66, atunci printeaza "Felicitari. Ai trecut"
 */

public class PunctajTest {
	
	int punctaj;
	
	public void askTheUserForPunctaj () {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Introdu un punctaj:");
	punctaj = scan.nextInt();
	
	scan.close();
}

	public void checkPunctaj () {
		askTheUserForPunctaj();
		
		if ( punctaj >= 0 && punctaj <= 65  ) {
			System.out.println("Ai picat. Mai incearca");
			
		} else if (punctaj >= 66) {
			System.out.println("Felicitari, Ai trecut");
		}
		else {
			//Pentru valori negative. Putea fi facut si doar cu else if dar ar fi dat mesaj "ai trecut" si pt val < 0
			System.out.println("Punctaj invalid"); 
		}
	}


}
