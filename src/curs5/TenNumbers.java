package curs5;

import java.util.Scanner;

/*
 * Scriem un program care intreaba utilizatorul 10 numere sub urmatoarea forma:
 * Please enter number 1:
 * Please enter number 2:
 * ---etc
 * Dupa ce utilizatorul a introdus cele zece numere calculam suma lor si o printam sub urmatoarea forma :
 * The sum of the numbers is:
 * Note:
 * Folosim instructiunea FOR
 * Inputul userului il putem citit in for
 * Calculul sumei poate fi facuta cu un operator +=
 */


public class TenNumbers {

	public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        int suma = 0;

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Please enter number " + i + ": ");
	            int numar = scanner.nextInt();
	            suma += numar;
	        }

	        System.out.println("The sum of the numbers is: " + suma);
	    }
	}
