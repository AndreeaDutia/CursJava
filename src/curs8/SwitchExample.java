package curs8;

import java.util.Scanner;

/*
 * intrebam userul un calificativ 
 * in functie de raspuns, printam urmatoarele:
 * A --> Felicitari!
 * B --> Destul de bine!
 * C --> Suficient!
 * D --> Insuficient!
 * Pentru orice alt calificativ, printam: calificativ invalid!
 * 
 */

public class SwitchExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu un calificativ:");
		String calificativ = scan.next().toUpperCase();

		//if-else
		if (calificativ.equals("A") ||calificativ.equals("a")  ) {
			System.out.println("Felicitari!");
		}else if (calificativ.equals("B"))	{
			System.out.println("Destul de bine!");
		}else if (calificativ.equals("C"))	{
			System.out.println("Suficient!");
	}else if (calificativ.equals("D"))	{
		System.out.println("Insuficient!");
	}else {
		System.out.println("Calificativ invalid!");
	}
		
		System.out.println("______________________________________");
		//switch
	switch(calificativ) {
		case "A" : 
			System.out.println("Felicitari!");
			break;
		case "B" :
			System.out.println("Destul de bine!");
			break;
		case "C" :
			System.out.println("Suficient!");
			break;
		case "D" :
			System.out.println("Insuficient!");
			break;
		default :
			System.out.println("Calificativ invalid!");
			break;
		}
	
	System.out.println("______________________________________");
	
	//enhanced switch
	switch (calificativ) {
	case "A" -> System.out.println("Felicitari!");
	case "B" -> System.out.println("Destul de bine!");
	case "C" -> System.out.println("Suficient!");
	case "D" -> System.out.println("Insuficient!");
	default -> System.out.println("Calificativ invalid!");
	}
	
	
	}
}