package curs3;

import java.util.Scanner;

/*
 * Program care citeste 3 numere de la tastatura si verifica care este cel mai mare 
 * Printeaza sub forma, ex: "Second number is the greatest"
 * Daca avem 2 numere egale si sunt cele mai mari, printam: "Equal numbers"
 */

public class GreatestOfThreeNumbers {
	
	//int nr1. nr2, nr3; ->> acelasi lucru cu ce e mai jos
	
	int nr1;
	int nr2;
	int nr3;
	
public void askTheUserFor3Numbers() {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter first number:");
	nr1 = scan.nextInt();
	
	System.out.println("Please enter second number:");
	nr2 = scan.nextInt();
	
	System.out.println("Please enter third number:");
	nr3 = scan.nextInt();
	
	scan.close();
	}

public void checkGreatestNumber() {
	askTheUserFor3Numbers();
	if (nr1 > nr2 && nr1 > nr3) {
		System.out.println("First number is the greatest");
	} else if (nr2 > nr1 && nr2 > nr3) {
		System.out.println("Second number is the greatest");
	} else if (nr3 > nr1 && nr3 > nr2) {
		System.out.println("Third number is the greatest");
	} else {
		System.out.println("Equal numbers");
	}
}

}
