package curs6;

import java.util.Scanner;

/*
 * Scriem un program care calculeaza suma cifrelor unui numar.
 * Numarul in primim de la tastatura.
 * Ex; Daca user-ul introduce numarul : 334
 * Suma numerelor este 10
 */

public class CalculCifreNumar {

	public static void main(String[] args) {
		
	/*	
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdceti un numar: ");
		int numar = scan.nextInt();
		
		
		int suma = 0;
        int cifra;
        while (numar != 0) {
            cifra = numar % 10; //ultima cifra a numarului
            suma += cifra;
            numar /= 10; //elimina ultima cifra
        }
        
        System.out.println("Suma cifrelor numarului este: " + suma);
	} */
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdceti un numar: ");
		int numar = scan.nextInt();
		String stringNumber = Integer.toString(numar);
		int suma = 0;
				
		for (int i = 0;  i <= stringNumber.length(); i++) {
			char cifra = stringNumber.charAt(i);
			System.out.println("Cifra numarul " + i + " este " + cifra);
			int cf = cifra - '0'; 
			suma += cf;
			System.out.println("Suma cifrelor numarului este: " + suma);
		} 
		
	}
		
}
