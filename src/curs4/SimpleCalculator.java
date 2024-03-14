package curs4;

import java.util.Scanner;

/*
 * facem un program care simuleaza un basic calculator
 * avem operatiile de baza:  + (adunare); - (scadere); * (inmultire) aditional folosim si x; / (inmpartire) aditional folosim si :
 * intrebam userul numarul1, operatorul matematic, numarul2 si printam 
 * Ex: 2 + 2 = 4 
 */

public class SimpleCalculator {
	int nr1, nr2, result;
	char operator;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first numer:");
		nr1= scan.nextInt();
		System.out.println("Please enter the math opeataor:");
		operator = scan.next().charAt(0);
		System.out.println("Please enter second numer:");
		nr2= scan.nextInt();
		scan.close();
	}
	
	public void calculator() {
		askTheUser();
		if(operator=='+') {
			result = nr1 + nr2;
			//System.out.println(nr1 + " " + operator + " " + nr2 + " = " + result);
			//counter++;
			printResult();
			} else if (operator=='-') {
			result = nr1 - nr2;
			//System.out.println(nr1 + " " + operator + " " + nr2 + " = " + result);
			//counter++;
			printResult();
		} else if (operator=='*' || operator =='x') {
			result = nr1 * nr2;
			//System.out.println(nr1 + " " + operator + " " + nr2 + " = " + result);
			//counter++;
			printResult();
		} else if (operator=='/' || operator ==':') {
			result = nr1 / nr2;
			//System.out.println(nr1 + " " + operator + " " + nr2 + " = " + result);
			//counter++;
			printResult();
		} else {
			System.out.println("Unknown operator");
		}
		
	//	if(counter != 0);
		//System.out.println(nr1 + " " + operator + " " + nr2 + " = " + result);
	}
	
	public void printResult() {
		System.out.println(nr1 + " " + operator + " " + nr2 + " = " + result);
	}
	
}
