package curs7;

import java.util.Scanner;

/*
 * Scriem un program care simuleaza validarea unui cod PIN.
* Programul primeste input de la utilizator un PIN si il compara cu un PIN default care are valoarea 2244.
*  Are trei incercari de acces
*  Atata timp cat incearca de trei ori si PIN este gresit programul va printa : "Maximum attempts reached. Card blocked"
*  Pentru fiecare incercare gresita programul printeaza : "Wrong PIN"
*  Daca PIN este valid programmul printeaza : "Acces granted"
 */

public class PinValidator {
	
	Scanner scan = new Scanner(System.in);
		int Pin;
		int PinDefault = 2244;
		int max_attempts = 3;
		int attempts =0;{
		
				
	/*	public void getPin() {
			System.out.println("Enter your PIN: ");
			 Pin = scan.nextInt();
		}
		public void CheckPin() {
			if(Pin == PinDefault) {
				System.out.println("Acces granted");
			
		}else {
			System.out.println("Wrong PIN");
			attempts++;
		}
			if (attempts == max_attempts) {
				System.out.println("Maximum attempts reached. Card blocked");
		}}*/
			while (attempts<max_attempts) {
				System.out.println("Enter your PIN: ");
				int Pin = scan.nextInt();
				
				if(Pin == PinDefault) {
				System.out.println("Acces granted");
				}else {
					System.out.println("Wrong PIN");
					attempts++;
				}
			}
			if (attempts == max_attempts) {
				System.out.println("Maximum attempts reached. Card blocked");
			}
	} 
}