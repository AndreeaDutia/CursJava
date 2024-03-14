package curs3;

import java.util.Scanner;

/*
 * Program care verifica vasrta utilizatorului
 * Daca utilizatorul introduce o valoare sub 18 , printeaza "Esti minor"
 * Daca utilizatorul introduce o valoare intre 18 si 65, printeaza "Esti adult" (conditii multiple deci folosim if ((conditie 1)&&(conditie 2)))
 * Daca utilizatorul introduce o valoare peste 65 , printeaza "Esti batran"
 */

public class Varsta {
	
	int varsta;
	
	public void askTheUserForVarsta () {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ce varsta ai?");
		varsta = scan.nextInt();
		
		scan.close();
	}
	
	public void checkVarsta() {
		askTheUserForVarsta();
		
		if ( varsta >=0 && varsta <= 18  ) {
			System.out.println("Esti minor");
		} else if (varsta >=18 && varsta <= 65) {
			System.out.println("Esti adult");
		} else if (varsta > 65) {
			System.out.println("Esti batran"); 
		}else {
			System.out.println("Varsta invalida"); 
		}
	}

}
