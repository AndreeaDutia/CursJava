package curs3;

import java.util.Scanner;

/*
 * Program care citeste un numar de la tastatura si verifica daca este o zi lucratoare sau este weekend
 * Exemplu: citeste 1 --> It's a working day
 * 			citeste 7 --> It's weekend
 * 			citeste 9 --> Invalid number for the day 
 * 
 */

public class CheckWorkingDay {
	
	int zi;
	
public void askTheUserForADay() {
		
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		zi = scan.nextInt();
	}
	
public void checkDay() {
	askTheUserForADay();
	// && =--> and
	// || --> or
	
	if (zi >= 1 && zi <= 5) {
		System.out.println("It's a working day");
	} else if (zi == 6 || zi ==7) {
		System.out.println("It's weekend");
	} else {
		System.out.println("Invalid number for the day");
	}
	
}
}
